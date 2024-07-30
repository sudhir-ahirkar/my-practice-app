package com.practice.test.application;

import java.util.Arrays;

public class ShiftElementByFrequency {

  public static void main(String[] args) {

    int[] intArr = {1, 8, 9, 4, 3};

    int rotateLeftBy = 2;

    Arrays.stream(intArr).forEach(System.out::print);
    rotateArrByFrequency(rotateLeftBy, intArr);
    System.out.println();
    Arrays.stream(intArr).forEach(System.out::print);
  }

  private static void rotateArrByFrequency(int rotateLeftBy, int[] intArr) {
    for (int i = 0; i < rotateLeftBy; i++) {
      int tmep = intArr[0];
      for (int j = 0; j < intArr.length - 1; j++) {
        intArr[j] = intArr[j + 1];
      }
      intArr[intArr.length - 1] = tmep;
    }
  }

}
