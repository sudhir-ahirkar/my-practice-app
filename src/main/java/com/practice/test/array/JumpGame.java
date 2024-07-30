package com.practice.test.array;

// 55. Jump Game
/*
* You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.


Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 105
* */
public class JumpGame {
    public static void main(String[] args) {
//        int[] nums = {2,3,1,1,4};
        int[] nums = {3,2,1,0,4};
        boolean isCanJump = canJump(nums);
       System.out.println("isCanJump====>"+isCanJump);
    }


    /*
    * The "Jump Game" problem on LeetCode asks to determine if you are able to reach the last index of an array by jumping from index to index based on the values at each index, where each value represents the maximum jump length from that position.

Here's an explanation of a common approach to solve this problem:

Greedy Approach: We can solve this problem efficiently using a greedy approach. Instead of trying every possible jump from each position, we make the optimal choice at each step.
Iterating Through the Array: We start from the beginning of the array and maintain a variable maxReach to track the furthest index we can reach from the current position.
Updating maxReach: For each position i, we update maxReach as max(maxReach, i + nums[i]). This means that at each position, we determine the furthest index we can reach by taking the maximum between the current maxReach and the index i plus the jump length at index i.
Checking Reachability: If at any point maxReach becomes greater than or equal to the last index of the array (nums.length - 1), it means we can reach the last index, and we return true.
Returning the Result: If we successfully iterate through the array without reaching the last index, it means we cannot reach the last index, and we return false.
    *
    * */
    public static boolean canJump(int[] nums) {
        int maxReach = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxReach = Math.max(maxReach,i+nums[i]);
            if(maxReach>=nums[nums.length-1]){
                return true;
            }
        }
        return false;
    }
}
