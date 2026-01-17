
//variable length argument means when we don't know how many number of inputs we r giving

package com.ayaz;
import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun1(2,3,4,5,6,7,8,9,20); //function argument passes multiple value
        fun2("mohammed","Ayaz","coding","java");
        multiple(01,23656,"Mohammed Ayaz","BE-CSE","\"A\"");
    }
    //Array of integer
    static void fun1(int ...v){//funtion parameter here to catch multiple value use ... variable_name
        System.out.println(Arrays.toString(v));
    }

    //Array of string
    static void fun2(String ...v2){
        System.out.println(Arrays.toString(v2));
    }

    //Arrays of mixed argument

    static void multiple(int a,int b,String ...v3){
        System.out.println(a + " " + b + " " + Arrays.toString(v3));
    }


}
