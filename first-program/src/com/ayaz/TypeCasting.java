package com.ayaz;

import java.util.*;
public class TypeCasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float num =input.nextInt();
        System.out.println(num);
        System.out.println("----------------------------------------");

        //type casting
        //compressing the bigger number in a smaller type explicitly is type castiing
        System.out.println("Type Casting");
        int num1 = (int)(657.87);
        System.out.println(num1);
        System.out.println("--------------------------------------------");


        //automatic type promotion in expression
        System.out.println("automatic type promotion");
        int a=257;   //257 % 256 = 1
        byte b =(byte)(a);
        System.out.println(b);
        System.out.println("-------------------------------------------");


        //example 2
//        byte a = 40;
//        byte b = 50;
//        byte c= 100;
//        int d =(a * b)/c;   -> java converts byte in int in expression
//        System.out.println(d);

        int number = 'A';
        System.out.println("ASCII valur is ;" + number);

        //example

        byte by = 42;
        char c = 'a';
        short s= 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i/c) - (d * s);
        // float - integer + double == double
        System.out.println((f * b) +" "+ (i/c) + " " +(d * s));
        System.out.println(result);

    }

}
