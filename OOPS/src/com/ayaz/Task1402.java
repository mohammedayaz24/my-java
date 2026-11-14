package com.ayaz;

class Animal1{
    public void makesound(){
        System.out.println("Animal make sound");
    }
}

class Dog1 extends Animal1{

    @Override
    public void makesound(){
        System.out.println("Dog Barks");
    }
}

class Cat1 extends Animal1{

    @Override
    public void makesound(){
        System.out.println("Cats meows");
    }
}


public class Task1402 {
    public static void main(String[] args) {

        Dog1 d1 = new Dog1();
        d1.makesound();

        Cat1 c1 = new Cat1();
        c1.makesound();

    }
}
