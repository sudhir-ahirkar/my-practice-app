package com.practice.test.concept;

public class Test5 {

    static int  sf=0;
    public static final int a=0;
    public static final int b=0;
    public static final int c=0;

    public void m1(){
    	int b;
        //System.out.println(b); //Variable 'b' might not have been initialized
        int a=1;
         //c=1; //Cannot assign a value to final variable 'c'
        System.out.print(a);
    }

}
