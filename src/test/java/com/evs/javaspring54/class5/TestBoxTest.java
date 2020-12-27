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
public class TestBoxTest {
    
    public TestBoxTest() {
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
     * Test of unbox method, of class TestBox.
     */
    @Test
    public void testUnbox() {
        System.out.println("unbox");
        Integer i = 0;
        int expResult = 0;
        int result = TestBox.unbox(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of box method, of class TestBox.
     */
    @Test
    public void testBox() {
        System.out.println("box");
        int i = 0;
        Integer expResult = 0;
        Integer result = TestBox.box(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
