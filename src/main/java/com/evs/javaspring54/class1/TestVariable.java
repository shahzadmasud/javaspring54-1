/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class1;

import java.util.Scanner;

/**
 *
 * @author ok
 */
public class TestVariable {

    public static void main(String[] args) {

//        // 1. Decision
//        boolean a = true; // true | false  , 1 byte = true = 11111111 false = 00000000
//
//        // 2. Character
//        byte b = '0'; // 1 byte = 256 ==> 2 ^ 8
//        char c = 'A'; // 2 byte - 65565 ==> 2 ^ 16
//
//        // 3. Number
//        // 3.1 Whole (Non-decimal)
//        short d = 10; // 2 bytes = 65565 ==> 2 ^ 16
//        int e = 10; // 4 bytes = 42900000000 ==> 2 ^ 32
//        long f = 12345678901L; // 8 bytes = 1e19 ==> 2 ^ 64
//
//        // 3.2 Decimal
//        float g = 10.0F; // 4 bytes = 42000000000 ==> 2 ^ 32
//        double h = 10.0; // 8 bytes = 1e19 ===> 2 ^ 64
//
//        short s1 = 100, s2 = 100;
//        s1 = (short) (s1 + s2) ; // explicit;
//        e = (s1 + s2) ; // implicit
//        f = e + d ;  // implict
//        
//        e = (int) f + d ; // explicit
//        e = (int) (f + d) ; // explicit
//        
//        
//        // byte -> char -> Int -> long -> float -> double
//        //        short -> Int -> long -> float -> double
//
//        // ====> Implicit 
//        // <==== Explicit
//        
//        // variable definition
//        // <data type> <variable name> <operator> <value>
//        int noOfStudents = 6 ;
//        // 1. Should start with a letter or _ or $
//        // 2. Should be meaningful [optional]
//        int $1 = 10 ; // voilate #2
////        int 1s = 0 ;
        int a, b, c, d, e, f;
        a = b = c = d = e = f = 1;

        // 1. Binary 
//        a = a + 1 ;
        // +, -, *, /, %, << , >> , >>>, &, | , ^
//        a = a ^ b ;
        // 2. Op+
//        a += 1 ; // a = a + 1 ;
//        a ^= b ; // a = a ^ b
        // Math Functions
        // sin(), cos(), tan, asin, acon, atan, log, nlog, rint
        // power, floor, ceil, round, sqt, cbrt, hypot, exp, log1p, random
        // Uniry
//        a = a + 1 ; 
//        a += 1 ;
//        a ++ ; // post increment (after evaluate)
//        ++ a ; // pre increment (before evaluate)
//        a -- ;
//        -- a ; 
//        c = a++ + b++; // a=2 , b=2 , c=2
//        c = ++a + ++b; // a=2 , b=2 , c=4
//        c = a++ + ++b; // a=2 , b=2 , c=3
//        f = a++ + b++ + c++ + d++ + ++d + ++c + f++ ;
        //  1    1      1     1       3     3   1
        // 11
        f = --a + b++ + --b - --c - ++d - c-- + f-- + --f + 1;
        //    0 + 1   +   1 -   0 -   2 - 0   + 1   -   1 + 1
        // 1
        // Operator Precedence
        // (), [], postfix++, postfix-- (left)
        // +, -, ++prefix, --prefix, ~, ! (right) 
        // (cast) - (left)
        // *, /, %
        // +, - 
        // <<, >>, >>>
        // < , <=, >, >=
        // ==, != 
        // &
        // ^
        // |
        // &&
        // || 
        // +=, (right)

        a += b += c += d = 10;

        a += (b += (c += (d = 10)));

        Scanner scan = new Scanner(System.in);
//        System.out.print("a:");
        int aa = scan.nextInt();
//        System.out.print("b:");
        int bb = scan.nextInt();
        System.out.println("a+b=" + (aa + bb));
        
        // Assignment 1 
        // Setup your system with JDK, Netbeans/Eclipse
        //Run first program
        
        // Assignment 2 [Adv]
        // Input a 
        // Input b 
        // Input op

    }
}
