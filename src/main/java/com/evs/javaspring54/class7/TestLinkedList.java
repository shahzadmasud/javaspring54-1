/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class7;

import static com.evs.javaspring54.class2.SystemPrintUtils.*;
import com.evs.javaspring54.class5.Dog;
import java.io.Serializable;

/**
 *
 * @author ok
 */
public class TestLinkedList {

    public static void main(String[] args) {
        MyLinkList<String> list = new MyLinkList<>("one");
        list.addItem("two");
        list.addItems(new String[]{"three", "four"});
        list.addItem("five");
        list.addItem("six");

        println(list);

        MyLinkList<Integer> intList = new MyLinkList<>();
        intList.addItems(new Integer[]{3, 4, 5, 6, 7, 8, 9});
        intList.addItem(0);
        println(intList);

        MyLinkList<Dog> dogList = new MyLinkList<>();
        dogList.addItem(new Dog("Steller"));
        println(dogList);

        MyLinkList<Pair<String, Integer>> pairList
                = new MyLinkList<>();
        pairList.addItem(new Pair<>("one", 1));
        println(pairList);

        MyLinkList<MyLinkList<MyLinkList<String>>> multiList
                = new MyLinkList<>();

    }

    public static void output(MyLinkList<? extends Serializable> list) {
        println(list);
    }
    
    public static void output(Pair<?,?> list) {
        println(list);
    }

}
