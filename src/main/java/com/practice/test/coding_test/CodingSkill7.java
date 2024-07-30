package com.practice.test.coding_test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodingSkill7 {

    public static void main(String[] args) {
        String name="saslldldqldldl";
        char maxChar = getMaxRepeatingChar1(name);
        System.out.println("Max repeating character: " + maxChar);
    }

/*    private static char getMaxRepeatingChar2(String name) {

    }*/

    private static char getMaxRepeatingChar1(String name) {
        Map<Character, Long> charFrequency = name.chars().mapToObj(ele -> (char) ele).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        char maxChar = charFrequency.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow(()->new RuntimeException("No Max Character found"));
        return maxChar;
    }

    private static char getMaxRepeatingChar(String name) {

        Map<Character,Integer> charMap = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            charMap.put(c,charMap.getOrDefault(c,0)+1);
        }

        int max = Integer.MIN_VALUE;
        char maxChar =0;

        for (Map.Entry<Character,Integer> charEntry : charMap.entrySet()){
                      if(charEntry.getValue()>max){
                          max= charEntry.getValue();
                          maxChar=charEntry.getKey();
                      }
        }
      return maxChar;
    }
}
