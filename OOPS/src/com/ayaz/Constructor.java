package com.ayaz;

class Student1{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }


    //Non parameterized constructor
    //when a constructor is being created it will call the constructor method at first
//    Student1(){
//        System.out.println("Constructor called");
//    }

    //parameterized constructor
//    Student1(String name, int age){
//        this.name = name;
//        this.age = age;
//    }

    //copy constructor
    Student1(){
    }

    Student1(Student1 s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "ayaz";
        s1.age = 20;

        Student1 s2 = new Student1(s1);
        s2.printinfo();

    }
}
