/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class8;

import com.evs.javaspring54.class7.*;
import java.net.Socket;
import static com.evs.javaspring54.class2.SystemPrintUtils.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author ok
 */
public class ChatClient {

    public static void main(String[] args) {
        try {
            // a. Connection to Server
            Socket server = new Socket("127.0.0.1", 8888);
            println("---> Connected to Server: " + server);

            // b. Keyboard, Input, Output from Server
            InputStream keyboard
                    = new BufferedInputStream(System.in);
            OutputStream serverOut
                    = new BufferedOutputStream(server.getOutputStream());
            InputStream serverIn
                    = new BufferedInputStream(server.getInputStream());

            // c. Read/Write
            byte[] b = new byte[1024];
            while (true) {
                // c.1 = Read from Keyboard
                System.out.print(">>");
                int readBytes = keyboard.read(b);

                // c.2 Write to Server 
                serverOut.write(b, 0, readBytes);
                serverOut.flush();

                // c.3 Read from Server
                readBytes = serverIn.read(b);
                println("--(Server" + server.getLocalPort() + ")--"
                        + "[" + now() + "] => "
                        + new String(b, 0, readBytes));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Convert to NIO
}
