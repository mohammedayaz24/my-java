package com.ayaz;

public class Cieling {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 13;
        int ans = search(arr,target);
        System.out.println("The ceiling number is :" +ans);
    }
    public static int search(int[] arr, int target) {
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
                return mid;
            }
        }
        return arr[start]
                ;
    }
}

