package com.practice.test.java8concept;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class FindOutRankedLargestNumber {
    public static void main(String[] args) {
        int arr[]={1,3,6,8,19,56,89,34};

        // Largest ================
        int secLar = secondLargestNum(arr);
        System.out.println("secLar====>"+secLar);
        int thirdLar = thirdLargestNum(arr);
        System.out.println("thirdLar====>"+thirdLar);

        /// Minimum ==============

        int secMin = secondMinimumNum(arr);
        System.out.println("secMin====>"+secMin);
    }

    private static int secondMinimumNum(int[] arr) {
        return Arrays.stream(arr).boxed().sorted().skip(1).findFirst().get();
    }

    private static int secondLargestNum(int[] arr) {
        return Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
    }

    private static int thirdLargestNum(int[] arr) {
        return Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(3).skip(2).findFirst().get();
    }
}
