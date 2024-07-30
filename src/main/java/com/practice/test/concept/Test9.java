package com.practice.test.concept;

import java.util.HashMap;
import java.util.HashSet;

public class Test9 {

    public static void main(String[] args) {

        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
//    Student s4=new Student();

        HashMap<Student,Integer> hm=new HashMap<>();
//
        hm.put(s1, 0);
        hm.put(s2, 0);
        hm.put(s2, 0);
        hm.put(s3, 0);
        //System.out.println("hm====>"+hm); //hm====>{com.practice.test.concept.Student@1=0,
        // com.practice.test.concept.Student@1=0, com.practice.test.concept.Student@1=0}


        // If we make, return equals method of Student "true"
        System.out.println("hm====>"+hm); //hm====>{com.practice.test.concept.Student@1=0}


//        Long l1=new Long(225L);
//        System.out.println(l1.hashCode());

    }

}
