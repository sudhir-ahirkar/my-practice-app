package com.practice.test.concept.TreeSetForSorting;

import java.util.TreeSet;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by sudhir.ahirkar on 11/17/2017.
 */
public class Test {
    public static void main(String args[]){

        TreeSet s=new TreeSet();
//        Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
//        StringBuffer s0=new StringBuffer("Sudhir");
//        StringBuffer s1=new StringBuffer("Sudhir");
//        StringBuffer s3=new StringBuffer("Sudhir");
//        StringBuffer s4=new StringBuffer("Sudhir");
//        s.add(s0);
//        s.add(s1);
//        s.add(s3);
        // we can not add null otherwise will get null-pointer exception
        s.add(null);

//        Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuilder cannot be cast to java.lang.Comparable
     /*   StringBuilder s0=new StringBuilder("Sudhir");
        StringBuilder s1=new StringBuilder("Sudhir");
        s.add(s0);
        s.add(s1);*/
        /*String s0=new String("Sudhir");
        String s1=new String("Sudhir1");
        s.add(s0);
        s.add(s1);
        System.out.println("TressSet====>"+s);*/
    }
}
