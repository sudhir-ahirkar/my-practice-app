package com.practice.test.coding_test;

public class TestCodingSkill2 {
    public static void main(String[] args) {
        String str1 = "aaabbbb";
        String str2 = "aaaabbb";  // s1 = aaabbbb   s2 = aaaabbb   false;

        // if character match including length return true (note : order of character can ignore)
//        Algorthim

          /*
          * define char array of 26
          *
          * iterate each string
          *
          * write logic to match string
          *
          * */

       boolean isMatch =  isStringMatch(str1,str2);
        System.out.println("isMatch====>"+isMatch);
    }

    private static boolean isStringMatch(String str1, String str2) {
// step
        if(str1.length()!=str2.length()){
            return false;
        }

        char[] charArr = new char[26];

        for (int i = 0; i < str1.length(); i++) {
            System.out.println("str1.charAt(i)-'a'====>"+(str1.charAt(i)-'a'));
            System.out.println("str2.charAt(i)-'a'====>"+(str2.charAt(i)-'a'));

            charArr[str1.charAt(i)-'a']++;
            charArr[str2.charAt(i)-'a']--;
        }

/*        for (int i = 0; i < str2.length(); i++) {
            charArr[str2.charAt(i)-'a']--;
        }*/

        for(char c : charArr){
            if(c!=0){
                return false;
            }
        }

        return true;
    }
}
