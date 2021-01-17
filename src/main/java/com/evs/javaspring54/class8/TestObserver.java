/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class8;

import java.util.Observer;

/**
 *
 * @author shahzadmasud
 */
public class TestObserver {

    public static void main(String[] args) throws InterruptedException {
        // observable 
        Teacher t = new Teacher();

        // observers
        Student[] students = {
            new Student("Zia", "zia@gmail.com"),
            new Student("Amjad", "amjad@gmail.com"),
            new Student("Jasim", "jasim@gmail.com")
        };

        // bind
        for (Student o : students) {
            t.addObserver(o);
        }

        while (true) {
            t.addAssignment("T: Assignment: " + System.currentTimeMillis());
            System.out.println("========");
            t.notifyObservers();
            Thread.sleep(2000L);
        }
    }

}
