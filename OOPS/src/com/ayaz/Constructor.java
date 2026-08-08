package com.ayaz;

class Student1{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student1(Student1 s2){
        this.name=s2.name;
        this.age=s2.age;
    }

    Student1(){

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
