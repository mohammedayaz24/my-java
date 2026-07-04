package com.ayaz;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, -7896};
        System.out.println(findnumbers(nums));

    }

    static int findnumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits2(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        if (num == 0) {
            return 1;
        }
        if (num<0){
            num = num * -1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }


    //method 2
    static int digits2(int num) {
        if (num == 0) {
            return 1;
        }
        if (num<0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)+1);
    }

}
