package com.ayaz;

import java.util.Scanner;
public class Largest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

            System.out.println("Enter the value of a :");
            int a = input.nextInt();
            System.out.println("Enter the value of a :");
            int b = input.nextInt();
            System.out.println("Enter the value of a :");
            int c = input.nextInt();

            //Q ; find the largest of three numbers
//            int max=a;
//            if(b>max){
//                max=b;
//            }
//            if(c>max){
//                max=c;
//            }
            int max = Math.max(c,Math.max(a,b));
            System.out.println("The maximum value among :" +max);
    }

}
