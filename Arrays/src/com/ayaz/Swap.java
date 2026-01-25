package com.ayaz;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 , 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));



    }
    static void swap(int[] arr,int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // reversing an array
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;


        //this is known as two pointers
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
