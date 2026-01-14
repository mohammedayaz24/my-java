package com.ayaz;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        //for loop -> use a for loop when i know how many times the loop will execute
        /*syntax of for loop
        for(initialisation; condition ; increment / decrement){
                // body
         }
         */
        System.out.println("for loop");
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }

        System.out.println("_----------------------------");
        System.out.println("Enter the value of n:");
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        for (int m = 0; m < n; m++) {
            System.out.println(m);

        }

        System.out.println("------------------------------");
        System.out.println("While loop");
        //while loop -> use when you don't know how many times the loop will run(means run until user press "x"
        int j=1;
        while(j<=10){
            System.out.println(j);
            j+=1;
        }

        //do while -> it will execute once even the condition is failed
        System.out.println("------------------------------");
        System.out.println("do-while loop");
        int k=1;
        do{
            System.out.println(k);
            k++;
        }while(k<=5);
    }
}
