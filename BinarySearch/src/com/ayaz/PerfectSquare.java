package com.ayaz;

public class PerfectSquare {
    public static void main(String[] args) {
        int num = 69;
        System.out.println(mySqrt(num));

    }
    public static boolean mySqrt(int x) {
        if (x < 2) {
            return false;
        }
        int start = 1;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return true;
            } else if (square < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
