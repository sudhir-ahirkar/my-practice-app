package com.practice.test.array;


//80. Remove Duplicates from Sorted Array II

import java.util.Arrays;

/*
*
* Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.



Example 1:

Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).


Constraints:

1 <= nums.length <= 3 * 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
* */
public class RemoveDuplicate2 {
    public static void main(String[] args) {
//        int[] nums = {1, 1, 1, 2, 2, 3}; // Output: 5, nums = [1,1,2,2,3,_]
//        int[] nums = {0,0,1,1,1,1,2,3,3}; // Output: 7, nums = [0,0,1,1,2,3,3,_,_]
//        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] nums = {0,1,2,2,2,2,3,3}; // Output: 6, nums = [0,1,2,2,3,3,_,_,_]


        removeEle(nums);
//        int result = removeDuplicates(nums);
//        System.out.println("result====>"+result);
        System.out.println(Arrays.toString(nums));

    }


    // correct answers
    public static  int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<=2){
            return n;
        }

        int j = 2;
        for(int i=2; i<n; i++){
//            System.out.println("j-2===>"+(j-2));
            if(nums[i] != nums[j-2]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    private static int removeEle(int[] nums) {
        int count = 1;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[index]) {
                count++;
                if (count <= 2) {
                    index++;
                }
            }else{
                count=1;
                nums[++index]=nums[i];
            }
        }
//        System.out.println("result===>"+(index+1));
        return index+1;
    }
}
