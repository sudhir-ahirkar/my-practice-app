package com.practice.test.sliding_window;

public class MaximumSubArrayOfSize_K {

    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2}; int k = 3;
        int resultArr = maximumSubArray(arr,k);
        System.out.println(resultArr);
    }

    private static int maximumSubArray(int[] arr, int k) {
        int start = 0;
        int end = 0;
        int currentSum = 0;
        int maximumSum = 0;
        while(end < arr.length){
            currentSum +=arr[end];
            if(end >= k-1){
                maximumSum = Math.max(currentSum,maximumSum); //
                currentSum -=arr[start]; // remove first element from window, here from current sum
                start++;
            }
           end++;
        }
        return maximumSum;
    }
}
