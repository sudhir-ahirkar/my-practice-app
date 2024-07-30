package com.practice.test.coding_test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodingSkill11223 {
    public static void main(String[] args) {
        String str = "SudhirAhirkar";
        Map<Character, Long> collect = str.chars()
                .mapToObj(ele -> (char) ele)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("collect===>"+collect);

    }
}
