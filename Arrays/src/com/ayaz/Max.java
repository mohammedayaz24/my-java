package com.ayaz;

import java.lang.reflect.Array;

public class Max {
    public static void main(String[] args) {
        int[] num = { 10 , 20 , 7, 56 , 2};
        System.out.println(max(num));
        System.out.println(maxrange(num,1,2));

    }

    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i=0 ; i < arr.length; i++){
            if(arr[i]>maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    //in range for handling edge cases
    static int maxrange(int[] arr ,int start , int end){
        int maxVal = arr[start];
        for(int i=start ; i <= end ; i++){
            if(arr[i]>maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
