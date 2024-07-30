package com.practice.test.array;

import java.util.Arrays;

/*      Method Prototype
        void maxMin(int[] arr)
        Output
        An array in which elements are stored in a max/min form.
        Sample Input
        arr = {1, 2, 3, 4, 5}
        Sample Output
        arr = {5, 1, 4, 2, 3}*/
public class CheckMaxMin {
    public static void main(String[] arr) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] resultArr = maxMin(arr1);
        System.out.println(Arrays.toString(resultArr));  //[5, 1, 4, 2, 3]
    }
    private static int[] maxMin(int[] arr1) {
        int[] resArr = new int[arr1.length]; //imp
        int maxIdx = arr1.length - 1; // imp
        int minIdx = 0; // imp
        boolean checkMaxMin = true; //imp
        for (int i = 0; i < arr1.length; i++) {
            if(checkMaxMin) {
                resArr[i] = arr1[maxIdx--];
                // OR
//                arr1[i] =arr1[maxIdx++];
//                minIdx++;
            } else {
                resArr[i] = arr1[minIdx++];
            }
            checkMaxMin=!checkMaxMin;
        }
        return resArr;
    }
}