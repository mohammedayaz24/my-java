package com.ayaz;

class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age = age;
    }

    public void displayPersonDetails(){
        System.out.println("name: "+""+this.name);
        System.out.println("Age: "+""+this.age);
    }
}

class Student5 extends Person{
    int rollnumber;

    Student5(String name,int age,int rollnumber){
        super(name,age);
        this.rollnumber = rollnumber;
    }

    public void displayStudentDetails(){
        displayPersonDetails();
        System.out.println("Roll number: "+""+this.rollnumber);
    }
}

public class Task1401 {
    public static void main(String[] args) {
        Person p1 = new Person("ayaz",21);
        //p1.displayPersonDetails();

        Student5 s5 = new Student5("Ahmed",22,25432);
        s5.displayStudentDetails();

    }
}
