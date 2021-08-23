package com.ex.prestamo.cliente.controller;

import com.ex.prestamo.model.EstudioPrestamo;
import com.ex.prestamo.model.Prestamo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {  
    public void calcularPrestamo(String nombre, double sueldo, double valorPrestamo, int numeroCuotas, float interesAnual){
        Prestamo prestamo = new Prestamo(nombre,sueldo,valorPrestamo,numeroCuotas,interesAnual);
        try {
            ControllerSocket socket = new ControllerSocket();
            
            socket.send(prestamo);
            EstudioPrestamo estudioPrestamo = (EstudioPrestamo) socket.receive();
            System.out.println(estudioPrestamo);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
