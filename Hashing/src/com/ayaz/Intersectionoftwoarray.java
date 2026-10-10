package com.ayaz;
import java.util.*;

public class Intersectionoftwoarray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] ans = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the elements in nums1
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> result = new HashSet<>();

        // Find common elements in nums2
        for (int num : nums2) {
            if (map.containsKey(num)) {
                result.add(num);
            }
        }
        // Convert HashSet to int[]
        int[] arr = new int[result.size()];
        int i = 0;

        for (int num : result) {
            arr[i] = num;
            i++;
        }

        return arr;
    }
}
