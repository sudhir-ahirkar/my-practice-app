package com.practice.test.coding_test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodingSkillPaypal {

    /*
    *
    * Input:

dict[] = { this, th, is, famous, Word, break, b, r, e, a, k, br, bre, brea, ak, problem };

word = Wordbreakproblem

Output:

Word b r e a k problem
Word b r e ak problem
Word br e a k problem
Word br e ak problem
Word bre a k problem
Word bre ak problem
Word brea k problem
Word break problem
    *
    *
    *
    *
    * String dict[] = {"sudir", "i", "s","is", "a", "engineer"};
String input = "sudirisaengineer";
"sudir is a engineer"
"sudir i s a engineer
    * */


    public static void main(String[] args) {

         String[] input = { "this", "th", "is", "famous", "Word", "break", "b", "r", "e", "a", "k", "br", "bre", "brea", "ak", "problem" };
         String word  = "Wordbreakproblem";
         List<String> dictLst = Stream.of(input).collect(Collectors.toList());

         StringBuilder builder = new StringBuilder();
        int breakPointer = 0;
        for (int i = 0; i < word.length(); i++) {
            String str1 = word.substring(breakPointer,i);
            if (dictLst.contains(str1)) {
                builder.append(str1).append(" ");
                breakPointer = i;
            }
        }
        System.out.println("builder===>"+builder.append(word.substring(breakPointer,word.length())));
    }

}
