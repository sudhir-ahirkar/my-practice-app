package com.practice.test.coding_test.other;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodingSkill2 {


    public static void main(String[] args) {

        String[] strArr = {"banana","apple","banana","mango", "mango","apple","banana"};

        Map<String, Long> strFrquencyMap = Arrays.stream(strArr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<String> duplicateLst = strFrquencyMap
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("duplicateLst===>"+duplicateLst);


        Map<String, Long> mapCollection = strFrquencyMap
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
//                .map(Map.Entry::getKey)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println("mapCollection===>"+mapCollection);
    }

}
