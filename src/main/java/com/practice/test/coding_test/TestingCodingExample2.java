package com.practice.test.coding_test;

import java.util.HashMap;
import java.util.Map;

public class TestingCodingExample2 {

    public static void main(String[] args) {
        String str = "SudhirAhirkar";
        Map<Character,Integer> freqMap = findFrequencyOfEachChar(str);
        System.out.println("freqMap====>"+freqMap);
    }

    private static Map<Character, Integer> findFrequencyOfEachChar(String str) {
        Map<Character,Integer> charFreqMap  = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
             charFreqMap.put(str.charAt(i),charFreqMap.getOrDefault(str.charAt(i),0)+1);
        }
        return charFreqMap;
    }
}
