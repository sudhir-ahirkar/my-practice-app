package com.practice.test.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StringCharacterCountExample {
    public static void main(String[] args) {
        String word = "AAABBB";
        Map<String, Integer> charCountMap = getCharCountMap1(word);
        System.out.println(charCountMap);
    }

    private static Map<String, Integer> getCharCountMap1(String word) {
        String[] strArr = word.split("");
        Map<String,Integer> map = new HashMap();
        for (String str : strArr) {
            Integer addedValue = map.putIfAbsent(str,1);
            if(addedValue!=null) {
                map.computeIfPresent(str,(k,v)->v+1);
            }
        }
        System.out.println("map====>"+map);
        return map;
    }


    // Approach 1
    public static Map<String, Integer> getCharCountMap(String str) {
        String[] strArr = str.split("");
        Map<String,Integer> charMap = new HashMap<>();
        for (String st: strArr) {
            Integer addedValue = charMap.putIfAbsent(st, 1);
            if(addedValue!=null) {
                charMap.computeIfPresent(st,(k,v)->v+1);
            }
        }
        return charMap;
    }

    // Approach 2
    public static void getCharCountMapByStreamAPI(String str) {
        Map<String, Long> charMap = str.codePoints().mapToObj(Character::toString).collect(Collectors.groupingBy(identity(), counting()));
        Map<String, Long> charMap1 = str.chars().mapToObj(Character::toString).collect(Collectors.groupingBy(identity(), counting()));
        Map<String, Long> charMap2 = Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(identity(), counting()));
        System.out.println(charMap2);
        // if you want to collect map of Character and Long, then use below one
        Map<Character, Long> charMap3 = str.chars().mapToObj(c -> (char) c).collect(groupingBy(identity(), counting()));
        System.out.println(charMap3);
    }
}
