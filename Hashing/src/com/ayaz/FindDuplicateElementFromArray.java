package com.ayaz;
import java.util.HashSet;
import java.util.Iterator;

public class FindDuplicateElementFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,6,7};

        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            if(!set.add(i)){
                System.out.println(i);
            }
        }
    }
}
