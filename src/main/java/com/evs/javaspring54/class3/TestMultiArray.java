/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class3;

import java.util.Arrays;
import java.util.Random;
import static com.evs.javaspring54.class2.SystemPrintUtils.* ;
/**
 *
 * @author ok
 */
public class TestMultiArray {

    public static void main(String[] args) {

        float[][] f = new float[2][2];
        f[0][0] = 1.0f;
        f[0][1] = 2.0f;
        f[1][0] = 3.0f;
        f[1][1] = 4.0f;

        float[][] f2 = {{1.0f, 2.0f}, {3.0f, 4.0f}};

        Random random = new Random(3000);
        for (int i = 0; i < f2.length; i++) {
            Arrays.fill(f2[i], random.nextFloat());
        }
        printArray(f2);

        float[][] f3 = new float[10][];
        for (int i = 0; i < f3.length; i++) {
            f3[i] = new float[i + 1];
            Arrays.fill(f3[i], random.nextFloat());
        }
        
        printArray(f3);

//        for (float[] ff2 : f2) {
//            for (float fff2 : ff2) {
//                print(fff2 + " ");
//            }
//            println(" ");
//        }

        int[][] checker = new int[10][10] ;
        for ( int i = 0 ; i < checker.length; i ++ ) {
            for ( int j = 0 ; j < checker[i].length ; j ++ ) {
                checker[i][j] 
                        = i % 2 == 0 
                        ? j % 2 == 0 ? 0 : 1
                        : j % 2 == 0 ? 1 : 0 ;
//                if ( i % 2 == 0 ) { // Even Row
//                    if ( j % 2 == 0 ) {
//                        checker[i][j] = 0 ;
//                    }
//                    else {
//                        checker[i][j] = 1 ;
//                    }
//                }
//                else { // Odd Row
//                if ( j % 2 == 0 ) {
//                        checker[i][j] = 1 ;
//                    }
//                    else {
//                        checker[i][j] = 0 ;
//                    }
//                }
            }
        }
        printArray(checker);
    }
}
