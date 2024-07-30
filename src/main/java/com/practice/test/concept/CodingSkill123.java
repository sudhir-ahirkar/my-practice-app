package com.practice.test.concept;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodingSkill123 {
    public static void main(String[] args) {
        String str = "SudhirAhirkar";
        Map<Character, Long> collect = str.chars()
                .mapToObj(ele -> (char) ele)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("collect===>"+collect);

    }
}
