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

interface MakeSound{
    boolean sound = true;
}

class Horse1 implements Animal,Herbivorse,MakeSound{
    public void walk(){
        System.out.println("horse "+"walks on 4 legs "+"can make sound");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horse1 horse = new Horse1();

        horse.walk();

    }
}
