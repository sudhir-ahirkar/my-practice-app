package com.practice.test.string;

public class PermuationOfString {
    public static void main(String[] args) {
        String str = "ABC";
        permuate(0,str);
    }

    private static void permuate(int index, String str) {
        // base condition
        if(index==str.length()-1){
            System.out.println(str);
            return;
        }
        for (int i = index; i < str.length(); i++) {
            //swap
            str=swap(str,i,index);
            // recursion
            permuate(index+1,str);
            // backtrack
            str=swap(str,i,index);
        }
    }
    private static String swap(String str, int i, int index) {
        char[] charArr = str.toCharArray();
        char temp = charArr[i];
        charArr[i]=charArr[index];
        charArr[index]=temp;
        return new String(charArr);
    }
}
