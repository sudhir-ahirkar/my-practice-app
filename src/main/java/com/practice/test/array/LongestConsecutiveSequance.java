package com.practice.test.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;

public class LongestConsecutiveSequance {
    public static void main(String[] args) {
        int nums[] = {3, 77, 73, 78, 70, 74, 60, 71, 49, 56, 1, 72, 4, 62, 75, 61, 76, 59, 67,5};
//        System.out.println("Original array length: " + nums.length);
//        System.out.print("Array elements are: ");
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
        System.out.println("\nThe new length of the array is: " + longest_sequence1(nums));
    }

    /*
    1 =>
2 =>
3 =>
4 =>
6 =>
49 =>
56 =>
57 =>
59 =>
60 =>
61 =>
62 =>
70 =>
100 =>
105 =>
111 =>
124 =>
200 =>
784 =>
    * */
    private static int longest_sequence1(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(TreeSet::new));
        int maxLenght = 1;
        int currentLenght = 1;
        for (int num : set){
            if(set.contains(num+1)){
                currentLenght++;
            }else{
                maxLenght = Math.max(maxLenght,currentLenght);
                currentLenght=1;
            }
        }
    return maxLenght;
    }

    // Another approach
    public static int longest_sequence(int[] nums) {
        final HashSet<Integer> h_set = new HashSet<Integer>();
        for (int i : nums)
            h_set.add(i);
        int longest_sequence_len = 0;
        for (int i : nums) {
            int length = 1;
            for (int j = i - 1; h_set.contains(j); --j) {
                h_set.remove(j);
                ++length;
            }
            for (int j = i + 1; h_set.contains(j); ++j) {
                h_set.remove(j);
                ++length;
            }
            longest_sequence_len = Math.max(longest_sequence_len, length);
        }
        return longest_sequence_len;
    }
/*    private static int  longest_sequence(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(CopyOnWriteArraySet::new,CopyOnWriteArraySet::add,CopyOnWriteArraySet::addAll);
        Integer max_length = 0;
        for (int num : set) {
            int length = 0;
            for (int j = num + 1; j < nums.length; j++) {
                if (set.contains(j)) {
                    length++;
                    set.remove(j);
                }
            }
            for (int j = num - 1; j < nums.length; j--) {
                if (set.contains(j)) {
                    length++;
                    set.remove(j);
                }
            }
            max_length = Math.max(length,max_length);
        }
        return max_length;
    }*/
}
