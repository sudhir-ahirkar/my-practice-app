package com.practice.test.hashmap;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// 383. Ransom Note
/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true


Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters.
* */
public class RansomNote {
    public static void main(String[] args) {
//        String ransomNote = "a", magazine = "b";
//        String ransomNote = "aa", magazine = "aba";
        String ransomNote = "aa", magazine = "abvta";
        boolean checkCanConstruct = canConstruct1(ransomNote,magazine);
        System.out.println("checkCanConstruct=========>"+checkCanConstruct);
    }

    private static boolean canConstruct1(String ransomNote, String magazine) {
        Map<Character, Long> magMap = magazine.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for(char c : ransomNote.toCharArray()) {
            if(!magMap.containsKey(c) || magMap.get(c)==0){
                return false;
            }
            magMap.put(c,magMap.get(c)-1);
        }
        return true;
    }




/*    private static boolean canConstruct1(String ransomNote, String magazine) {
        Map<Character, Long> magazineMap = magazine.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //========== OR ===============
        for (char c : magazine.toCharArray()){
            magazineMap.put(c,magazineMap.getOrDefault(c,0l)+1);
        }
    }*/


    /*
    * The "Ransom Note" problem on LeetCode asks to determine if it's possible to construct a ransom note from a given magazine. Both the ransom note and magazine are represented as strings composed of lowercase English letters.

Here's an explanation of a common approach to solve this problem:

Hash Map to Store Character Counts: We can solve this problem efficiently by using a HashMap to store the counts of each character in the magazine string.
Counting Characters in Magazine: We iterate through the magazine string and count the occurrences of each character. We store these counts in the HashMap.
Checking Ransom Note: After counting the characters in the magazine, we iterate through the characters in the ransom note. For each character, we check if it's present in the HashMap and if its count is greater than zero. If both conditions are met, we decrement its count in the HashMap. If any character in the ransom note is not present in the HashMap or its count is zero, we return false.
Returning the Result: If we successfully iterate through all characters in the ransom note and find each character's count in the magazine, we return true, indicating that it's possible to construct the ransom note from the magazine.
    * */
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Long> mapChar = magazine.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (char c : ransomNote.toCharArray()){
/*            if(!mapChar.containsKey(c)){
                Long l = mapChar.get(c) > 1 ? mapChar.put(c, mapChar.get(c) - 1) : mapChar.remove(c);
            }else{
                return false;
            }*/
            //================== OR ======================
            if(!mapChar.containsKey(c) || mapChar.get(c)==0){
                return false;
            }
            mapChar.put(c, mapChar.get(c) - 1);
        }
        return true;
    }
}
