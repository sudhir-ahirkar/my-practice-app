package com.practice.test.hashmap;

import java.util.*;

// 290. Word Pattern

/*
* Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
*
*
Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false


Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
* */
public class WordPattern {
    public static void main(String[] args) {
//        String pattern = "abba", s = "dog cat cat dog"; // true
//        String pattern ="aba", s ="cat cat cat dog"; // false
//        String pattern ="abab", s ="dog cat cat dog"; // false
        String pattern ="abba", s ="dog dog dog dog"; // false
        boolean isWordPattern = wordPattern2(pattern,s);
        System.out.println("isWordPattern====>"+isWordPattern);
    }

    private static boolean wordPattern2(String pattern, String s) {
        // convert both string to Array
        // check if 2 array length is same continue otherwise return false
        // 2  map
        // Write logic to find pattern
        // return true or false

        // step 1
        String[] patterArr = s.split(" ");
        char[] charArr = pattern.toCharArray();

        //  step 2
        if(patterArr.length!=charArr.length){
            return false;
        }
        // step 3
        Map<String,Character> patternMap = new HashMap<>();
        Map<Character,String> charMap = new HashMap<>();

        // step 4
        // logic to find pattern
        for (int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            String p = patterArr[i];
            if(!patternMap.containsKey(p)){
                if(charMap.containsKey(c)){
                    return false;
                }
                patternMap.put(p,c);
                charMap.put(c,p);
            }else{
                if(patternMap.get(p)!=c){
                    return false;
                }
            }
        }
        return true;
    }

    /*
    *
    * The "Word Pattern" problem on LeetCode asks to determine if a pattern matches with a given string. Here's the explanation of a common approach to solve this problem:

HashMap for Mapping: We can solve this problem efficiently by using a HashMap to map characters of the pattern to words in the string and vice versa.
Splitting the String: We split the input string into words using space as a delimiter. We also convert the pattern string into a character array for easy traversal.
Iterating Through Pattern and Words: We iterate through both the pattern and the words simultaneously. For each character c in the pattern and each word word in the string:
If the character c is not present in the pattern map (patternMap), we check if the word is already mapped to any other character in the word map (wordMap). If it is, we return false, as it violates the pattern.
If the character c is present in the pattern map, we check if the word mapped to it matches the current word. If it does not match, we return false.
Checking Mapping Uniqueness: After processing all characters and words, we need to ensure that each character in the pattern maps to a unique word and vice versa. If not, we return false.
Returning the Result: If we successfully iterate through both the pattern and the words without any violations, we return true, indicating that the pattern matches the string.

    *
    * */
    private static boolean wordPattern1(String pattern, String s) {
        char[] charArray = pattern.toCharArray();
        String[] strArr = s.split(" ");
        if(charArray.length!=strArr.length){
            return false;
        }
        Map<String,Character> wordCharMap = new HashMap<>();
        Map<Character,String> charWordMap = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            String word = strArr[i];
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

    public static boolean wordPattern(String pattern, String s) {
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

        List<Map.Entry<Character, Integer>> patternLst =  new ArrayList<>(patternMap.entrySet());
        List<Map.Entry<String, Integer>> charMapLst =  new ArrayList<>(charMap.entrySet());

        for (int i = 0; i < patternLst.size(); i++) {
            Map.Entry<Character, Integer> patternEntry = patternLst.get(i);
            Map.Entry<String, Integer> charEntry = charMapLst.get(i);
            if(charEntry.getValue()!=patternEntry.getValue() ){
                return false;
            }
        }
        return true;
    }

        private static boolean checkpattern(String p, String s) {
        String[] sArr = s.split(" ");
        for (int i = 0; i < s.length()/2; i++) {
            if(!((sArr[i]==sArr[s.length()-1-i])
                    && (p.charAt(i)==p.charAt(s.length()-1-i)))){
                return false;
            }
        }
        return true;
    }
}
