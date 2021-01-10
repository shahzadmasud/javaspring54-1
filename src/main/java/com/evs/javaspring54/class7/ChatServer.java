/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class7;

import java.net.ServerSocket;
import static com.evs.javaspring54.class2.SystemPrintUtils.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author ok
 */
public class ChatServer {

    public static void main(String[] args) {
        try {
            // a. Start a server socket
            ServerSocket server = new ServerSocket(8888);
            println("---> Server is up : " + server);

            // b. Listen for new client
            Socket client = server.accept();
            println("---> New Client: " + client);

            // c. Create Input/output variables
            InputStream clientIn
                    = new BufferedInputStream(client.getInputStream());
            OutputStream clientOut
                    = new BufferedOutputStream(client.getOutputStream());

            // d. Read Write 
            byte[] b = new byte[1024];
            while (true) {
                // d.1 Read 
                int readBytes = clientIn.read(b);
                println("--(Client)--"
                        + "[" + now() + "] => "
                        + new String(b, 0, readBytes));
                
                // d.2 Write 
                clientOut.write(b, 0, readBytes);
                clientOut.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
