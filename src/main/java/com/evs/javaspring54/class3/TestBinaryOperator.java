/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class3;

import static com.evs.javaspring54.class2.SystemPrintUtils.println;
import java.util.function.DoubleBinaryOperator;
import java.util.function.LongBinaryOperator;

/**
 *
 * @author ok
 */
public class TestBinaryOperator {

    public static void main(String[] args) {
        double x, y;
        x = 7.654;
        y = 5.567;

        DoubleBinaryOperator dbo
                = (a, b) -> {
                    return a + b; // Simple
                };
        // ( x , y ) -> { stmt } ;
        println("x+y: " + dbo.applyAsDouble(x, y));

        dbo = (a, b) -> {
            return a - b;
        };
        println("x-y: " + dbo.applyAsDouble(x, y));

        LongBinaryOperator lbo
                = (a, b) -> {
                    return a * b - a + b;
                };
        println("2000-1000: " + lbo.applyAsLong(2000L, 1000L));

    }
}
