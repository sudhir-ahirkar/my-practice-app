package com.practice.test.java8concept;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FindOddNumBetweenNumAndReturnArrayExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i=s.nextInt();
        int j=s.nextInt();
        int[] arr = getOddBetweenRange(i,j);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] getOddBetweenRange(int i, int j) {
        int[] array = IntStream.range(i, j).filter(ele -> ele % 2 != 0).toArray();
        return array;
    }
}
