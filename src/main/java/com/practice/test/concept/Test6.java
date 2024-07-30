package com.practice.test.concept;

import java.io.IOException;

public class Test6 {
    //    int a = 1L;
    public void m1(){
//        int a = 1L;
        int b = 0;
//        b += 1L;
    }

    //Note: Exception catch or throw if throw then throws should be part of method syntax if throw exception is checked exception
//    public static void main(String[] args) throws IOException {
    public static void main(String[] args) {
        try {
            throw new IOException("Hello");
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }


//            throw new IOException("Hello");

    }


   /* What is the contract between equals and hashCode of an object?
            (Question provided by Akmal Muqeeth)
    The only obligation is that for any objects o1 and o2 then if o1.equals(o2) is true then o1.hashCode() == o2.hashCode() is true.
    Note that this relationship goes only one way: for any o1, o2 of some class C, where none of o1 and o2 are null,
    then it can happen that o1.hashCode() == o2.hashCode() is true BUT o1.equals(o2) is false.
*/

}