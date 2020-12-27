/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class6;

import java.io.BufferedInputStream;
import java.io.InputStream;
import static com.evs.javaspring54.class2.SystemPrintUtils.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ok
 */
public class TestStream {

    public static void main(String[] args) {

        // InputStream
        // int read () ; // single byte 
        // int read ( byte[]) ; // array read 
        // int read ( byte[], int offset, int length) ; // offset base read
        //
        // OutputStream
        // void write(byte a) ; // single
        // void write(byte[]) ; // array write
        // void write (byte[], int offset, int length) ; // offset base write
        // Gen-1
//        InputStream keyboard = new BufferedInputStream(System.in) ;
//        try {
//            // evaluate 
//            byte[] b = new byte[1024] ;
//            print(">>") ;
//            int readBytes = keyboard.read(b) ;
//            String s = new String(b, 0, readBytes ) ;
//            println(s) ;    
//        } catch (IOException | NumberFormatException e) { // checked exception
//            // error
////            e.printStackTrace(); 
//            System.err.println(e.getMessage());
//        } catch (Exception e ) {// unchecked
//            e.printStackTrace();
//        } finally {
//            try {
//                // Execute in all
//                keyboard.close();
//            } catch (IOException ex) {
//            }
//        }
//        // Gen=2
//        Reader keyboard = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            // evaluate 
//            char[] b = new char[1024];
//            print(">>");
//            int readBytes = keyboard.read(b);
//            String s = new String(b, 0, readBytes);
//            println(s);
//        } catch (IOException | NumberFormatException e) { // checked exception
//            // error
//            System.err.println(e.getMessage());
//        } catch (Exception e) {// unchecked
//            e.printStackTrace();
//        } finally {
//            try {
//                // Execute in all
//                keyboard.close();
//            } catch (IOException ex) {
//            }
//        }
        // Gen-3
        Scanner keyboard = new Scanner(System.in);
        println("-->" + keyboard.next());

        int opt = input("1.char", "2.byte");

    }
}
