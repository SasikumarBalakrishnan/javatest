package com.kgisl.qs1.arrayutils;

import java.util.List;

/**
 * Arrays
 */
public class Arrays {

    int empId;
    String empName;
    float salary;
    Arrays( int empId,String empName,float salary){
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

	public static List asList(Object[] a) {
		return null;
	}

	public static void sort(Object[] a) {
	}

	

	// public static List asList(Object[] a) {
	// 	return List;
	// }
}
