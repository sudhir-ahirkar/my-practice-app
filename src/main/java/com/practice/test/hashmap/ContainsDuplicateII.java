package com.practice.test.hashmap;

import java.util.HashMap;
import java.util.Map;// 219. Contains Duplicate II
/*
* Given an integer array nums and an integer k,
* return true if there are two distinct indices i and j in the array such that nums[i] == nums[j]
* and abs(i - j) <= k.

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true
*
Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true
*
*
Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false


Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
* */
public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
//        int[] nums = {1, 2, 3, 9,1};

        int k = 3;
        boolean isDuplicateAvailable = containsNearbyDuplicate(nums, k);
        System.out.println("isDuplicateAvailable=====>" + isDuplicateAvailable);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            System.out.println("map.get(nums[i])===>"+map.get(nums[i]));
            if (map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i])) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}