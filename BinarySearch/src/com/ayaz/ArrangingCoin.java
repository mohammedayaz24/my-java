package com.ayaz;
//https://leetcode.com/problems/arranging-coins/
public class ArrangingCoin {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));

    }
    public static int arrangeCoins(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            long coinsNeeded = (long) mid * (mid + 1) / 2;

            if (coinsNeeded == n) {
                return mid;
            } else if (coinsNeeded < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}
