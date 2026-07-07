package com.ayaz;
//In order agnostic we know its sorted but donno whether it is ascending or descending
public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2};
        int target = 2;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(target +" is present at index:" +ans);


    }
    public static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

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
