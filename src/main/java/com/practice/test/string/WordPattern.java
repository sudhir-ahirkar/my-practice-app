package com.practice.test.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
//        String pattern = "abba", s = "dog cat cat dog";
        String pattern = "aba", s = "cat cat cat dog";
        boolean isValid = wordPattern(pattern,s);
        System.out.println("isValid=====>"+isValid);
    }
    public static boolean wordPattern(String pattern, String s) {
        /*if(pattern.length()!=s.length())
            return false;
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> patternMap = new LinkedHashMap<>();
        for(int i=0; i<pattern.length(); i++){
            char c = s.charAt(i);
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        }
        if(charMap.size()!=patternMap.size()){
            return false;
        }
        return true;*/
        Map<String, Integer> charMap = new LinkedHashMap<>();
        String[] strArr = s.split(" ");
        for(int i=0; i<strArr.length; i++){
            String srt = strArr[i];
            charMap.put(srt, charMap.getOrDefault(srt, 0) + 1);
        }
        Map<Character, Integer> patternMap = new LinkedHashMap<>();
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("charMap===>"+charMap);
        System.out.println("patternMap===>"+patternMap);

        if(charMap.size()!=patternMap.size() && checkpattern(pattern,s)){
            return false;
        }
        return true;
    }
    private static boolean checkpattern(String p, String s) {
        String[] sArr = s.split(" ");
        for (int i = 0; i < s.length()/2; i++) {
             if(!((sArr[i]==sArr[s.length()-1-i]) && (p.charAt(i)==p.charAt(s.length()-1-i)))){
                 return false;
             }
        }
        return true;
    }
}
