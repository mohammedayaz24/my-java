package com.ayaz;

import java.util.Scanner;
import java.util.Arrays;
public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //2D arrays like matrix
        /*  1 2 3
            4 5 6
            7 8 9
         */

        //int[][] arr = new int[3][3];
        int[][] arr2D = {
                {1, 2, 3},    // 0th index
                {4, 5, 6,},   // 1st index
                {7, 8, 9}     // 2nd index
        };


        int[][] arr = new int[3][3];
        System.out.println(arr.length);// No of rows
        //Input
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println("Enter the value of :" + row + " " + col);
                arr[row][col] = in.nextInt();
            }
        }

        //output
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }


        System.out.println("2nd method");
        for(int row =0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        System.out.println("Enhanced array");
        //syntax : for(datatype newname : variable)
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
