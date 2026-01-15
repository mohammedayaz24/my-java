package com.ayaz;

public class Swap {
    public static void main(String[] args){
        int x=10;
        int y=20;
        swap(x,y);
        System.out.println(x + " " + y);

    }
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }

}
