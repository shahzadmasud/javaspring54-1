/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class8;

import static com.evs.javaspring54.class2.SystemPrintUtils.*;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shahzadmasud
 */
public class TryThread extends Thread {

    private String lastName;
    private String firstName;
    private Long sleep;

    public TryThread(String lastName, String firstName, Long sleep) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.sleep = sleep;
        setName(firstName + ":" + lastName);
    }

    public TryThread(String lastName, String firstName) {
        this(lastName, firstName, 3000L);
    }

    @Override
    public void run() {
        while (true) {
            println(lastName);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException ex) {
                Logger.getLogger(TryThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            println(firstName);
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        Thread one = new TryThread("One", "1", 1000L);
//        Thread two = new TryThread("two", "2", 2000L);
//        Thread three = new TryThread("three", "3", 3000L);
//        
//        one.start();
//        two.start();
//        three.start();

        for (int i = 0; i < 10; i++) {
//            UUID id = UUID.randomUUID().toString() ;
            Thread t = new TryThread(UUID.randomUUID().toString(), String.valueOf(i), 1000L * (i + 1));
            t.start();
            Thread.sleep(3000L);
        }
    }

}
