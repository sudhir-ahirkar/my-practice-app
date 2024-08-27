package com.practice.test.java8concept.tri;


import java.util.Arrays;

/*
*
* Solve the problem without collections:
Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
    Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
    Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
    Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
* */
public class MoveZero {
    public static void main(String[] args) {
//      int arr[] = {1, 2, 0, 4, 3, 0, 5, 0}; // {1, 2, 4, 3, 5, 0, 0, 0};
        int arr[]  = {1, 2, 0, 0, 0, 3, 6}; // {1, 2, 3, 6, 0, 0, 0};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZero(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
    }
}
