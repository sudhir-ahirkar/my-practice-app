package com.practice.test.array;

public class SearchInsertPosition {
    public static void main(String[] args) {
//        int[] nums = {1,3,5,6,8};

        int[] nums = {0,0,0,1,1};

//        int target = 2;
        int target = 1;

        int insertIndex = searchInsert2(nums, target);
        System.out.println("Element need to insert at position " + insertIndex);
    }

    private static int searchInsert2(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<end) {
            int mid = start + (end-start)/2;
            if(target>nums[mid]) {
                start = mid+1;
            } else if(target<nums[mid]) {
                end = mid-1;
            } else {
                return mid;
            }
        }
        return start;
    }
    private static int searchInsert(int[] nums, int target) {
        int start = 0; int end = nums.length-1;
        while(start<end) {
            int mid = start + (end-start)/2;
            if(target<nums[mid]) {
                end = mid-1;
            } else if(target>nums[mid]){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return start;
    }
}