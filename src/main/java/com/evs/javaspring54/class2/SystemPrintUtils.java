/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class2;

/**
 *
 * @author ok
 */
public class SystemPrintUtils {

    public static void print(Object obj) {
        System.out.print(obj);
    }

    public static void println(Object object) {
        System.out.println(object);
    }
    
    public static void printArray(float[] arr ) {
        for (float va : arr) {
            print(va + ", ");
        }
        println(" ");
    }
    
    public static void printArray(float[][] arr ) {
        for (float[] ff2 : arr) {
            for (float fff2 : ff2) {
                print(fff2 + " ");
            }
            println(" ");
        }
        println(" ");
    }
    
    public static void printArray(int[][] arr ) {
        for (int[] ff2 : arr) {
            for (int fff2 : ff2) {
                print(fff2 + " ");
            }
            println(" ");
        }
        println(" ");
    }

}
