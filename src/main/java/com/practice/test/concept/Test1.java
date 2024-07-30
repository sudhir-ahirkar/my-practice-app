package com.practice.test.concept;

public class Test1 {

    public static void main(String[] args) {

        String s = new String("Sudhir");
        Object obj = s;

        System.out.println("s==>" + s);
        System.out.println("obj==>" + obj);
        System.out.println(s == obj); // true

        Integer i = Integer.valueOf(10);
        Object o = (Object) i; // parent can store child reference
        System.out.println(i);
        System.out.println(o);
        System.out.println(i == o);  //true
    }
}

