package com.practice.test.hashmap;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
*
* Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.


Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
*
* */
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        boolean isAnagram = isAnagram2(s,t);
        System.out.println("isAnagram=====>"+isAnagram);
    }

    private static boolean isAnagram2(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Long> sMap = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // iterate and fill char alphabate array for both String
        // write logic to check

        char[] aphaArr = new char[26];
        for (char c : s.toCharArray()) {
            aphaArr[c-'a']++;
        }
        for (char c : t.toCharArray()) {
            aphaArr[c-'a']--;
        }
        for (char c : aphaArr){
            if(c!=0){
                return false;
            }
        }
       return true;
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Long> sCharMap = s.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Long> tCharMap = t.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (char c : s.toCharArray()) {
//            if(!(sCharMap.containsKey(c) && tCharMap.containsKey(c)
//                    && sCharMap.get(c)!=tCharMap.get(c))){
//                return false;
//            }
            System.out.println("sCharMap.containsKey(c)====>"+sCharMap.containsKey(c));
            System.out.println("tCharMap.containsKey(c)====>"+tCharMap.containsKey(c));
            System.out.println("===============================================");
            if((!sCharMap.containsKey(c) || !tCharMap.containsKey(c)) || sCharMap.get(c)!=tCharMap.get(c)){
                return false;
            }
        }
        return true;
    }
}
