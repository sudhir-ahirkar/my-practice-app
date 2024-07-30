package com.practice.test.array;

import java.util.Arrays;

public class PermutationOfArrayElement {

  public static void main(String[] args) {

    int[] arr = {1, 8, 9};

//    permuteArrayElements(arr, 0, arr.length - 1);
    permuteArrayElements(arr, 0);


  }

  private static void permuteArrayElements(int[] arr, int left, int right) {
    if (left == right) {
      Arrays.stream(arr).forEach(System.out::print);
      System.out.println();
    } else {
      for (int i = left; i <= right; i++) {
        swap(arr, left, i);
        permuteArrayElements(arr, left + 1, right);
        swap(arr, left, i);
      }
    }
  }

  private static void permuteArrayElements(int[] arr, int left) {
    if (left == arr.length-1) {
      Arrays.stream(arr).forEach(System.out::print);
      System.out.println();
    } else {
      for (int i = left; i <= arr.length-1; i++) {
        swap(arr, left, i);
        permuteArrayElements(arr, left + 1);
        swap(arr, left, i);
      }
    }
  }

  private static void swap(int[] arr, int left, int i) {
    int temp = arr[i];
    arr[i] = arr[left];
    arr[left] = temp;
  }

}
