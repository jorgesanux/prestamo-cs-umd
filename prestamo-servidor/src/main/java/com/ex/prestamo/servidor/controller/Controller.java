package com.ex.prestamo.servidor.controller;

import com.ex.prestamo.model.EstudioPrestamo;
import com.ex.prestamo.model.Prestamo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Controller {
    private ControllerSocketServer server;
    private boolean stopServer = false;
    
    public Controller(){
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
                    System.out.println("Esperando lciente");
                    ControllerSocketCliente cliente = this.server.accept();
                    System.out.println("Cliente conectado");
                    Prestamo prestamo = (Prestamo) cliente.receive();
                    EstudioPrestamo estudio = calcularPrestamo(prestamo);
                    cliente.send(estudio);
                }
                this.server.closeServerSocket();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                try {
                    this.server.closeServerSocket();
                } catch (IOException ex1) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
        }).start();
    }
    
    public EstudioPrestamo calcularPrestamo(Prestamo prestamo){
        return new EstudioPrestamo(prestamo, 0, 0, 0);
    }

    public void stopServerSocket(){
        this.stopServer=true;
    }
}
