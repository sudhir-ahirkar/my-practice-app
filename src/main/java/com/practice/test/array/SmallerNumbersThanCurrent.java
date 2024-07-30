package com.practice.test.array;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*1365. How Many Numbers Are Smaller Than the Current Number
        Easy
        4.1K
        82
        Companies
        Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is,
         for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
        Return the answer in an array.

        Example 1:

        Input: nums = [8,1,2,2,3]
        Output: [4,0,1,1,3]
        Explanation:
        For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
        For nums[1]=1 does not exist any smaller number than it.
        For nums[2]=2 there exist one smaller number than it (1).
        For nums[3]=2 there exist one smaller number than it (1).
        For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
        Example 2:

        Input: nums = [6,5,4,8]
        Output: [2,1,0,3]
        Example 3:

        Input: nums = [7,7,7,7]
        Output: [0,0,0,0]*/
public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = {6, 5, 9, 8};
        int[] resultArr = smallerNumbersThanCurrent1(nums);
        System.out.println(Arrays.toString(resultArr));
    }

    //approach 1
    private static int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> numLst = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];
             nums[i]=(int)numLst.stream().filter(num -> num < ele).count();
        }
        return nums;
    }

    //approach 2 // This is recommended in coding round evaluation
    private static int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]<num) {
                    count++;
                }
            }
            newArr[i]=count;
        }
        return newArr;
    }
}
