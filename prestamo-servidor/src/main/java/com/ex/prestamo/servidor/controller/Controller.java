package com.ex.prestamo.servidor.controller;

import com.ex.prestamo.model.EstudioPrestamo;
import com.ex.prestamo.model.Prestamo;
import com.ex.prestamo.servidor.model.Constant;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public final class Controller {
    private ControllerSocketServer server;
    private boolean stopServer = false;
    private JTextArea logOut;
    
    public Controller(JTextArea logOut){
        this.logOut=logOut;
        try {
            this.server = new ControllerSocketServer();
            listenerConnections();
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listenerConnections(){
        new Thread(()->{
            try {
                while(!this.stopServer){
                    printLog("Esperando una conexion...",1);
                    ControllerSocketCliente cliente = this.server.accept();
                    printLog(String.format("Cliente %s conectado", cliente.getInfo()),1);
                    printLog("Recibiendo datos del prestamo...", 1);
                    Prestamo prestamo = (Prestamo) cliente.receive();
                    printLog("Haciendo el estudio del prestamo...", 1);
                    EstudioPrestamo estudio = calcularPrestamo(prestamo);
                    printLog("Enviando estudio de prestamo...", 1);
                    cliente.send(estudio);
                    printLog(String.format("Cerrando conexion con el cliente %s", cliente.getInfo()), 1);
                    cliente.close();
                }
                this.server.closeServerSocket();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
    }
    
    public EstudioPrestamo calcularPrestamo(Prestamo prestamo){
        double valorInteresMensual = Math.round(prestamo.getValorPrestamo()*(prestamo.getInteresAnual()/12/100));
        double valorCuota = Math.round((prestamo.getValorPrestamo()/prestamo.getNumeroCuotas())+valorInteresMensual);
        double valorTotalPagar = prestamo.getValorPrestamo()+(valorInteresMensual*6);
        
        return new EstudioPrestamo(prestamo, valorCuota, valorInteresMensual, valorTotalPagar);
    }

    public void stopServerSocket(){
        this.stopServer=true;
    }
    
    public void printLog(String text, int type){
        String date = LocalDateTime.now().format(Constant.DATE_TIME_FORMATTER);
        String typeMessage = type==1?"OK":"ERROR";
        String message = String.format("[%s] (%s) %s\n", typeMessage,date,text);
        this.logOut.append(message);
        this.logOut.setCaretPosition(this.logOut.getDocument().getLength());
    }
}
