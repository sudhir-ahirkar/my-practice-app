package com.practice.test.java8concept.tri;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
* Given a numeric array, re arrange the elements to form a highest possible value.
Input: int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};
Output is: 998764543431
* */
public class ArrangeEleToMakeHigherValue {
    public static void main(String[] args) {
        int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};
//        List<String[]> collect = Arrays.stream(arr).boxed().map(c -> String.valueOf(c))
//                .map(s -> s.split("")).sorted().collect(Collectors.toList());
        String sortedList = Arrays.stream(arr).mapToObj(String::valueOf).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        System.out.println("sortedList===>"+sortedList);

        String[] arrStr = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
                .toArray(String[]::new);

        String result = String.join("", arrStr);
        System.out.println("Highest possible value: " + result);
    }
}
