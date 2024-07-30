package com.practice.test.coding_test;

import java.util.Arrays;

public class CondingSkillGAP {
   // Sum of all Digit of String and return the result
    public static void main(String[] args) {
       String str = "A12b45c6";
       // example like 12+45+6
       str=str.replaceAll("[A-Za-z]","-").trim();
       System.out.println("str===>"+str);
        int sum = Arrays.stream(str.split("-")).filter(str1->!str1.isEmpty())
//                .map(st->Integer.valueOf(st))
                .mapToInt(num->Integer.parseInt(num)).sum();
        System.out.println("sum===>"+sum);
    }

    public static boolean checkCharacter(char ch) {
        if (Character.isDigit(ch)) {
            return false;
        }
        return true;
    }

    /*public boolean isNum(int ele){

        if(){

            return false;
        }

        return true;

    }*/
}
