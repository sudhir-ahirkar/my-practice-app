package com.practice.test.string;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "aba";
        System.out.println("is String palindrom : " + isPalindrome(s1));
    }

    private static boolean isPalindrome(String s) {
         String pattern = "[^A-Za-z0-9]";
         s = s.replaceAll(pattern,"");
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
