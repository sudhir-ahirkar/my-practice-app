package com.practice.test.array;

//448. Find All Numbers Disappeared in an Array

import java.util.*;
import java.util.stream.Collectors;

/*
    Given an array nums of n integers where nums[i] is in the range [1, n],
     return an array of all the integers in the range [1, n] that do not appear in nums.

        Example 1:
        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [5,6]

        Example 2:
        Input: nums = [1,1]
        Output: [2]
        Constraints:
        n == nums.length
        1 <= n <= 105
        1 <= nums[i] <= n
        */
public class FindDisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1}; // [5, 6]
//        int[] nums = {1, 1}; // [2]

//        int[] ar1 = myWay1(nums);
//        System.out.println(Arrays.toString(ar1));
        List<Integer> resultLst = findDisappearedNumbers(nums);
        System.out.println("resultLst====>" + resultLst);
    }

    private static int[] myWay(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        List<Integer> lst = new ArrayList<>();
        Optional<Integer> first = set.stream().findFirst();
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(count)) {
                lst.add(count);
            }
            count++;
        }
        return lst.stream().mapToInt(e->e.intValue()).toArray();
    }

    // more improved version
    private static int[] myWay1(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(TreeSet::new));
//        set.
        int num = set.stream().findFirst().get();
        List<Integer> lst = new ArrayList<>();
        int count = num;
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(count)){
                lst.add(count);
            }
            count++;
        }
        return lst.stream().mapToInt(e->e.intValue()).toArray();
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -1 * nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                lst.add(i + 1);
            }
        }
        return lst;
    }
}
