package com.tuts.collections;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        //Adding element to the list
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);

        //Updating value in List
        l.set(1,0);
        System.out.println(l);

        //Removing element from the list
        //by giving object
        l.remove(Integer.valueOf(0));
        System.out.println(l);
        //by giving index
        l.remove(0);
        System.out.println(l);
    }
}
