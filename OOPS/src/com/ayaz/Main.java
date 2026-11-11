package com.ayaz;

//Class as blueprints
class Pen{
    String color;
    String type;


    //method
    public void write(){
        System.out.println("Writing something");
    }
    //method
    public void printColor(){
        System.out.println(this.color);
    }
}

//class #2

class Student{
    int age;
    String name;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Main{
    public static void main(String[] args) {

        //object1
        Pen pen1 = new Pen();
        pen1.type = "BallPoint";
        pen1.color = "Blue";

        //object 2
        Pen pen2 = new Pen();
        pen2.type = "BallPoint";
        pen2.color = "Green";

//        pen1.printColor();
//        pen2.printColor();

        Student s1 = new Student();
        s1.name = "Ayaz";
        s1.age = 21;

        Student s2 = new Student();
        s2.name="Ahmed";
        s2.age = 24;

        s1.printInfo();
        s2.printInfo();
    }
}
