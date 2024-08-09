package com.practice.test.coding_test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByFirstChar {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "carrot", "avocado", "blueberry", "cherry");

        // Group words by their first letter
        Map<Character, List<String>> groupedByFirstLetter = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0))); /// noted here

        // Output the result
        System.out.println(groupedByFirstLetter);
    }
}