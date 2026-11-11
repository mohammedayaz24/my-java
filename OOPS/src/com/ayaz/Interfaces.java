package com.ayaz;

//interfaces allows multiple inheritance means one derived class can implemnt 2 base classes
//public,static and by default,all method are public and abstract
interface Animal{
    int eyes = 2;
    void walk();
}

interface Herbivorse{
    String food = "Veg";
}

class Horse1 implements Animal,Herbivorse{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horse1 horse = new Horse1();

    }
}
