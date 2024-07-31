package com.practice.test.string;

import java.util.HashMap;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class LongestPalindrome {
    public static void main(String[] args) {
//        String s = "abccccdd"; //7
//        String s = "a"; // 1
//        String s = "aa";//2
//        String s = "aaa"; // 3
//        String s = "bananas"; //5
        String s = "tattarrattacymui"; //12
        int length = longestPalindrome(s);
        System.out.println("length===>"+length);
    }

/*    private static int longestPalindrome1(String s) {
        Map<Character, Integer> charMap = s.chars().mapToObj(c -> (char) c).collect(groupingBy(identity(), counting()));
        for(int i=0; i>s.length(); i++){
            char c = s.charAt(i);
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("charMap=====>"+charMap);
        long  result=0;
        for (Map.Entry<Character,Long> entry : charMap.entrySet()){
//            result = result + entry.getValue()%2==0?entry.getValue()==2?entry.getValue():0;
            if(entry.getValue()%2==0 || entry.getValue()==2){
                result+=entry.getValue();
            }
        }
       return result+1;
    }*/


    public static int longestPalindrome(String s) {
        // Map<Character, Long> charMap = s.chars().mapToObj(c -> (char) c).collect(groupingBy(identity(), counting()));
        Map<Character, Integer> charMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("charMap=====>"+charMap);
        int  result=0;
        boolean check = true;
        for (Map.Entry<Character,Integer> entry : charMap.entrySet()){
            if(entry.getValue()%2!=0){
                check = false;
            }
            if(charMap.size()==1){
                return entry.getValue();
            }
            if(entry.getValue()>=2){
                result+=entry.getValue()%2!=0?entry.getValue()-1:entry.getValue();
            }
        }
        return check?result:result+1;

    }
}
