package com.ayaz;

class Employeee{
    private int id;
    String name;
    double salary;

    //Constructor
    Employeee(int id,String name,double salary){
        this.id = id;
        this.name=name;
        this.salary=salary;
    }

    //Getter
    public int getId(){
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }

    //Setter
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name=name;
    }

    //update all
    public void setDetails(int id,String name,double salary){
        if (salary > 0) {
            this.salary = salary;
        }
        this.id = id;
        this.name=name;
    }

    //method 1

    public void displayDetails(){
        System.out.println("Employee Id: "+""+this.id);
        System.out.println("Employee Name: "+""+this.name);
        System.out.println("Monthly salary: "+""+this.salary);
    }

    //method 2
    public void calculateAnnualSalary(){
        double annualsalary = this.salary * 12;
        System.out.println("Annual salary: "+""+annualsalary);

    }

}

public class Task031 {
    public static void main(String[] args) {
        Employeee e1 = new Employeee(101,"Ayaz",10000);

        e1.displayDetails();
        e1.calculateAnnualSalary();


    }
}
