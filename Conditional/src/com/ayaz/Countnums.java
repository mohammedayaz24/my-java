package com.ayaz;

import java.util.Scanner;
public class Countnums {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        int count=0;
        while(num > 0){
            int rem =num %10;
            if(rem == 3){
                count++;
            }
            num =num/10;
        }
        System.out.println(count);

    }

}
