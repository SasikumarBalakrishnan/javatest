package com.kgisl.qs1.sorting;

/**
 * Sort
 */
public class Sort {

    int empId;
    String empName;
    float salary;
    Sort( int empId,String empName,float salary){
        this.empId=empId;
        this.empName=empName;
        this.salary=salary;
    
    }
    
    int getId() {
        return empId;
    }
    String getName(){
        return empName;
    }
    float getSal(){
        return salary;
    }
    public String toString(){
        return empId+" "+empName+" "+salary;

    }
}