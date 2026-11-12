package com.ayaz;

class Rectangle1{
    int length;
    int breath;

    Rectangle1(){
        this.length=1;
        this.breath=1;
        System.out.println("length :"+this.length+" and "+" Breath:"+this.breath);
    }

    Rectangle1(int length,int breath){
        this.length=length;
        this.breath=breath;
        System.out.println("length :"+this.length+" and "+" Breath:"+this.breath);
    }

    Rectangle1(int length){
        this.length=length;
        this.breath=length;
        System.out.println("length :"+this.length+" and "+" Breath:"+this.breath);

    }
}


public class Task4 {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1();
        Rectangle1 r2 = new Rectangle1(10,15);
        Rectangle1 r3 = new Rectangle1(10);

    }
}
