package com.ayaz;

import java.net.StandardSocketOptions;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something");
    }

    public void printinfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }

    Pen(String name,String age){
        this.color = color;
        this.type = type;

        System.out.println();
    }
}

class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){
        System.out.println("Constructor called");
    }
}
public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen("blue","ball");

//        pen1.color="blue";
//        pen1.type="ball";
        pen1.write();

        //new object

//        Pen pen2 = new Pen();
//        pen2.color="red";
//        pen2.type="ballpoint";

        pen1.printinfo();
//        pen2.printcolor();

        System.out.println("---------------------------------");
        Student s1 = new Student();
        s1.name="ayaz";
        s1.age = 20;

        s1.printinfo();

    }
}