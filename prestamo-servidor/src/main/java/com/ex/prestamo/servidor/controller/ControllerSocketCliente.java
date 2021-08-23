package com.ex.prestamo.servidor.controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ControllerSocketCliente {
    private final Socket socket;
    private final ObjectInputStream ois;
    private final ObjectOutputStream oos;
    
    public ControllerSocketCliente(Socket socket) throws IOException{
        this.socket = socket;
        this.oos = new ObjectOutputStream(this.socket.getOutputStream());
        this.ois = new ObjectInputStream(this.socket.getInputStream());
    }
    
    public Object receive() throws IOException, ClassNotFoundException{
        return this.ois.readObject();
    }
    
    public void send(Object obj) throws IOException{
        this.oos.writeObject(obj);
    }
    
    public void close() throws IOException{
        this.socket.close();
    }
}
