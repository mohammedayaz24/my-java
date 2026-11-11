package com.ayaz;

class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
//single level inheritance
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println("Area of Triangle" +" " + 0.5*l*h);
    }
}

//multi-level inheritance
class equilateraltriangle extends Triangle{
    public void area(int l,int h) {
        if (l == h) {
            System.out.println("Equilateral Triangle");
        }
        System.out.println("Not an equilateral triangle");
    }
}

//multiple inheritance or hierarchical inheritence
class Circle extends Shape{
    public void area(int r){
        System.out.println("area of circle" +" " +( 3.14)*r*r);
    }
}

public class Inheritance {
    public static void main(String[] args){
            Shape s1 = new Shape();
            s1.area();

            Triangle t1 = new Triangle();
            t1.area(10, 15);

            equilateraltriangle e1 = new equilateraltriangle();
            e1.area(10, 15);

            Circle c1 = new Circle();
            c1.area(5);
        }
}
