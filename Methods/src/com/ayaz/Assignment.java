package com.ayaz;
import static java.lang.System.in;
import java.util.*;
public class Assignment {
    public static void main(String[] args) {
        System.out.println(isLargest(10, 20, 77));
        System.out.println("The number is: " +(isEvenOdd(7)));
        System.out.println("You are "+ iseligible(20) +" to vote");
        circle(28.27);

        for(int n=0;n>=20;n++){
            System.out.println("The number is :" +(isPrime(n)));
        }
       // System.out.println("Factorial is : " +(factorial(5)));
       // System.out.println("The number is "+(isPalindrome(12321)));

    }

    /*Q1 : creating a method to check largest among 3 numbers*/
    static int isLargest(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }


    //q2:to find a number is even or odd
    static String isEvenOdd(int num){
        if(num%2 == 0){
            return "even";
        }
        else{
            return "odd";
        }
    }

    //q3: to check whther a person is eleigible to vote or not

    static String iseligible(int age){
        if(age>=18){
            return "\"Eligible\"";
        }
        return "\"not Eligible\"";
    }


    //q4 area of a circle and circumference of circle
    static void circle(double radius){
        double PI=3.14;
        double area =PI*radius*radius;
        System.out.println("Area of circle of radius "+(radius) +" is :" +area);

        double circumference = 2*PI*radius;
        System.out.println("Circumference of a circle of radius " +(radius) + " is :" +circumference);
    }


    //q5 : to check a number is prime or no
    static int isPrime(int n){
        if(n<=1){
            return 1;
        }
        for(int i =2;i< Math.sqrt(n);i++){
            if (n % i == 0){
                return 0;
            }
        }
        return n;
    }



    //q6:factorial of a number
    static int factorial(int fact){
        int result=1;
        for(int i=fact;i>0;i--){
            result= result * i;
        }
        return result;
    }


    static String isPalindrome(int num){
        int original =num;
        int reverse = 0;
        while (num > 0) {
            int digit = num%10;
            reverse = reverse * 10 + digit;
            num = num /10;
        }
        if(original == reverse){
            return "Palindrome";
        }
        return "not palindrome";
    }
}