package com.practice.test.array;

//167. Two Sum II - Input Array Is Sorted

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.



Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].


Constraints:

2 <= numbers.length <= 3 * 104
-1000 <= numbers[i] <= 1000
numbers is sorted in non-decreasing order.
-1000 <= target <= 1000
The tests are generated such that there is exactly one solution.
* */
public class TwoSumArray {

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15}; int target = 9; // [1,2]
//        int[] numbers = {2,3,4}; int target = 6; //[1,3]
//        int[] numbers = {-1,0}; int target = -1; // [1,2]
        int[] resArr = twoSum2(numbers,target);
        System.out.println(Arrays.toString(resArr));
    }


    // Using HashMap
    public static int[] twoSum1(int[] numbers, int target) {
        int[] resultArr = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[i]-target===>"+Math.abs(numbers[i]-target));
            System.out.println("numbers[i]-target===>"+(numbers[i]-target));
            if(!map.containsKey(target-numbers[i])) {
                map.put(numbers[i],i);
            } else {
                resultArr[1]=i+1;
                resultArr[0]=map.get(target-numbers[i])+1;
                return resultArr;
            }
        }
        return resultArr;
    }

    // Using 2 Pointer approach
    public static int[] twoSum2(int[] numbers, int target) {
        int[] resultArr = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int total = (numbers[start] + numbers[end]);
            if (target == total) {
                resultArr[0] = start + 1;
                resultArr[1] = end + 1;
            }
            if (total > target) {
                end--;
            } else {
                start++;
            }
        }
        return resultArr;
    }

/*    public static int[] twoSum(int[] numbers, int target) {
        int[] resultArr = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[i]-target===>"+Math.abs(numbers[i]-target));
            System.out.println("numbers[i]-target===>"+(numbers[i]-target));
            if(!map.containsKey(Math.abs(numbers[i]-target))) {
                map.put(numbers[i],i);
            } else {
                resultArr[1]=i+1;
                resultArr[0]=map.get(Math.abs(numbers[i]-target))+1;
                return resultArr;
            }
        }
        return resultArr;
    }*/
}
