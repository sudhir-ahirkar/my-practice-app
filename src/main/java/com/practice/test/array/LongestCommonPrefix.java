package com.practice.test.array;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String longestCommonPrefix = longestCommonPrefix1(strs);
        System.out.println("longestCommonPrefix====>"+longestCommonPrefix);
    }

    private static String longestCommonPrefix1(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }


    /*    Write a function to find the longest common prefix string amongst an array of strings.
        If there is no common prefix, return an empty string "".
        Example 1:
        Input: strs = ["flower","flow","flight"]
        Output: "fl"
        Example 2:
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.*/
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
