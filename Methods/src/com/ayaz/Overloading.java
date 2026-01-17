/* Function overloading in java allow 2 function to have same name if and only if the
arguments of different type or different number of argument with same type
 */


package com.ayaz;

public class Overloading {
    public static void main(String[] args) {
        fun(56,7);
        fun("Ayaz",56);
        fun(5,6,7);

    }

    static void fun(int a,int b){
        System.out.println(a +" "+b );

    }

    static void fun(int a,int b,int c){
        System.out.println(a +" "+b+" "+c);

    }


    static void fun(String x,int y){
        System.out.println(x +" "+y);

    }

}
