package com.practice.test.hashmap;

import java.util.*;
import java.util.stream.Collectors;

//49. Group Anagrams
/*
* Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]

* */
public class GroupAnagram {
    public static void main(String[] args) {
       String[] strs = {"eat","tea","tan","ate","nat","bat"}; //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        List<List<String>> resultLst = groupAnagrams(strs);
        System.out.println(resultLst);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String key = new String(chArr);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }
        }
        return map.values().stream().collect(Collectors.toList());
    }
}
