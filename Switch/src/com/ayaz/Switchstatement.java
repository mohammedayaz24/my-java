package com.ayaz;

import java.util.Scanner;
public class Switchstatement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String fruit=input.next();

        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "grapes" -> System.out.println("good for health");
            case "banana" -> System.out.println(" a yellow fruit");
            default -> System.out.println("Enter valid fruits");
        }
    }

}

