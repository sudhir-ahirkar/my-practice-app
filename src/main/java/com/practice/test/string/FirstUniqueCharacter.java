package com.practice.test.string;
//387. First Unique Character in a String

/*
* Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.



Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1


Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters.*/
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int result = firstUniqChar(s);
        System.out.println("The index of the first unique character is: " + result); // Output: 2
    }

    public static int firstUniqChar(String s) {
        int[] charCount = new int[26];  // Array to store the frequency of each character
        // First pass: Count frequency of each character in the string
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        // Second pass: Find the first character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;  // Return the index of the first unique character
            }
        }
        return -1;  // Return -1 if there is no unique character
    }
}
