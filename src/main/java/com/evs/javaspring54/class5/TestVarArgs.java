/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class5;

import static com.evs.javaspring54.class2.SystemPrintUtils.*;

/**
 *
 * @author ok
 */
public class TestVarArgs {

    public static void main(String[] args) {
        print(10);
        print(10, 11.1, "Two", 4, true);
        println(add(1, 2, 3, 4), add(3, 4, 6), add(3, 4));
    }
}
