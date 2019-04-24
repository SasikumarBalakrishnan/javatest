package com.kgisl.qs1.block;

/**
 * Blocks
 */
public class Parent {

    public Parent() {
        System.out.println("This is parent class constructor block");
    }

    static {
        System.out.println("This is parent class static block");
    }
    {
        System.out.println("This is parent class default block");
    }
}

class Child extends Parent {
    
        static{
            System.out.println("This is child class static block");
        }
        Child(){
            System.out.println("This is child class constructor block");
        }
        {
            System.out.println("This is child class default block");
        }
        public static void main(String[] args) {
            new Child();
    }

    

   
}