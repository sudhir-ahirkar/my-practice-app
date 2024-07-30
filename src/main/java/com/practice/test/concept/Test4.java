package com.practice.test.concept;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList l=new ArrayList<String>(); // It not treat like generic
        l.add(10);
        l.add("123");
        l.add("Sudhir");
        System.out.println(l); ///
    }
}
