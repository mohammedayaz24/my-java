package com.ayaz;

class Employee{
    String name;
    int age;

    public void printinfo(String name){
        System.out.println(this.name);
    }

    public void printinfo(int age){
        System.out.println(this.age);
    }

    public void printinfo(String name , int age){
        System.out.println(this.name + " " + this.age);
    }
}

public class Pollymorphism {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Ayaz";
        e1.age=20;

        Employee e2 = new Employee();
        e2.name = "Ahmed";
        e2.age = 24;

        e1.printinfo(e1.name);
        e1.printinfo(e1.age);
        e2.printinfo(e2.name,e2.age);
    }
}
