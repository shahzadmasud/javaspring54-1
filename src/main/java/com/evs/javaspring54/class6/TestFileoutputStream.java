/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.evs.javaspring54.class2.SystemPrintUtils.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.util.Scanner;

/**
 *
 * @author ok
 */
public class TestFileoutputStream {

    public static void main(String[] args) {

        File file = new File("e:/abc.txt");
//        OutputStream fos = null ;
//        try {
//            // Write
//            fos = new FileOutputStream(file, true) ;
//            fos.write("This is my file for spring 54-1 class. ".getBytes());
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(TestFileoutputStream.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(TestFileoutputStream.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            if ( fos != null ) {
//                try {
//                    fos.close() ;
//                } catch (IOException ex) {
//                    Logger.getLogger(TestFileoutputStream.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }

        // Read 
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(file);

            // Gen-1
            byte[] b = new byte[1024];
            int readBytes = fin.read(b);
            String s = new String(b, 0, readBytes);
            println("Gen-1: " + s);

            // Gen-2
            Reader fr = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            char[] c = new char[1024];
            readBytes = fr.read(c);
            String sc = new String(c, 0, readBytes);
            println("Gen-2: " + sc);
            
            // Gen-3 
            Scanner scan = new Scanner(file) ;
            println("Gen-3: " + scan.nextLine()) ;
            
            // Gen-4 
            RandomAccessFile raf = new RandomAccessFile(file, "rwd") ;
            println("Gen-4: " + raf.readLine() ) ;
            raf.close() ;

        } catch (Exception e) {
            e.printStackTrace(); 
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException ex) {
                    Logger.getLogger(TestFileoutputStream.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

}
