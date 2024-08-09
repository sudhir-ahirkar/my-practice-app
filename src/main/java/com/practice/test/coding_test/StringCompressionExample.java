package com.practice.test.coding_test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCompressionExample {
    public static void main(String[] args) {
        // input
        String s = "AAABCCDDDEEE"; // output : resultStr = "A3B1C2D3E1"
        String resultStr = compression1(s);
        System.out.println(resultStr);
    }

    private static String compression(String s) {
    StringBuilder strBuilder = new StringBuilder();
    int count = 1;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }else{
                strBuilder.append(s.charAt(i)).append(count);
                count=1;
            }
        }
        return strBuilder.append(s.charAt(s.length()-1)).append(count).toString();
    }

/// Using LinkedHashMap
    private static String compression1(String s) {
        Map<Character, Long> charFreqMap = s.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        StringBuilder strBuilder = new StringBuilder();
        for (Map.Entry<Character,Long> entry : charFreqMap.entrySet()) {
            strBuilder.append(entry.getKey()).append(entry.getValue());
        }
        return strBuilder.toString();
    }
}
