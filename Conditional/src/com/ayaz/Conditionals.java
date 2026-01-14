package com.ayaz;

import java.util.Scanner;
public class Conditionals {
    public static  void main(String[] args){
        //conditinals
        /* if(boolean expression T or F){
               //body
           }else{
                //do this
            }
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Salary:");
        int salary = input.nextInt();
        if(salary >= 20_000){
            salary = salary + 3000;
            System.out.println("Your salary is increased by 3000");
        }
        else if(salary >= 10_000){
            salary = salary + 2000;
            System.out.println("Your salary is increased by 2000");
        }
        else{
            salary = salary + 1000;
            System.out.println("Your salary is increased by 1000");
        }
        System.out.println(salary);
    }

}
