package com.practice.test.coding_test;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodingSkillTest5678 {

    public static void main(String[] args) {
        String str = "Sudhir Prabhakar Ahirkar";
        char charResult = getFirstRepeatingChar(str);
        System.out.println("charResult==>"+charResult);
    }

    private static char getFirstRepeatingChar(String str) {
        char resultChar = str.chars().mapToObj(ele->(char)ele)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey).findFirst().get();
        return resultChar;
    }

    // accept map
    // return map :
    // algorith : sort map in assending order based on key
    private static Map<Integer, String> getProcessedMap(Map<Integer, String> map) {
//      return map.entrySet().stream()
//                .sorted(Comparator.comparingInt(entry -> entry.getKey()))
//                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
//                        (x,y)->y,LinkedHashMap::new));
        return new LinkedHashMap<>(map.entrySet().stream()
                .sorted(Comparator.comparingInt(entry -> entry.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue)));

    }

}
