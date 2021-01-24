/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.util;

import java.sql.Timestamp;
import java.util.Scanner;

/**
 *
 * @author ok
 */
public class SystemPrintUtils {

    public static void print(Object obj) {
        System.out.print(obj);
    }

    public static void print(Object... obj) {
        for (Object o : obj) {
            print(o);
        }
    }

    public static void println(Object object) {
        System.out.println(object);
    }

    public static void println(Object... obj) {
        for (Object o : obj) {
            println(o);
        }
    }

    public static long add(long... vals) {
        long res = 0;
        for (long v : vals) {
            res += v;
        }
        return res;
    }

    public static void printArray(float[] arr) {
        for (float va : arr) {
            print(va + ", ");
        }
        println(" ");
    }

    public static void printArray(float[][] arr) {
        for (float[] ff2 : arr) {
            for (float fff2 : ff2) {
                print(fff2 + " ");
            }
            println(" ");
        }
        println(" ");
    }

    public static void printArray(int[][] arr) {
        for (int[] ff2 : arr) {
            for (int fff2 : ff2) {
                print(fff2 + " ");
            }
            println(" ");
        }
        println(" ");
    }
    
    public static int input ( String ... args ) {
        println("Select from below: ") ;
        for ( String arg : args ) {
            println(arg) ;
        }
        print(">>") ;
        Scanner scan = new Scanner(System.in) ;
        return scan.nextInt( );
    }
    
    public static Timestamp now() {
        return new Timestamp(System.currentTimeMillis()) ;
    }

}
