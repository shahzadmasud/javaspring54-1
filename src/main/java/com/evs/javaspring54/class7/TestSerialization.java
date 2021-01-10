/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ok
 */
public class TestSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream out = null ;
//        try {
//            Student student = new Student ( 1, "shahzad") ;
//            out = new ObjectOutputStream(
//                    new FileOutputStream("e:/serial.txt")) ;
//            out.writeObject(student);
//        } finally {
//            out.close(); 
//        }

        ObjectInputStream in = null ;
        try {
            in = new ObjectInputStream(
                    new FileInputStream("e:/serial.txt")) ;
            Object obj = in.readObject();
            System.out.println(obj);
        } finally {
            in.close(); 
        }
    }
    
}
