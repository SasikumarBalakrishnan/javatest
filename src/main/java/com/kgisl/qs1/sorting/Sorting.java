package com.kgisl.qs1.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Sorting
 */
public class Sorting {
    // Object[] obj = new Object[2];

    public static void main(String[] args) {

        ArrayList<Sort> a = new ArrayList<Sort>();
        a.add(new Sort(101, "sasi", 12000));
        a.add(new Sort(102, "shiens", 13000));
        a.add(new Sort(103, "gk", 14000));
        a.add(new Sort(104, "prabha", 15000));
        List<Sort> list = a.stream().sorted(Comparator.comparingInt(Sort::getId)).collect(Collectors.toList());
        System.out.println();
        List<Sort> list1 = a.stream().sorted(Comparator.comparing(Sort::getName)).collect(Collectors.toList());
        list1.forEach(System.out::println);
        List<Sort> list2 = a.stream().sorted(Comparator.comparing(Sort::getSal)).collect(Collectors.toList());
        list2.forEach(System.out::println);

    }

}