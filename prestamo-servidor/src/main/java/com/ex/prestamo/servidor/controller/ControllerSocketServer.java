package com.ex.prestamo.servidor.controller;

import com.ex.prestamo.servidor.model.Constant;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ControllerSocketServer {
    private ServerSocket socket;
    
    public ControllerSocketServer() throws IOException{
        this.socket = new ServerSocket(Constant.PORT);
    }
    
    public ControllerSocketCliente accept() throws IOException{
        Socket socket = this.socket.accept();
        return new ControllerSocketCliente(socket);
    }
    
    public void closeServerSocket() throws IOException{
        this.socket.close();
    }
}
