/* Array list is something when we donno the size f array*/


package com.ayaz;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* syntax
        ArrayList< Wrapper class DataType> list = new ArrayList<>(initial value);
         */
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(56);
        list.add(7);
        list.add(19);
        list.add(4);
        System.out.println(list);

        list.set(2,100);
        System.out.println(list);

        list.remove(2);

        System.out.println(list);
        System.out.println();

        for(int i =0 ; i < 5 ; i++){
            list.add(in.nextInt());
        }

        for(int i =0 ; i < 5 ; i++){
            System.out.println(list.get(i));
        }
    }
}
