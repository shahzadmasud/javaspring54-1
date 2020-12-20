/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class5;

/**
 *
 * @author ok
 */
public abstract class Animal implements Fly {

    private String type;

//    public Animal() {
//
//    }
    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract String sound() ;
//    {
//        return "Unknown";
//    }

    @Override
    public String toString() {
        return "Animal{" + "type=" + type + '}' + (canFly() ? "-Fly-" : "");
    }

    @Override
    public boolean canFly() {
        return false;
    }

}
