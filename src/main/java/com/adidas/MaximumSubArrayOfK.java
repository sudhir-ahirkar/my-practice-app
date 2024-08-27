package com.adidas;

public class MaximumSubArrayOfK {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 5, 3, 2, 7};
        int start = 0, end = arr.length - 1;
        int maximumSum = 0;
        int currentSum = 0;
        int k = 3;
        while (start <= end) {
            currentSum += arr[start++];
            if (start >= k) {
                maximumSum = Math.max(maximumSum, currentSum);
                currentSum-=arr[start-k];
            }
        }
        System.out.println(maximumSum);
    }
}
