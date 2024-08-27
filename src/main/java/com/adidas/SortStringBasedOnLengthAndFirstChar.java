package com.adidas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringBasedOnLengthAndFirstChar {
    public static void main(String[] args) {
        String[] strArr = {"Sudhir","Hira","Pratiksha","Rajesh","Shubam"};
        List<String> lst = sortStr(strArr);
    }

    private static List<String> sortStr(String[] strArr) {

        List<String> lst = Arrays.stream(strArr)
                .sorted(Comparator.comparingInt(String::length).thenComparing(st -> st.charAt(0)))
                .collect(Collectors.toList());
        System.out.println("lst===>"+lst);
        return lst;

    }
}
