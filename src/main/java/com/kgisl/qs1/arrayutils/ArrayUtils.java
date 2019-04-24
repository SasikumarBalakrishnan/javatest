package com.kgisl.qs1.arrayutils;

import java.util.List;

/**
 * ArrayUtils
 */
public class ArrayUtils {

    public static void main(String[] args) {
        Object a[]=new Object[]{new Arrays(101,"sasi",12000),
                                new Arrays(102,"shiens",13000),
                                new Arrays(103,"prabha",14000),
                                new Arrays(104,"gk",15000)};
        // List lst1=Arrays.asList(a);
        // System.out.println(lst1); 
        
        Arrays.sort(a);
        for (Object var : a) {
            System.out.println(var);
        }
    }
}