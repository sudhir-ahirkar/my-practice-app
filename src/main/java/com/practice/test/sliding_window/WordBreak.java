package com.practice.test.sliding_window;



//139. Word Break

import java.util.Arrays;
import java.util.List;

/*
*
*
* Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

Note that the same word in the dictionary may be reused multiple times in the segmentation.



Example 1:

Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
Example 2:

Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.
Example 3:

Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false


Constraints:

1 <= s.length <= 300
1 <= wordDict.length <= 1000
1 <= wordDict[i].length <= 20
s and wordDict[i] consist of only lowercase English letters.
All the strings of wordDict are unique.
* */
public class WordBreak {

    public static void main(String[] args) {
//        String s = "leetcode"; List<String> wordDict = Arrays.asList("leet","code");
//        String s = "applepenapple"; List<String> wordDict = Arrays.asList("apple","pen");
        String s = "catsandog"; List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");

        boolean result = wordBreak(s,wordDict);
        System.out.println("result===>"+result);
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        int breakPointer = 0;
        int maxLength = 0 ;
        for (int i = 0; i < s.length(); i++) {
            String str1 = s.substring(breakPointer,i);
            if (wordDict.contains(str1)) {
//                builder.append(str1).append(" ");
                maxLength+=str1.length();
                breakPointer = i;
            }
        }
        maxLength += s.substring(breakPointer,s.length()).length();
        System.out.println("s length ===>"+s.length());
        System.out.println("maxLength===>"+maxLength);
        return s.length()==maxLength;
    }
}
