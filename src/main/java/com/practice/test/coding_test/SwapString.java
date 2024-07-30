package com.practice.test.coding_test;

public class SwapString {
    public static void main(String[] args) {
        String str = "ABC";
        permuatation1(0,str);
    }

    private static void permuatation1(int index, String str) {
        if(index==str.length()-1){
            System.out.println(str);
            return;
        }
        for (int i = index; i < str.length(); i++) {
            str=swap(str,i,index);
            permuatation1(index+1,str);
            str=swap(str,i,index);
        }
    }




















    private static void permuatation(int index, String str) {
        // Base condition
        if(index==str.length()-1){
            System.out.println(str);
            return;
        }
        for (int i = index; i < str.length(); i++) {
            // swap
            str=swap(str,i,index);
            // recursion
            permuatation(index+1,str);
            // backtracking
            str=swap(str,i,index);
        }
    }
    public static String swap(String str, int index, int i) {
        char[] charArr = str.toCharArray();
        char tempChar = charArr[index];
        charArr[index] = charArr[i];
        charArr[i] = tempChar;
        return new String(charArr);
    }
}
