package com.ayaz;

class Employee{
    String name;
    int age;

    public void printinfo(String name){
        System.out.println(name);
    }

    public void printinfo(int age){
        System.out.println(age);

    }

    public void printinfo(String name , int age){
        System.out.println(name + "-" + age);
    }
}

public class Pollymorphism {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Ayaz";
        e1.age=20;

        e1.printinfo(e1.name);
        e1.printinfo(e1.age);
        e1.printinfo(e1.name,e1.age);


    }
}
