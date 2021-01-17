/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class8;

import java.util.Observable;

/**
 *
 * @author shahzadmasud
 */
public class Teacher extends Observable {

    private String studentName = "Default";

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void addAssignment(String studentName) {
        if (studentName.equals(this.studentName) == false) {
            setStudentName(studentName);
            setChanged();
            notifyObservers();
        }
    }

}
