/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class2;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.isLowerCase;
import static com.evs.javaspring54.class2.SystemPrintUtils.*;

/**
 *
 * @author ok
 */
public class TestLetter {

    public static void main(String[] args) {
//        Character a = 'A';
////        if (a > 64 && a < 92) { // Upper Case
//        if (isUpperCase(a)) {
//            println("Upper Case");
////        } else if (a > 92 && a < 127) { // Lower Case
//        } else if (isLowerCase(a)) {
//            println("Lower Case");
//        } else {
//            println("Other");
//        }
//
//        Boolean b;
//        Short c;
//        Character d;
//        Integer e;
//        Byte f;
//        Float g;
//        Double h;
//        Long i;

        int i = 0;
        
        if (i == 0) {
            println("Zero");
        } else if ( i == 1 ) {
            println("One") ;
        } else if ( i == 2 ) {
            println("Two") ;
        } else {
            println("Other") ;
        }
        
        switch (i) {
            case 0:
                println("Zero");
                break;
            case 1:
                println("One") ;
                break;
            case 2:
                println("Two") ;
                break;
            default:
                println("Other") ;
                break;
        }
        
        if (   i == 0 ) print ("Zero") ; else print ("other") ;
        // Ternary
        print( i == 0 ?        "Zero" :              "Other" ) ;
        print ( i == 0 ?  "zero" :
                i == 1 ?  "one"  :
                i == 2 ?  "two"  : "Other" ) ;
        
    }

}
