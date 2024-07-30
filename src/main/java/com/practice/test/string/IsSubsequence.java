package com.practice.test.string;

public class IsSubsequence {
        public static void main(String[] args) {
          String s = "abcz", t = "ahbgdc"; // false
//            String s = "abc", t = "ahbgdc"; // true
            boolean isSubsequence = isSubsequence3(s, t);
            System.out.println("isSubsequence  ===>" + isSubsequence);
        }

    private static boolean isSubsequence3(String s, String t) {
             int i=0,j=0;
             while(i<s.length() && j<t.length()){
                 if(s.charAt(i)==t.charAt(j)){
                     i++;
                 }
                 j++;
             }
             return i==s.length();
    }









    private static boolean isSubsequence1(String s, String t) {
            int i=0,j=0;
            while (i<s.length() && j<t.length()) {
                 if(s.charAt(i)==t.charAt(j)) {
                     i++;
                 } else {
                     j++;
                 }
            }
            return s.length()==i;
    }







    private static boolean isSubsequence(String s, String t) {
            int i = 0, j=0;
            while(i<s.length() && j<t.length()){
                if(s.charAt(i)==t.charAt(j)){
                    i++;
                }
                j++;
            }
            return i==s.length();
    }
}
