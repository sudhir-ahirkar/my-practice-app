package com.practice.test.hashmap;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//1160. Find Words That Can Be Formed by Characters

/*
* You are given an array of strings words and a string chars.
A string is good if it can be formed by characters from chars (each character can only be used once).
Return the sum of lengths of all good strings in words.

Example 1:

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
* */
public class CountCharacters {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"}; String chars = "atach";
        int result = countCharacters1(words,chars);
        System.out.println("result====>"+result);
    }

    private static int countCharacters(String[] words, String chars) {
        StringBuilder sb = new StringBuilder();
        int check = 0;
        Map<Character, Long> chMap = chars.chars()
                .mapToObj(c -> (char) c)  // Convert each int to a Character
                .collect(Collectors.groupingBy(
                        c -> c,               // Group by character itself
                        Collectors.counting() // Count the occurrences of each character
                ));
        for(String st : words) {
            char[] chArr = st.toCharArray();
//            Map<Character,Long> chMap = Arrays.stream(st.toCharArray()).mapToObj(ch->(char)ch)
//                    .collect(Collectors.groupingBy(Function::identity, Collectors.counting));
//            Map<Character, Long> chMap = chars.chars()
//                    .mapToObj(c -> (char) c)  // Convert each int to a Character
//                    .collect(Collectors.groupingBy(
//                            c -> c,               // Group by character itself
//                            Collectors.counting() // Count the occurrences of each character
//                    ));
            boolean checkString = false;
            for(char ch : chArr){
                //  if(chars.indexOf(ch)!=-1){
                //     checkString = true;
                //  }else{
                //     checkString = false;
                //     break;
                //  }
                if(chMap.containsKey(ch) && chMap.get(ch)>0) {
                    checkString = true;
                    chMap.put(ch,chMap.get(ch)-1);
                }else{
                    checkString=false;
                    break;
                }
            }

            if(checkString){
                sb.append(st);
            }
        }
        return sb.toString().length();
    }

    public static int countCharacters1(String[] words, String chars) {
        int[] charCount = new int[26]; // Array to hold frequency of each character in `chars`

        // Count each character in `chars`
        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }

        int totalLength = 0;

        for (String word : words) {
            if (canBeFormed(word, charCount)) {
                totalLength += word.length();
            }
        }

        return totalLength;
    }


    // Nice solution
    // Helper method to check if a word can be formed with the available characters in `charCount`
    private static boolean canBeFormed(String word, int[] charCount) {
        int[] wordCount = new int[26]; // Array to hold frequency of each character in `word`

        for (char c : word.toCharArray()) {
            wordCount[c - 'a']++;
            // If wordCount exceeds charCount at any point, word can't be formed
            System.out.println("wordCount[c - 'a']====>"+wordCount[c - 'a']);
            System.out.println("charCount[c - 'a']====>"+charCount[c - 'a']);

            if (wordCount[c - 'a'] > charCount[c - 'a']) {
                return false;
            }
        }

        return true;
    }
}
