package com.practice.test.application;

import java.util.Arrays;
import java.util.HashSet;

public class Exercise34 {
  public static void main(String[] args) {
//    int nums[] = { 3, 200, 2, 4, 70, 5, 60, 57, 49, 56, 1, 124, 45, 62, 111, 61, 784, 59, 58};
//    System.out.println("Original array length: " + nums.length);
//    System.out.print("Array elements are: ");
//    for (int i = 0; i < nums.length; i++) {
//      System.out.print(nums[i] + " ");
//    }
//    System.out.println("\nThe new length of the array is: " + longest_sequence(nums));
    
    
    
    int[] arr = {0,4,55,5,6,56,58,1,8,6};
    System.out.println("Original array length : "+arr.length);
    System.out.println("Array element : "+Arrays.toString(arr));
//    Arrays.sort(arr);
//    ArrayList<Integer> NewArrList = new ArrayList<Integer>();
//    for(int i = 0;i < arr.length-1;i++){
//    if(arr[i]+1 == arr[i+1])
//    NewArrList.add(i);
//    }
//    System.out.println(NewArrList);
//    System.out.println("New array's length : "+NewArrList.size());

//    }

   int l= longest_sequence(arr);
    System.out.println("longest sequence===>"+l);

  }
  public static int longest_sequence(int[] nums) {
    final HashSet<Integer> h_set = new HashSet<Integer>();
    for (int i : nums)
      h_set.add(i);
    int longest_sequence_len = 0;
    for (int i : nums) {
      int length = 1;
      for (int j = i - 1; h_set.contains(j); --j) {
        h_set.remove(j);
        ++length;
      }
      for (int j = i + 1; h_set.contains(j); ++j) {
        h_set.remove(j);
        ++length;
      }
      longest_sequence_len = Math.max(longest_sequence_len, length);
    }
    return longest_sequence_len;
  }
}
