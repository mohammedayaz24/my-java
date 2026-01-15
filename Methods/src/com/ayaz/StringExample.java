package com.ayaz;

import java.util.Scanner;
public class StringExample {
    public static void main(String[] args){
//        String msg= greet();
//        System.out.println(msg);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name=in.nextLine();
        String personalizedmessage = greeting(name);
        System.out.println(personalizedmessage);
    }
    static String greet(){
        String greeting = "How are u?";
        return greeting;
    }

    static String greeting(String name){
        String message = "Hello " + name;
        return message;

    }

    

}
