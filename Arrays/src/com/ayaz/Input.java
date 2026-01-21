package com.ayaz;
import java.util.Scanner;
import java.util.Arrays;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=4974;
        arr[1]=47;
        arr[2]=40;
        arr[3]=56;
        arr[4]=7;
        // [4974, 47, 40, 56, 07]
        System.out.println(arr[4]);

        //array of primitives
        //for (int i =0; i < arr.length; i++) {
       //     arr[i] = in.nextInt();
       // }

        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //enhanced for loop
        for(int num : arr ){// for every element in array print the element
            System.out.print(num + " ");//here num represent element of array
        }
        //System.out.println(arr[5]);//IndexOutOfBound
        System.out.println();
        System.out.println(Arrays.toString(arr));


        System.out.println("arrays of object");
        //array of objects
        String[] str = new String[4];
        for (int i =0; i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
