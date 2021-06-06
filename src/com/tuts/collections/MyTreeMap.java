package com.tuts.collections;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class MyTreeMap {
    static void printMap(Map<Integer, String> m){
        System.out.println(m);
    }
    // Iteration in Map
    static void printMapIteration(@NotNull Map<Integer,String> m){
        for(Map.Entry<Integer,String> e : m.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
    public static void main(String[] args) {
        Map<Integer, String> rTable = new HashMap<>();
        //Adding Elements
        rTable.put(1, "Yugansh");
        rTable.put(2, "Nishtha");
        rTable.put(3, "Tripta");
        printMap(rTable);
        //Updating Elements
        rTable.put(3, "Naveen");
        printMap(rTable);
        //Removing Element
        rTable.remove(3);
        printMap(rTable);
        printMapIteration(rTable);
    }
}
