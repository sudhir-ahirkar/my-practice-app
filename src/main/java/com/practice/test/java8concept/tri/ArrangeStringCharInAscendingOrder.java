package com.practice.test.java8concept.tri;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrangeStringCharInAscendingOrder {
    public static void main(String[] args) {
        String str = "I want to join any project as early as possible";
        String collect = Arrays.stream(str.replaceAll(" ", "").split("")).sorted().collect(Collectors.joining());
        System.out.println("collect===>"+collect);
    }
}
