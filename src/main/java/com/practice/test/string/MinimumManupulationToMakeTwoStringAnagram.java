package com.practice.test.string;

public class MinimumManupulationToMakeTwoStringAnagram {

  // Counts the no of manipulations required 
  static int countManipulations(String s1, String s2) 
  { 
      int count = 0;

      // store the count of character 
      int char_count[] = new int[26]; 

      // iterate though the first String and update  
      // count 
      for (int i = 0; i < s1.length(); i++)  
          char_count[s1.charAt(i) - 'a']++;         

      // iterate through the second string 
      // update char_count. 
      // if character is not found in char_count 
      // then increase count 
      for (int i = 0; i < s2.length(); i++){
          if (char_count[s2.charAt(i) - 'a']-- <= 0){
              count++;
          }
      }



/*      for (int i = 0; i < s2.length(); i++)
      {
          int num = --char_count[s2.charAt(i) - 'a'];
          if ( num < 0)
              count++;
      }*/
      return count; 
  } 

  // Driver code 
  public static void main(String[] args) 
  { 

//      String s1 = "ddcf";
//      String s2 = "cedk";
      String s1 = "ecga";
      String s2 = "ctyv";

      System.out.println(countManipulations1(s1, s2));
  }

    private static int countManipulations1(String s1, String s2) {
      int[] alphaArr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            alphaArr[s1.charAt(i)-'a']++;
            alphaArr[s2.charAt(i)-'a']--;
        }
        int count = 0;
        for (int num : alphaArr){
            if(num<0){
                count++;
            }
        }
        return count;
    }
}
