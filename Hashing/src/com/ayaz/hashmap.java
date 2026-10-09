package com.ayaz;
import java.util.HashMap;

//hashmap = a dta structure that stores key values pairs
// keys are unique ,but valures canbe duplicated
//does not maintain any order,but is memory efficient
// HashMap<Key,Values>

public class hashmap {
    public static void main(String[] args) {

        HashMap<String,Double> map = new HashMap<>();

        map.put("Apple",0.50);
        map.put("Orage",0.70);
        map.put("Banana",0.20);
        map.put("Coconet",1.00);

        //remove
        map.remove("Apple");

        //get
        System.out.println(map.get("Coconet"));
        System.out.println(map);

        //containsKey
        System.out.println(map.containsKey("pineapple"));

        //practise

        if(map.containsKey("pineapple")){
            System.out.println(map.get("pineapple"));
        }else{
            System.out.println("Key not found");
        }


        //size()
        System.out.println(map.size());

        //enhanced

        for(String key : map.keySet()){
            System.out.println(key + " :$" + map.get(key)


            );
        }
    }
}
