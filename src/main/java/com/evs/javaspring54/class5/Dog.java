/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class5;

import static com.evs.javaspring54.class2.SystemPrintUtils.*;

/**
 *
 * @author ok
 */
public class Dog extends Animal {

    private String breed;

    public Dog() {
        this("Unknown");
    }

    // Agument / Nucleus 
    public Dog(String breed) {
        super("Dog");
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String sound() {
        return "Bark Bark !!! ";
    }

    @Override
    public String toString() {
        return "Dog{" + "breed=" + breed + '}' + super.toString();
    }

    public static void main(String[] args) {

        // a. Multiple Inheritance [2 parent class) = 
        // [Recommended] b. Multiple Level Inheritance (Grand Parent)
        // c. Partial Inheritance (Members or Functions)
        Dog a = new Dog("American");
        Cat b = new Cat("Persian");
        Duck c = new Duck("Arabic");

        Animal d = new Dog("American");
        Animal e = new Cat("Persian");
        Animal f = new Duck("Arabic");

        BullDog g = new BullDog();
        Dog h = new BullDog();
        Animal i = new BullDog();

        // Anonymous Classes
        Animal j = new Animal("Dinasour") {
            @Override
            public String sound() {
                return "Growwwl";
            }

            @Override
            public boolean canFly() {
                return true;
            }
        };

        Fly k = new Fly() {
            @Override
            public boolean canFly() {
                return false;
            }

            @Override
            public String toString() {
                return "Fly Anonymous class " + canFly();
            }

        };

//        println(a, b, c);
//        println(d, e, f);
        Animal[] ar = {a, b, c, d, e, f, g, h, i, j};
        for (Animal aa : ar) {
            println(aa.sound());
        }

        Fly[] fr = {a, b, c, d, e, f, g, h, i, j, k};
        for (Fly aa : fr) {
            println(aa);
        }
//        
//        Fly dog = new Dog() ;
//        dog.canFly();

        // 1. Composition
        // 2. Inheritance (Concrete Class, Interface)
        // 3. Polymorphism (Weak, Strong, Runtime, Compiletime)
        // 4. Abstraction (Anonymous Class)
        // 5.2 
        // Build an Order Placement System
        // Order = Parent
        // Breverage Order
        // Food Order
        // Replacement Order
        // VegFood Order 
        // Non-Veg Food Order
        // Output: Code, UML (Diagram)
        Order o ; 
        int mainMenu = input("1. Veg", "2.Non-Veg");
        switch ( mainMenu ) {
            case 1: 
                int sMenu = input("1. Soup", "2. Dine-in") ;
                println(sMenu) ;
                o = new VegSoup() ;
                break; 
            case 2: 
                int tMenu = input("1. Salad", "2. Drink") ;
                println(tMenu) ;
                break; 
        }

    }
    
    public static class Order {
        
    }
    
    public static class VegSoup extends Order {
        
    }

}
