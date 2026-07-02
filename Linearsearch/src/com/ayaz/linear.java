package com.ayaz;

public class linear {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,6,-9,-7,28};
        int target = -9;
        int ans = linearsearch(nums,target);
        System.out.println(ans);

    }
    //search in the array : return the index if item found
    //otherwise if item not present return -1
    static int linearsearch(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        // return the for loop
        for (int i = 0; i < arr.length; i++) {
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
