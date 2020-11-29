/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class2;

import java.util.Scanner;
import static com.evs.javaspring54.class2.SystemPrintUtils.*;

/**
 *
 * @author ok
 */
public class AddInputTest {

    public static void main(String[] args) {

        // Input from Keyboard
        int numOfOranges = 2;
        int numOfApples = 10;
        int numOfFruits = 0; // total 

        Scanner scan = new Scanner(System.in);

        print("Input No of Oranges: ");
        numOfOranges = scan.nextInt();

        print("Input No of Apples: ");
        numOfApples = scan.nextInt();

        print("Input operation (+,-,*,/):");
        String input = scan.next();
        char op = input.charAt(0);
        switch (op) {
            case '+':
                numOfFruits = numOfOranges + numOfApples;
                break;
            case '-':
                numOfFruits = numOfOranges - numOfApples;
                break;
            case '*':
                numOfFruits = numOfOranges * numOfApples;
                break;
            case '/':
                numOfFruits = numOfOranges / numOfApples;
                break;
        }

        println("Total: " + numOfFruits);
    }

}
