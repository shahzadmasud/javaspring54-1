/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class8;

import java.util.Observable;
import java.util.Observer;
import static com.evs.javaspring54.class2.SystemPrintUtils.*;

/**
 *
 * @author shahzadmasud
 */
public class Student implements Observer {

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String name;
    private String email;

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", email=" + email + '}';
    }

    @Override
    public void update(Observable o, Object arg) {
        println("--This Change belongs to : "
                + ((Teacher) o).getStudentName() + "["
                + this.name
                + "]");
    }

}
