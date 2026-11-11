package com.ayaz;

//Task 1
class Employee1{
    int EmployeeId;
    String name;
    int salary;

    public void EmpleyeeInfo(){
        System.out.println("Employee Id :" + "" +this.EmployeeId);
        System.out.println("Name :" + "" +this.name);
        System.out.println("Salary :" + "" +this.salary);
    }
}

//task 2
class Rectangle{
    double length;
    double width;

    public void area(){
        double area = this.length*this.width;
        System.out.println("Area of Rectangle:" + " " + area);
    }

    public void perimeter(){
        double perimeter = 2*(this.length+this.width);
        System.out.println("Perimeter of Rectangle:" + " "+ perimeter);
    }
}

public class Task {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1();
        emp1.name = "Mohammed Ayaz";
        emp1.EmployeeId = 23656;
        emp1.salary=40000;
        emp1.EmpleyeeInfo();

        //Task 2
        Rectangle rc1 = new Rectangle();
        rc1.length=10;
        rc1.width = 20;

        rc1.area();
        rc1.perimeter();
    }
}
