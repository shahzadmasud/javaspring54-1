/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evs.javaspring54.class7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

/**
 *
 * @author ok
 */
public class TestCollection {

    public static void main(String[] args) {
    
        // COllection is a chain of objects, growable
        //          Sorting     Ordering    Duplicate
        // Set      No          No          Yes
        // List     No/Yes      Yes         Yes/No
        // Map      Yes         Yes         No (Key, Value)
        
        // Set = HashSet, LinkedHashSet, TreeSet*, EnumSet
        // List = Vector, ArrayList*, Stack, LinkedList, Queue, Dequeue
        // Map = Hashtable, Hashmap*, WeakHashmap, LinkedHashMap

        Set<String> set = new TreeSet<>() ;
        List<String> list = new ArrayList<>() ;
        Map<String, String> map = new HashMap<>() ;
        
        // Assignment is to sort a single list
        
        Stack<String> stack = new Stack<>();
        
    }
    
}
