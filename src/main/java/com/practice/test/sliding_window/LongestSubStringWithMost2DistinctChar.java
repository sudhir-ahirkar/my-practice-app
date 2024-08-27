package com.practice.test.sliding_window;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//LeetCode Problem 159: Longest Substring with At Most Two Distinct Characters
public class LongestSubStringWithMost2DistinctChar {

    // Solution approach

    /*
    *
    * To find the longest substring with at most two distinct characters, we can use the sliding window technique with a HashMap to efficiently keep track of the characters and their frequencies in the current window.

Problem Recap
Input: A string s.
Output: The length of the longest substring that contains at most two distinct characters.
Optimized Solution Approach
We can solve this problem using the sliding window approach with the following steps:

Initialize Pointers and Data Structures:

Use two pointers (left and right) to represent the window of characters we're currently considering.
Use a HashMap charCount to store the count of each character within the window.
Expand the Window:

Move the right pointer to expand the window by adding one character from the string s.
Update the character count in the HashMap.
Shrink the Window if Needed:

If the window contains more than two distinct characters, move the left pointer to shrink the window until we have at most two distinct characters.
Decrease the count of the character at the left pointer in the HashMap, and remove it from the map if its count reaches zero.
Update the Maximum Length:

During each step, check the length of the current valid window (with at most two distinct characters) and update the maximum length found so far.
Continue Until the End of the String.

Java Implementation
Here’s a Java implementation of the solution:


    * */
    public static void main(String[] args) {
        String s = "eceba";
        int result = lengthOfLongestSubstringTwoDistinct(s);
        System.out.println("The length of the longest substring with at most two distinct characters is: " + result);  // Output: 3

    }

/*    private static int lengthOfLongestSubstringTwoDistinct(String s) {
        int left=0;
        int right=0;
        int n = s.length()-1;
        Map<Character,Integer> chaMap = new HashMap<>();
        int maxLenght = 0;
//        Map<Character, Long> chMap = s.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (right = 0; right< n; right++) {
            char ch = s.charAt(right);
            chaMap.put(ch,chaMap.getOrDefault(ch,0)+1);
            while (chaMap.size()>=2){

            }
        }

        return 0;
    }*/

    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> charCount = new HashMap<>();  // Map to store character counts in the current window
        int left = 0;  // Left pointer of the sliding window
        int maxLength = 0;  // Maximum length of the substring found so far

        // Expand the window with the right pointer
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            charCount.put(rightChar, charCount.getOrDefault(rightChar, 0) + 1);

            // Shrink the window until there are at most two distinct characters
            while (charCount.size() > 2) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);

                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }

                left++;  // Move the left pointer to shrink the window
            }

            // Update the maximum length of the valid substring found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
