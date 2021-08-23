package com.ex.prestamo.cliente.controller;

import com.ex.prestamo.model.EstudioPrestamo;
import com.ex.prestamo.model.Prestamo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Controller {  
    public void calcularPrestamo(String nombre, double sueldo, double valorPrestamo, int numeroCuotas, float interesAnual){
        try {
            Prestamo prestamo = new Prestamo(nombre,sueldo,valorPrestamo,numeroCuotas,interesAnual);
            ControllerSocket socket = new ControllerSocket();
            
            socket.send(prestamo);
            EstudioPrestamo estudioPrestamo = (EstudioPrestamo) socket.receive();
            String message = String.format("Valor ttoal prestamo: $%.0f\n"
                    + "Cantidad Cuotas: %d\n"
                    + "Valor cuota: $%.0f\n"
                    + "Interes mensual: $%.2f\n"
                    + "Interes anual: %.2f%%", 
                    estudioPrestamo.getTotalPagar(),
                    estudioPrestamo.getPrestamo().getNumeroCuotas(),
                    estudioPrestamo.getValorCuota(),
                    estudioPrestamo.getValorInteresMensual(),
                    estudioPrestamo.getPrestamo().getInteresAnual());
            
            JOptionPane.showMessageDialog(null,message,"Resultado de la solicitud del prestamo",JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,ex.getLocalizedMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
