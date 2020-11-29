/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class2;

import static com.evs.javaspring54.class2.SystemPrintUtils.*;

/**
 *
 * @author ok
 */
public class TestLoop {

    public static void main(String[] args) {
        // starting, terminating, iterative

        // init = Initialisation
        // Cond = Terminating 
        // Inc = Increase, Iterative, Dec
        // Stmt = print, statement
        
        int table = 2 ;
        
        // 1.While (1%)
        int a = 0; // init 
        while (a < 10) { // cond
            println( table + " X " + (a+1) + " = "+ ((a+1)*table) );
            a++; // stmt, Inc
        }

        // 2. Do-While (4%)
        int b = 0; // init 
        do {
            println(b); // stmt
            b++; // inc
        } while (b < 10);

        // 3. For (25%)
        // for ( init; cond; inc) stmt ;
        for (int c = 0; c < 10; c++) {
            println(c);
        }

        // 4. For-each - TODO (70%)
    }

}
