package com.practice.test.string;

public class InterChangeFirstAndLastCharOfEachWordOfString {
    public static void main(String[] args) {
        String str = "I am from India";
        String result = interchangeFirstAndLast(str);
        System.out.println("result====>"+result);
    }
    private static String interchangeFirstAndLast(String str) {
        String[] strArr = str.split(" ");
        StringBuilder strBuilder = new StringBuilder();
        for(int i = 0; i < strArr.length; i++) {
            String st = strArr[i];
            if(st.length()==1)
                continue;
            char[] charArr=st.toCharArray(); // imp
            char temp = charArr[charArr.length - 1];
            charArr[charArr.length - 1]=charArr[0];
            charArr[0]=temp;
            strBuilder.append(charArr).append(" "); //imp
        }
        return strBuilder.toString();
    }
}
