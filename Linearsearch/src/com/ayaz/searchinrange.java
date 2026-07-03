package com.ayaz;

public class searchinrange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = -7;
        System.out.println(linearsearch(arr, target,1,4));

    }

    static int linearsearch(int[] arr,int target,int start,int end ) {
        if (arr.length == 0) {
            return -1;
        }
        // return the for loop
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        //this line will execute if none of the above satement above has not executed.
        //hence target not found
        return -1;
    }
}
