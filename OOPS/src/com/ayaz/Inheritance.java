package com.ayaz;

class Shape{
    public void area(){
        System.out.println("Display area");

    }
}
//single level inheritance
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

//multi-level inheritance

class equilateraltriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

//multiple inheritance

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }

}
public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(10,150);

    }
}
