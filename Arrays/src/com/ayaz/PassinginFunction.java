package com.ayaz;
import java.util.Arrays;
public class PassinginFunction {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        changeArray(nums);
        System.out.println("After modifying through function");
        System.out.println(Arrays.toString(nums));
    }

    static void changeArray(int[] arr){
        arr[0]=70;
    }

}
