package com.practice.test.sliding_window;


//209. Minimum Size Subarray Sum

/*
*
* Given an array of positive integers nums and a positive integer target, return the minimal length of a
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.



Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0


Constraints:

1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104
* */
public class MinimumSubArray {
    public static void main(String[] args) {
      int target = 7; int[] nums = {2,3,1,2,4,3};
      int result = minSubArrayLen3(target,nums);
        System.out.println("result==>"+result);
    }

    // two pointer with sliding window
    private static int minSubArrayLen1(int target, int[] nums) {
        int left=0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum+=nums[right];
            while(sum>=target){
                minLength=Math.min(minLength,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }

    // Approach 1: Brute Force (O(n^2))
    private static int minSubArrayLen3(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        for (int left = 0; left < nums.length; left++) {
            int sum = 0;
            for (int right = left; right < nums.length; right++) {
                sum+=nums[right];
                if(sum>=target) {
                    minLength=Math.min(minLength,right-left+1);
                    break;
                }
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }


















    //
    public static int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            // Shrink the window from the left as much as possible while the sum is >= s
            while (sum >= s) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
