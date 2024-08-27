package com.practice.test.hashmap;

import java.util.*;

// 128. Longest Consecutive Sequence
/*
*
* Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.



Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9


Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
* */
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
       int[] nums = {100,4,200,1,3,2}; // 4
//       int[] nums = {0,3,7,2,5,8,4,6,0,1}; // 9
        int longestConsecutiveSeq = longestConsecutive2(nums);
        System.out.println("longestConsecutiveSeq===>"+longestConsecutiveSeq);
    }

    /*
    * The "Longest Consecutive Sequence" problem on LeetCode asks to find the length of the longest consecutive sequence of numbers in an unsorted array of integers.

Here's a step-by-step explanation of a common Java solution:

HashSet for Efficient Lookup: Start by creating a HashSet to store all elements of the input array. A HashSet provides constant time (O(1)) average-case complexity for insertion, deletion, and lookup operations.
Iterating Through the Array: Iterate through the array and add all elements to the HashSet.
Finding Consecutive Sequences: Once all elements are added to the HashSet, iterate through the array again. For each element num, check if num - 1 exists in the HashSet. If it does not exist, it means num is the start of a new consecutive sequence.
Counting Consecutive Elements: While counting consecutive elements starting from num, increment a counter variable. Continue until an element is not found in the HashSet (i.e., the end of the consecutive sequence).
Updating Maximum Length: Keep track of the maximum length of consecutive sequences encountered during iteration.
Returning the Result: After iterating through the array, return the maximum length of consecutive sequences found.
Here's a sample Java implementation of the approach:


    * */
    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxSequenceLength = 0;

        for (int num : nums) {
            if (!numSet.contains(num - 1)) { // Start of a new sequence
                int currentNum = num;
                int currentSequenceLength = 1;

                // Count consecutive elements
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequenceLength++;
                }

                maxSequenceLength = Math.max(maxSequenceLength, currentSequenceLength);
            }
        }

        return maxSequenceLength;
    }

    // Second approach

    /*
    *
    * Let's analyze the time complexity of the provided code:

Code Walkthrough:
Check for Empty Array:

java
Copy code
if(nums.length==0){
    return 0;
}
This step is O(1), as it's just checking if the array is empty.
Adding Elements to TreeSet:

java
Copy code
Set<Integer> numSet = new TreeSet<>();
for (int num : nums) {
    numSet.add(num);
}
TreeSet is a balanced binary search tree (typically a Red-Black Tree), where each insertion takes O(log n) time.
In the worst case, inserting all elements from nums into TreeSet would take O(n log n) time, where n is the number of elements in nums.
Iterating Over the Set:

java
Copy code
int maxSequenceLength = 1;
int currentMax = 1;
for (int num : numSet) {
    if(numSet.contains(num+1)) {
        currentMax++;
    } else {
        maxSequenceLength = Math.max(maxSequenceLength,currentMax);
        currentMax=1;
    }
}
This loop iterates over each element in the TreeSet, so it runs O(n) times.

The numSet.contains(num+1) check is an O(log n) operation for each element since it's a lookup in a TreeSet.

The overall time complexity of this loop is O(n log n) due to the contains operation inside the loop.

Overall Time Complexity:
The most time-consuming parts of the code are the insertion of elements into the TreeSet and the iteration with the contains operation.

The total time complexity of the code is:

O(n log n) for inserting all elements into the TreeSet.
O(n log n) for iterating over the TreeSet and performing the contains check.
Thus, the overall time complexity of the code is O(n log n).
    * */

    // lets try to solve below problem with O(n)
    public static int longestConsecutive1(int[] nums) {
        Set<Integer> numSet = new TreeSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int maxSequenceLength = 1;
        int currentMax = 1;
        for (int num : numSet) {
            if(numSet.contains(num+1)) { // important
                currentMax++;
            } else {
                maxSequenceLength = Math.max(maxSequenceLength,currentMax);
                currentMax=1;
            }
        }
        return maxSequenceLength;
    }


    public static int longestConsecutive2(int[] nums) {
        HashSet<Integer> numSet = new LinkedHashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int maxSequenceLength = 1;
        int currentMax = 1;
        for (int num : numSet) {
            if(numSet.contains(num+1)) { // important
                currentMax++;
            } else {
                maxSequenceLength = Math.max(maxSequenceLength,currentMax);
                currentMax=1;
            }
        }
        return maxSequenceLength;
    }
}
