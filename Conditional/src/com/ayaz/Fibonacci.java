package com.ayaz;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a=1;
        int b=0;
        int count =2;
        while(count<=n){
            int temp = b;
            b = b + a;
            a = temp;
            count ++;
        }
        System.out.println(b);
    }
}
