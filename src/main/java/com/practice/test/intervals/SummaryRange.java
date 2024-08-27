package com.practice.test.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 228. Summary Ranges
/*
* You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b


Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"


Constraints:

0 <= nums.length <= 20
-231 <= nums[i] <= 231 - 1
All the values of nums are unique.
nums is sorted in ascending order.
* */
public class SummaryRange {

    public static void main(String[] args) {
//        int[] nums = {0,1,2,4,5,7}; //[0->2, 4->5, 7]
        int[] nums = {0, 2, 3, 4, 6, 8, 9}; //[0, 2->4, 6, 8->9]
        List<String> rangesLst = summaryRangesTest(nums);
        System.out.println("rangesLst=====>" + rangesLst);
    }

    public static List<String> summaryRangesTest(int[] nums) {
        List<String> resLst = new ArrayList<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            int start = nums[i];
            int end = nums[i];
            while (i<nums.length-1 && (nums[i] + 1 == nums[i + 1])) {
                end = nums[++i];
            }
            if (start == end) {
                resLst.add(String.valueOf(start));
            } else {
                resLst.add(start + "->" + end);
            }
        }
        return resLst;
    }

/*    private static List<String> summaryRanges4(int[] nums) {

    }*/

    private static List<String> summaryRanges2(int[] nums) {
        List<String> summaryRangeList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = i, end = i;
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
                end = i;
            }
            if (start == end) {
                summaryRangeList.add(String.valueOf(nums[start]));
            } else {
                summaryRangeList.add(nums[start] + "->" + nums[end]);
            }
        }
        return summaryRangeList;
    }

    private static List<String> summaryRanges1(int[] nums) {
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            int end = i;
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
                end = i;
            }
            if (start == end) {
                lst.add(String.valueOf(nums[start]));
            } else {
                lst.add(nums[start] + "->" + nums[end]);
            }
        }
        return lst;
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            int end = nums[i];
            if (start == end) {
                result.add(Integer.toString(start));
            } else {
                result.add(start + "->" + end);
            }
        }
        return result;
    }
}
