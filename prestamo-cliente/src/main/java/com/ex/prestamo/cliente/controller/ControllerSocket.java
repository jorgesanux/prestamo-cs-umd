package com.ex.prestamo.cliente.controller;

import com.ex.prestamo.cliente.model.Constant;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ControllerSocket {
    private final Socket socket;
    private final ObjectInputStream ois;
    private final ObjectOutputStream oos;
    
    public ControllerSocket() throws IOException{
        this.socket = new Socket(Constant.HOST,Constant.PORT);
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
