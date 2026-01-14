package com.ayaz;

import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int empID=input.nextInt();
        String department = input.next();

        switch (empID) {
            case 1 -> System.out.println("Mohammed Ayaz");
            case 2 -> System.out.println("Alfiya Amreen");
            case 3 -> {
                System.out.println("Emp ID no 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "CSE" -> System.out.println("CSE department");
                    default -> System.out.println("Enter valid department");
                }
            }
            default -> System.out.println("Enter valid empID");
        }

    }

}
