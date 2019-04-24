package com.kgisl.qs1.crudoperations;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * CrudOperations
 */
public class Employee {
    static String[]a=new String[3];
    public static void main(String[] args) {
        selectOpt();
    }
    static void selectOpt() {
        System.out.println("1.create\t2.update\t3.getOne\t4.remove\t5.display");
        System.out.println("select your option:");
        Scanner scan = new Scanner(System.in);
        int myOption = scan.nextInt();
        switch (myOption) {
        case 1:
            create();
            selectOpt();
            break;
        case 2:
            update();
            selectOpt();

            break;
        
        case 3:
            remove();
            selectOpt();
            break;
        case 4:
            display();
            selectOpt();
            break;

        default:
            selectOpt();
            break;
        }
    }
    

   

    private static void create() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            
        
        System.out.println("Enter the employee name:");
        String name = scan.nextLine();
        System.out.println("Enter the employee id:");
        int id = scan.nextInt();
        System.out.println("Enter the employee dept:");
        String dept = scan.nextLine();
        System.out.println("Enter the employee salary:");
        float sal = scan.nextFloat();
        a[i]=name + " " + id + " " + dept + " " + sal;
    }
}

    private static void update() {
        System.out.println("Enter the name:");
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        System.out.println("Enter the name to update:");
        Scanner scan2=new Scanner(System.in);
        String updName=scan2.nextLine();
        for (int i = 0; i < a.length; i++) {
            if(name.equals(a[i]))
            a[i]=updName;
        }


    }

    

    private static void remove() {
        System.out.println("Enter the name:");
        Scanner scan=new Scanner(System.in);
        String remName=scan.nextLine();
        for (int i = 0; i < a.length; i++) {
            if(remName.equals(a[i])){
                a[i]=" ";
            }
        }
    }

    private static void display() {
        for (String var : a) {
            System.out.println(var);
        }
    }
    
    
}
