package com.practice.test.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacter {

    public static void main(String[] args) {
        String str = "ABCDEFGABEF";
//        List<String> lst = longestUniqueSubstring(str);
//        System.out.println("lst=====>"+lst);
          int length = longestSubstringLength(str);
          System.out.println("length===>"+length);
//        O/P : “ABCDEFG”, “BCDEFGA”, and “CDEFGAB”
    }


    // Find all substring from given string
    static List<String> longestUniqueSubstring(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder strBuilder = new StringBuilder();
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),i);
                strBuilder.append(str.charAt(i));
            }else{
                 lst.add(strBuilder.toString());
                 strBuilder = new StringBuilder();
                 i = map.get(str.charAt(i));
                 map.clear();
            }
        }
        return lst;
    }

    // Find all substring from given string
    static int longestSubstringLength(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder strBuilder = new StringBuilder();
        List<String> lst = new ArrayList<>();
        int currentLength = 0;
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i),i);
                strBuilder.append(str.charAt(i));
                currentLength++;
            } else {
                lst.add(strBuilder.toString());
                strBuilder = new StringBuilder();
                i = map.get(str.charAt(i));
                map.clear();
                maxLength=Math.max(maxLength,currentLength);
                currentLength=0;
            }
        }
        return maxLength;
    }
}
