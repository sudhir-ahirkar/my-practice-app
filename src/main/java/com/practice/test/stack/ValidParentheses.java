package com.practice.test.stack;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
//        String s = "()[]{}[}[";
        String s = "({[]})[]{}[";
        System.out.println(isValidParenthesis(s));

    }

    public static boolean isValidParenthesis(String str) {
        Map<Character, Character> charMap = Map.of('(', ')', '{', '}', '[', ']');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(charMap.containsKey(c)) {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                char previousEle = stack.pop();
                if(charMap.get(previousEle)!=c) {
                    return false;
                }
            }
        }
        return true;
    }
}
