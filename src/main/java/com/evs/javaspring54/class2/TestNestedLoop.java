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
public class TestNestedLoop {

    public static void main(String[] args) {
        // Even
        for (int a = 0; a < 20; a += 2) {
            println(a);
        }

        // Odd
        //  1+2
        for (int b = 0;; b++) {
            if (b % 2 == 1) {
                continue; // skip 
            }
            println(b);

            if (b > 20) {
                break;
            }
        }

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                for (int k = 0; k < 10; k++) {
//                    if (k == 4) {
//                        continue;
//                    }
//                    println(i + "+ " + j + " + " + k);
//                }
//            }
//        }
        one:
        for (int i = 0; i < 10; i++) {
            two:
            for (int j = i; j < 10; j++) {
                three:
                for (int k = j; k < 10; k++) {
                    if (i+j == j+k) {
                        continue;
                    }
                    println(i + ":" + j + ":" + k);
                }
            }
        }
        // 2:2:0

    }

}
