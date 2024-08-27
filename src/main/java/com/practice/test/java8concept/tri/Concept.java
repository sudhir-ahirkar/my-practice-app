package com.practice.test.java8concept.tri;

public class Concept {
    public static void main(String[] args) {
        checkConcept();
    }

    private static void checkConcept() {
        String s1 = "abc";  String s2="abc";
        System.out.println("String pool concept===>"+(s1==s2));
    }
}
