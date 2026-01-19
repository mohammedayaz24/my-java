package com.ayaz;

public class Main{
    public static void main(String[] args) {
        //syntax
        // datatype[] variable_name = new datatype[size];
        //all the value of array should be same datatype

        int[] rno = new int[5];
        //or directly
        int[] rno2 = {23,13,43,56,7};




        int[] ros;//declration of array.ros is getting defined in the sttack
        ros = new int[5];// initialization actually here object is being created in heap memory
        System.out.println(ros[1]);//op : 0

        //string array
        String[] arr = new String[4];
        System.out.println(arr[1]);//op : null

        //null is special literal cant be assigned to primitive
        //any reference variable if not assigned then by default it will be null
    }
}