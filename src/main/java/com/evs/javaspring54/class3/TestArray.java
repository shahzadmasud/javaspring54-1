/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class3;

import java.util.Arrays;
import static com.evs.javaspring54.class2.SystemPrintUtils.*;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

/**
 *
 * @author ok
 */
public class TestArray {

    public static void main(String[] args) {
//        int a, b, c, d, e, f, g, h, i, j; // temporary (stack) 
//        Integer a = new Integer() ; // permanent 

        int[] arr = new int[10]; // permanent memory
        arr[0] = 1; // a
        arr[1] = 2; // b
        arr[2] = 3; // c
        arr[3] = 4; // d
        arr[4] = 5; // e
        arr[5] = 6; // f
        arr[6] = 7; // g
        arr[7] = 8; // h
        arr[8] = 9; // i
        arr[9] = 0; // j

        // declare + initialise + assign
        // 1.
        int[] ar1; // dec 
        ar1 = new int[10]; // init
        ar1[0] = 10; // assignment

        // 2.
        int[] ar2 = new int[10]; // dec + init
        ar2[0] = 10; // assign

        //3. 
        int[] ar3 = {1, 2, 3, 4, 5}; // dec + init + assign
        ar3 = new int[]{1, 2, 3};

        // default value after init
        // number (int, short, long double, float) = 0 ;
        // char (byte, char) = '\0'
        // boolean = false 
        for (int i = 0; i < 10; i++) {
            ar1[i] = 10;
        }

        IntBinaryOperator ibo
                = (a, b) -> {
                    return a * 2; // Simple
                };

        Arrays.fill(ar1, 10);
        Arrays.fill(ar1, 2, 7, 10); // 2 inclusive 7 exclusive

        println(Arrays.binarySearch(ar1, 10));

        int val = 0;
        for (int i = 0; i < 10; i++) {
            val = ar1[i];
            print(val + ", ");
        }
        println("");
        Arrays.parallelPrefix(ar1, ibo);

        // For each
        for (int va : ar1) {
            print(va + ", ");
        }
        println(" ");

        // To clean up memory from Permanent, assign NULL
        ar1 = null;
        System.gc();
        // Automatic process (70-80%) - process start 
        // 64 --> 128 --> 256  --> 512 --> 1024 --> 2048 --> 3072  Mb - Linux, Mac, Windows 10
        // 64 --> 128--> 196 --> 256 --> 311 Mb = Window 7 or less

        // Can override process?
        // -Xms (start) -Xmx (end)
    }
}