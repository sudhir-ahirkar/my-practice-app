package com.practice.test.concept.comparotorOrComparable;

import java.util.Comparator;

/**
 * Created by sudhir.ahirkar on 12/11/2017.
 */
public class MycompatorOnAge implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee  o2) {
        return o1.getAge().compareTo(o2.getAge());
    }

//    Integer
}
