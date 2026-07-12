package com.ayaz;
//same answer
//easy -
//medium -
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int ans=peakIndexMountainArray(arr);
        System.out.println("Peak element is at:"+ans);

    }

    public static int peakIndexMountainArray(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid]>arr[mid+1]){//this maybe the answer bit look at left(u r in decreasing order)
                end = mid;
            }else{//u r in ascending order
                start = mid+1;
            }
        }
        //in the end ,start == end pointing to largest number because of two chunks
        //strat and end is always trying to find max in the above 2 checks
        //hence there are pointing to one element, that is the one max element
        return start;
    }

}
