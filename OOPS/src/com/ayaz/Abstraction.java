package com.ayaz;
//impure abstraction = anstract class
abstract class Animals{
    abstract void walk();
    public void eats(){
    }
    Animals(){
        System.out.println("you have created a base class object even it is abstracted it will run");
    }
}

class Horse extends Animals{
    public void walk(){
        System.out.println("Waks on 4 legs");
    }
}

class Chicken extends Animals{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();

        Chicken c1 = new Chicken();
        c1.walk();

    }
}
