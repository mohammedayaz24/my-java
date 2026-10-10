package com.ayaz;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4,2

        };
        Boolean ans = duplicate(nums);
        System.out.println(ans);

    }

    public static boolean duplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
