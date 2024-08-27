package com.adidas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueSubstringsOfGiveString {
    public static void main(String[] args) {
        //    Input : abbccde, 2
//    Output : ["ab" "bb", "bc", "cc", "cd", "de"]
        String input = "abbccde";
        //    Output : ["ab" "bb", "bc", "cc", "cd", "de"]

         List<String> resultLst =  getSubstringLst(input);
        System.out.println("resultLst===>"+resultLst);

    }

    private static List<String> getSubstringLst(String input) {
        List<String> resultLst = new ArrayList<>();
        StringBuilder stB = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,i);
                stB.append(ch).append("");
            }else{
               i = map.get(ch);
               resultLst.add(stB.toString());
               map.clear();
//              String st = stB.substring(i);
//              stB = new StringBuilder(st);
                stB = new StringBuilder();
            }
        }
        resultLst.add(stB.toString());
        return resultLst;
    }
}
