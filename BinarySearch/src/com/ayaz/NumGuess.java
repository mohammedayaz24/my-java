package com.ayaz;

public class NumGuess {
    public static void main(String[] args) {
        int n = 10;
        int mn = 111;
        int ans = number(n, mn);
        System.out.println(ans);

    }

    public static int number(int n, int mn) {
        int start = 0;
        int end = n;

        while (start <= end) {
            //find the middle element
            int mid = (start + (end - start) / 2);

            if (mn < mid) {
                end = mid - 1;
            } else if (mn > mid) {
                start = mid + 1;
            }
            return mid;
        }
        return -1;
    }
}
