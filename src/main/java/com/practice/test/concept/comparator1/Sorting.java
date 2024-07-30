package com.practice.test.concept.comparator1;

import java.util.TreeSet;

/**
 * Created by sudhir.ahirkar on 11/17/2017.
 */
public class Sorting {

    public static void main(String args[]){

        TreeSet t =new TreeSet(new MyComparator());

        t.add(0);
        t.add(5);
        t.add(2);
        t.add(1);
        t.add(3);

        System.out.println("Ascending order====>"+t);
    }
}
