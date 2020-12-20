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
public class Cat extends Animal {

    private String breed;

    public Cat() {
        this("Unknown");
    }

    // Agument / Nucleus 
    public Cat(String breed) {
        super("Cat");
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" + "breed=" + breed + '}' + super.toString();
    }
    
    @Override
    public String sound() {
        return "Meeoowwww  !!! " ;
    }

}
