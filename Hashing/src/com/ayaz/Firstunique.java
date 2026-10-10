package com.ayaz;

import java.util.HashMap;

public class Firstunique {
    public static void main(String[] args) {
        String s = "leletcode";
        System.out.println(unique(s));

    }

    public static int unique(String s){
        HashMap<Character,Integer> freq = new HashMap<>();

        for(char c : s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(freq.get(c)==1){
                return i;
            }
        }
        return -1;
    }

}
