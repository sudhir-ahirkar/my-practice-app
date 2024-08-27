package com.practice.test.application;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class FindMissingSmallestPositiveNumber {
    // Find the smallest positive number missing from an unsorted array : Hashing Implementation
    // Given an unsorted array with both positive and negative elements including 0. The task is to
    // find the smallest positive number missing from the array in O(N) time.
    //
    // Examples:
    //
    // Input: arr[] = {-5, 2, 0, -1, -10, 15}
    // Output: 1
    //
    // Input: arr[] = {0, 1, 2, 3, 4, 5}
    // Output: 6
    //
    // Input: arr[] = {1, 1, 1, 0, -1, -2}
    // Output: 2


    // Driver code
    public static void main(String[] args) {
        int a[] = {-5, 2, 0, -1, -10, 15};
        int size = a.length;
//    int missing_num = missingNumberPractice(a,size);
        System.out.println("Smallest positive missing number is : " + missingNumber(a, size));
    }

  /*private static int missingNumberPractice(int[] a, int size) {

    Set<Integer> set = Arrays.stream(a).boxed().collect(Collectors.toSet());

    int count = 1;

    for (int i = 0; i < set.size(); i++) {

    }


  }*/

    private static int missingNumber(int[] a, int size) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                map.put(a[i], map.get(a[i]) == null ? 1 : map.get(a[i]) + 1);
            }
        }
        int index = 1;
        while (true) {
            if (!map.containsKey(index)) {
                return index;
            }
            index++;
        }
    }
}
