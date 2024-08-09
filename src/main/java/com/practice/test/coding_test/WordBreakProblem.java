package com.practice.test.coding_test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class WordBreakProblem {

//    Input:
//    dict[] = { this, th, is, famous, Word, break, b, r, e, a, k, br, bre, brea, ak, problem };
//    word = Wordbreakproblem
//
//    Output:
//    Word b r e a k problem
//    Word b r e ak problem
//    Word br e a k problem
//    Word br e ak problem
//    Word bre a k problem
//    Word bre ak problem
//    Word brea k problem
//    Word break problem

    public static void main(String[] args) {
        String[] dict = {"this", "th", "is", "famous", "Word", "break", "b", "r", "e", "a", "k", "br", "bre", "brea", "ak", "problem"};
        String word = "Wordbreakproblem";
        breakWord(word, dict);
    }

    private static void breakWord(String word, String[] dict) {
        Set<String> set = Arrays.stream(dict).collect(Collectors.toSet());
        breakWord(word, "", set);
    }

    private static void breakWord(String word, String ans, Set<String> set) {
        if (word.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < word.length(); i++) {
            String left = word.substring(0, i + 1);
            if (set.contains(left)) {
                String right = word.substring(i + 1);
                breakWord(right, ans + " " + left, set);
            }
        }
    }
}