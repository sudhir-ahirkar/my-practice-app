package com.practice.test;

public class ChubbCodingProblem {

    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,1,1};
        int insertPosition = searchInsert2(arr,1);
        System.out.println("insertPosition=====>"+insertPosition);
    }

    private static int searchInsert2(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<end) {
            int mid = start + (end-start)/2;
            if(target>arr[mid]) {
                start = mid+1;
            } else if(target<arr[mid]) {
                end = mid-1;
            } else {
                return mid;
            }
        }
        return start;
    }
}


