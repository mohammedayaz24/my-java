package com.ayaz;

public class InfiniteRange {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int ans = ans(arr, target);
        System.out.println(target + " is present at index:" + ans);
    }

    static int ans(int[] arr, int target) {
        //first the range
        int start = 0;
        int end = 1;

        //condition for the target to lie in the end
        while (target > arr[end]) {
            int newStart = end + 1;
            //double the box value{window size}
            // end = previous end + sizofbox * 2;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return search(arr, target, start, end);
    }

    public static int search(int[] arr, int target, int start, int end) {

        while (start <= end) {
            //find the middle element
            int mid = (start + (end - start) / 2);

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}


