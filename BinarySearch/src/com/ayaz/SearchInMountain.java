package com.ayaz;
//https://leetcode.com/problems/find-in-mountain-array/description/fi
public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2};
        int target = 3;
        int ans = search(arr,target);
        System.out.println("The element:"+target+":is found at:"+ans);
    }

    public static int search(int[] arr, int target) {
        int peak = peakIndexMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        //try to search in second half
        return orderAgnosticBS(arr,target,peak+1,arr.length -1);
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

    public static int orderAgnosticBS(int[] arr,int target,int start,int end){
        //find whether the arr is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            //find the middle element
            int mid = (start + (end - start) / 2);
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}



