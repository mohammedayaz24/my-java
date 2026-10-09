package com.ayaz;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {

        //creating
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);

        //print all element
        System.out.println(set);

        //Search - contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }

        if(!set.contains(6)){
            System.out.println("Does not contain");
        }

        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("we deleted 1");
        }
        System.out.println(set);


        //size
        System.out.println("Size of set is :" + set.size());

        //iterator
        Iterator it = set.iterator();

        //hasNext(),  Next
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
