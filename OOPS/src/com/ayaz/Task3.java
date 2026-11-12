package com.ayaz;

class Students{
    String name;
    int rollno;
    String dept;


    Students() {
        System.out.println("Default constructor called");
    }
    Students(String name,int rollno,String dept){
        this.name = name;
        this.rollno = rollno;
        this.dept = dept;
    }

    public void displayInfo(){
        System.out.println("Name:"+" "+this.name);
        System.out.println("Roll no"+" "+this.rollno);
        System.out.println("Department"+" "+this.dept);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Students st1 = new Students();
        st1.name = "Ayaz";
        st1.rollno = 23656;
        st1.dept = "CSE";

        Students st2 = new Students("Rahul", 23657, "IT");
        Students st3 = new Students("Kashif", 23658, "ECE");

        st1.displayInfo();
        st2.displayInfo();
        st3.displayInfo();
    }

}
