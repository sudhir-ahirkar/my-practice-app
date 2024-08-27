package com.practice.test.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstringKDistinct {
    public static void main(String[] args) {
        String s = "eceba";
        int k = 3;
        int result = lengthOfLongestSubstringKDistinct(s,k);
        System.out.println("result ====>"+result);
    }

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) {
            return 0;
        }

        Map<Character, Integer> charCount = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            charCount.put(rightChar, charCount.getOrDefault(rightChar, 0) + 1);

            while (charCount.size() > k) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

}
