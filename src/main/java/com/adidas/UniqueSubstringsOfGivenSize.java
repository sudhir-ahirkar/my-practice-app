package com.adidas;

import java.util.*;
import java.util.stream.Stream;

public class UniqueSubstringsOfGivenSize {
    public static void main(String[] args) {
        String input = "abbccde";
        //   Output : ["ab" "bb", "bc", "cc", "cd", "de"]
         Set<String> resultLst =  getSubstringLst(input,2);
        System.out.println("resultLst===>"+resultLst);

//        Map<String, Integer> result = Stream.of("a:332", "b:42", "c:", "d", "f:2345", "i:-34");
    }

    private static Set<String> getSubstringLst(String input, int size) {
        Set<String> resultSet = new LinkedHashSet<>();
        for (int i = 0; i < input.length()-size; i++) {
            String ch = input.substring(i,i+size);
                resultSet.add(ch);
        }
        resultSet.add(input.substring(input.length()-2));
        return resultSet;
    }
}
