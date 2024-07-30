package com.practice.test.array;

import com.practice.test.util.Utility;

//746. Min Cost Climbing Stairs
/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.

Example 1:

Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.
Example 2:

Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.

Constraints:

2 <= cost.length <= 1000
0 <= cost[i] <= 999
*/
public class MinCostClimbingStairs {
    public static void main(String[] args) {
//        int[] arr = {10,15,20};
        int[] arr = {1,100,1,1,1,100,1,1,100,1};
        int minCost = minCostClimbingStairs(arr);
        System.out.println("minCost=====>"+minCost);
    }

    /*
    * In this implementation:

We define a method minCostClimbingStairs that takes an array cost representing the cost of climbing each stair.
We use dynamic programming to solve the problem. We initialize an array dp of size n + 1 to store the minimum cost to reach each step.
We set the base cases dp[0] = dp[1] = 0 since there is no cost to reach the 0th and 1st steps.
We then iterate through the array and calculate the minimum cost to reach each step by considering the cost of climbing one or two steps at a time.
Finally, we return dp[n], which represents the minimum cost to reach the top of the stairs.
    * */
    private static int minCostClimbingStairs(int[] arr) {
    int[] resultArr = new int[arr.length+1];
    resultArr[0]=0;
    resultArr[1]=0;
    for (int i = 2; i <= arr.length; i++) {
        resultArr[i] = Math.min(resultArr[i-1]+arr[i-1],resultArr[i-2]+arr[i-2]);
    }
//     return Math.min(resultArr[resultArr.length],resultArr[resultArr.length-1]);
//        Utility.printArr(resultArr);
       return resultArr[arr.length];
    }
}
