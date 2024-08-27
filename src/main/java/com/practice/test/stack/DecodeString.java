package com.practice.test.stack;

import java.util.Stack;
//394. Decode String

/*
* Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.



Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"


Constraints:

1 <= s.length <= 30
s consists of lowercase English letters, digits, and square brackets '[]'.
s is guaranteed to be a valid input.
All the integers in s are in the range [1, 300].
* */
public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        String result = decodeString(s);
        System.out.println("Decoded string: " + result);  // Output: "accaccacc"

    }

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>(); // Stack to store counts of repetitions
        Stack<StringBuilder> resultStack = new Stack<>(); // Stack to store the intermediate results
        StringBuilder currentString = new StringBuilder(); // To store the current working substring
        int k = 0; // To store the number multiplier

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // If the character is a digit, build the full number
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push the current count and current string to the stacks
                countStack.push(k);
                resultStack.push(currentString);
                // Reset for the next segment
                currentString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                // Pop the last count and last string
                StringBuilder decodedString = resultStack.pop();
                int repeatCount = countStack.pop();
                // Append the repeated currentString to the decodedString
                for (int i = 0; i < repeatCount; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                // If it's a letter, add it to the current substring
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }
}
