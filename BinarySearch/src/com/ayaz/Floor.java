package com.ayaz;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 1;
        int ans = floor(arr,target);
        System.out.println("The floor number is :" +ans);
    }

    //find the largest number <= target
    public static int floor(int[] arr, int target) {
        if(target < arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            //find the middle element
            mid = (start + (end - start) / 2);

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[end];

    }
}