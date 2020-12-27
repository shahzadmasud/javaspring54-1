/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ok
 */
public class DogTest {
    
    public DogTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBreed method, of class Dog.
     */
    @org.junit.Test
    public void testGetBreed() {
        System.out.println("getBreed");
        Dog instance = new Dog();
        String expResult = "Unknown";
        String result = instance.getBreed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBreed method, of class Dog.
     */
    @org.junit.Test
    public void testSetBreed() {
        System.out.println("setBreed");
        String breed = "Dog";
        Dog instance = new Dog();
        instance.setBreed(breed);
        assertEquals(breed, instance.getBreed());
    }

    /**
     * Test of sound method, of class Dog.
     */
    @org.junit.Test
    public void testSound() {
        System.out.println("sound");
        Dog dog = new Dog();
        String expResult = "Bark Bark !!! ";
        String result = dog.sound();
        assertEquals(expResult, result);
    }    
}
