package com.ayaz;

public class Shadowing {
    static int x=100;//This will be shadowed at line number 8
    public static void main(String[] args) {
        System.out.println(x);//50
        int x = 50;//This  will override the global declaration of class block
        System.out.println(x);//50
        fun();
    }
    static void fun(){
        System.out.println(x);//100
    }
}


//this is known as shadowing in java