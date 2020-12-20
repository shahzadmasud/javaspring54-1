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
public class Duck extends Animal {

    private String breed;

    public Duck() {
        this("Unknown");
    }

    // Agument / Nucleus 
    public Duck(String breed) {
        super("Duck");
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Duck{" + "breed=" + breed + '}' + super.toString() ;
    }

    @Override
    public String sound() {
        return "Quak Quak !!! ";
    }

    @Override
    public boolean canFly() {
        return true;
    }

}
