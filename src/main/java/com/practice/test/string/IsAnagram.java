package com.practice.test.string;
import java.util.HashMap;
import java.util.Map;

/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.
        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original
        letters exactly once.
        Example 1:

        Input: s = "anagram", t = "nagaram"
        Output: true
        Example 2:

        Input: s = "rat", t = "car"
        Output: false
        Constraints:

        1 <= s.length, t.length <= 5 * 104
        s and t consist of lowercase English letters.*/
public class IsAnagram {

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        boolean isAnagram = isAnagramPractice1(s1, s2);
        System.out.println("isAnagram====>" + isAnagram);
    }

    private static boolean isAnagramPractice1(String s1, String s2) {
        if(s1.length()!=s2.length()) {
            return false;
        }
        int[] charArr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            charArr[s1.charAt(i)-'a']++;
            charArr[s2.charAt(i)-'a']--;
        }
        for (int c : charArr) {
            if(c!=0) {
                return false;
            }
        }
        return true;
    }













    public static boolean isAnagramPractice(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] charArr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i)-'a');
            System.out.println(t.charAt(i)-'a');

            charArr[s.charAt(i)-'a']++;
            charArr[t.charAt(i)-'a']--;
        }
        for (int val : charArr){
            if(val!=0){
                return false;
            }
        }
        return true;
    }

    //Approach 1
    public static boolean isAnagram1(String s, String t) {
        if (s.length() != t.length())
            return true;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Printing value===>"+s.charAt(i)+" "+t.charAt(i));
            System.out.println("Printing ASCII value ===>");
            int s1 = s.charAt(i);
            int t1 = t.charAt(i);
            System.out.println(s1);
            System.out.println(t1);
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    //Approach 2
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return true;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> mp : map1.entrySet()) {
            if (!(map2.containsKey(mp.getKey()) && mp.getValue() == map2.get(mp.getKey()))) {
                return false;
            }
        }
        return true;
    }
}



