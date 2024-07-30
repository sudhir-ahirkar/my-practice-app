package com.practice.test.string;

/*The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

        For example, "ACGAATTCCG" is a DNA sequence.
        When studying DNA, it is useful to identify repeated sequences within the DNA.
        Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than
        once in a DNA molecule. You may return the answer in any order.

        Example 1:
        Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
        Output: ["AAAAACCCCC","CCCCCAAAAA"]
        Example 2:

        Input: s = "AAAAAAAAAAAAA"
        Output: ["AAAAAAAAAA"]

        Constraints:

        1 <= s.length <= 105
        s[i] is either 'A', 'C', 'G', or 'T'*/

import java.util.*;

public class FindRepeatedDnaSequences {

    public static void main(String[] args) {
//        String str = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"; // [AAAAACCCCC, CCCCCAAAAA]
        String str = "AAAAAAAAAAAAA"; //[AAAAAAAAAA]
        List<String> lst = findRepeatedDnaSequences(str);
        System.out.println("lst=====>"+lst);
    }
    private static List<String> findRepeatedDnaSequences(String str) {
        List<String> lst = new ArrayList<>();
        Map<String,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length()-10; i++) {
//            Integer addedValue = map.putIfAbsent(str.substring(i, i + 10), 1);
//            if(addedValue!=null){
//                map.computeIfPresent(str.substring(i, i + 10),(k,v)->v+1);
//            }
            String dnaSeq = str.substring(i, i + 10); //  Very important condition
            map.put(dnaSeq,map.getOrDefault(dnaSeq,0)+1);
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                lst.add(entry.getKey());
            }
        }
        return lst;
    }
}
