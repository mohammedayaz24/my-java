package com.ayaz;

import java.net.StandardSocketOptions;

public class sqrt {
    public static void main(String[] args) {
        int x = 9;
        int ans = mySqrt(x);
        System.out.println(ans);

    }
    public static int mySqrt(int x) {

        if (x < 2) {
            return x;
        }
        int start = 1;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}
