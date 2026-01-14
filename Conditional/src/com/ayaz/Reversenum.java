package com.ayaz;
//Reverse a numbers
import java.util.Scanner;
public class Reversenum {
    public  static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of number:");
        int num = input.nextInt();
        int ans=0;

        while(num>0){
            int rem = num%10;
            num/=10;

            ans=ans*10+rem;
        }
        System.out.println("The reversed number is:" +ans);

    }

}
