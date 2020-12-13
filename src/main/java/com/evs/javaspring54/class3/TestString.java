/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class3;

/**
 *
 * @author ok
 */
public class TestString {

    public static void main(String[] args) {

        char[] name = {'s', 'h', 'a', 'h', 'z', 'a', 'd'}; // heap Addr12341

        String n1 = "shahzad"; // ==> Temporary (Stack) - Ad111
        String n2 = "shahzad"; // ==> Temporary (Stack) - Ad111

        n1 = n1 + "masud"; // "shahzadmasud" 
        n1 = "shahzad";

        String n3 = new String("shahzad"); // Permanent (Add222)

        if (n1 == n2) ; // true (reference)
        if (n1 == n3) ; // false (reference) 

        if (n1.equals(n2)) ; // true (value)
        if (n1.equals(n3)) ; // true (value) 

        if (n1.equalsIgnoreCase(n3)) ; // true (value without case)

        if (n1.compareTo(n3) == 0) ; // -1 (n1 small), 0 = equal, 1 (n1 large)
        // 0 ==> n1 == 3 
        // 1 ==> n1 > n3 
        // -1 ==> n1 < n3

        String str = "a quick brown fox jump over the lazy dog";

        // Split
        String[] sp = str.split(" ");
        sp = str.split("[ ,a]");
        sp = str.split(n3);

        // Search (indexOf), Contains
//        int idx = str.indexOf(n3); // offset (0 based), -1 (not found)
        int idx = 0, count = 0;
        do {
//            idx = str.indexOf("a", idx);
            idx = str.lastIndexOf("a", idx);
            if (idx > -1) {
                count++;
            }
        } while (idx > -1);

        // Concat
        n1 = n1.concat(n3).concat(n1);

        // Substring
        n1.substring(2); // shahzad --> ahzad
        n1.substring(0, 2); // shahzad -> sh

        // StartWith
        n1.startsWith("a");
        n1.endsWith("a");

        // StringBuffer, StringBuilder
        StringBuffer buf = new StringBuffer();
        buf.append(n1);
        buf.append(n2);
        buf.toString() ;
        
        StringBuilder bul = new StringBuilder();
        bul.append(n1);
        bul.append(n2);
        bul.toString() ;
        
        // Assignment 3.1 
        // Input String: a quick brown fox jumps over the lazy doog
        // Output String:a kciuq nworb xof spmuj revo eht yzal good
        
        // Assignment: 3.2 [optional]
        // Chess Assignment --> a1 => a3
        // Checkers Assignment
        
    }

}
