/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class4;

import static com.evs.javaspring54.class2.SystemPrintUtils.*;

/**
 *
 * @author ok
 */
public class TestPower {

    // 1. Write complete requirements
    // 2. Dummy Function 
    // 3. Write possible test cases (fail)
    // 4. Write code to pass test
    // 5. [optional] Start optimising 
    public static void main(String[] args) {
        // Test First, Test Driven Development
        println("7.5 ^ 5 = " + power(7.5, 5));
        println("7.5 ^ 0 = " + power(7.5, 0));
        println("7.5 ^ 1 = " + power(7.5, 1));
        println("7.5 ^ -2 = " + power(7.5, -2));
        println("-7.5 ^ 5 = " + power(-7.5, 5));
        println("0 ^ 5 = " + power(0, 5));
    }

    static double power(double x, long y) {
        return y > 0 
                ? x * power (x, y -1)
                : y < 0 
                    ? 1 / power ( x , -y ) 
                    : y == 0 
                        ?   1
                        : x ;
//        if (y > 1) {
//            return x * power(x, y - 1);
//        } else if (y < 0) {
//            return 1 / power(x, -y);
//        } else {
//            return y == 0 ? 1 : x;
//        }
        
        // Shift it to Ternary operator
        
    }

}
