package com.ayaz;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            //int a=78 -> already initialized outside the block;
            // But can change the original value
            a =200;
            System.out.println(a);
            int c = 100;
            //values initialized in this block will remain in this block and cant be accessed outside the block
        }
        System.out.println(a);
        //System.out.println(c); - > will throw an error

    }
    static void random(int marks){
        int num = 567;// function scoped cant access outside the function
        System.out.println(num);
    }

}


// anything that are initialized outside the block can be used inside the block(can also update)7
//anything thar are initialized inside the block  cant be accessed outside the block

//anything that are initialized outside the box cant be initialized again inside the box
//anything that is init
//inalizes inside the box can be initialized again outside the box