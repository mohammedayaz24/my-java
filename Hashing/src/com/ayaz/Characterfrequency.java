package com.ayaz;

import java.util.HashMap;
import java.util.*;

public class Characterfrequency {
    public static void main(String[] args) {
        String name = "MohammedAyaz";

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<name.length();i++){
            Character ch = name.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
