package com.practice.test.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// 205. Isomorphic Strings
/*
*
* Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true


Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
* */
public class IsomorphicStrings {
    public static void main(String[] args) {
//       String s = "egg", t = "add";
//       String s = "bbbaaaba", t ="aaabbbba";
        String s = "paper", t = "title";
       boolean isIsomorphic = isIsomorphic1(s,t);
        System.out.println("isIsomorphic======>"+isIsomorphic);
    }

    // Trying one more time for practice
    private static boolean isIsomorphic1(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> sMap = new HashMap<>();
        Map<Character,Character> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar)){
                if(tMap.containsKey(tChar)){
                    return false;
                }
                sMap.put(sChar,tChar);
                tMap.put(tChar,sChar);
            }else{
                if(sMap.get(sChar)!=tChar){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isIsomorphic(String s, String t) {
//        Map<Character, Long> sCharMap = s.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting(), LinkedHashMap::new));
/*        LinkedHashMap<Character, Integer> sCharMap = s.chars().mapToObj(c -> (char) c).collect(Collectors.toMap(c -> c, c -> 1, Integer::sum, LinkedHashMap::new));
        LinkedHashMap<Character, Integer> tCharMap = t.chars().mapToObj(c -> (char) c).collect(Collectors.toMap(c -> c, c -> 1, Integer::sum, LinkedHashMap::new));
        for (int i = 0; i < s.length(); i++) {
            Character charS = (Character) s.charAt(i);
            System.out.println("charS====>"+charS);
            System.out.println("sCharMap.get(charS)====>"+sCharMap.get(charS));
            System.out.println("===========================");
            Character charT = (Character) t.charAt(i);
            System.out.println("charT====>"+charT);
            System.out.println("charT.get(charS)====>"+tCharMap.get(charT));
           if(sCharMap.get(charS)!=tCharMap.get(charT) || charT!=charS){
                return false;
            }
        }
        return true;*/
/*        LinkedHashMap<Character, Integer> sCharMap = s.chars().mapToObj(c -> (char) c).collect(Collectors.toMap(c -> c, c -> 1, Integer::sum, LinkedHashMap::new));
        LinkedHashMap<Character, Integer> tCharMap = t.chars().mapToObj(c -> (char) c).collect(Collectors.toMap(c -> c, c -> 1, Integer::sum, LinkedHashMap::new));
        for (int i = 0; i < s.length(); i++) {
            Character charS = (Character) s.charAt(i);
            Character charT = (Character) t.charAt(i);
            if(charT==charS){
                return false;
            }
            if(sCharMap.get(charS)!=tCharMap.get(charT)){
                return false;
            }
        }
        return true;*/

        char[] charArray = t.toCharArray();
        char[] strArr = s.toCharArray();
        if(charArray.length!=strArr.length){
            return false;
        }
        Map<Character,Character> wordCharMap = new HashMap<>();
        Map<Character,Character> charWordMap = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            char word = strArr[i];
            if(!charWordMap.containsKey(c)){
                if(wordCharMap.containsKey(word)){  // if we comments then this (String s ="dog dog dog dog",pattern ="abba";) will true
                    return false;
                }
                charWordMap.put(c,word);
                wordCharMap.put(word,c);
            }else{
                System.out.println("charWordMap.get(c)=====>"+charWordMap.get(c));
                System.out.println("word====>"+word);
                if(!charWordMap.get(c).equals(word)){
                    return false;
                }
            }
        }
        return true;
    }

    /// trying one more time


}
