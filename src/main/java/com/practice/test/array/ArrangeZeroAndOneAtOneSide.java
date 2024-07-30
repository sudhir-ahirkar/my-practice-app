package com.practice.test.array;

import com.practice.test.util.Utility;

public class ArrangeZeroAndOneAtOneSide {
    public static void main(String[] args) {
       // int[] arr = {0, 1, 0, 1, 0, 01, 0, 1, 0, 1, 0};
        int[] arr = {0, 12, 0, 17, 0, 18, 0, 14, 0, 19, 0};
//        int[] arr = {-5, 12, -1, 17, -7, 18, -7, 14, 8, 19, -3}; // 12 17 18 14 8 19 -7 -5 -7 -1 -3   order not maintained
        rearrangeGreaterThanZeroAtLeftSide6(arr);
        Utility.printArr(arr);
    }

    private static void rearrangeGreaterThanZeroAtRightSide5(int[] arr) {
        int index=0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
    }

    private static void rearrangeGreaterThanZeroAtLeftSide6(int[] arr) {
        int index=0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
    }


    private static void rearrangeGreaterThanZeroAtLeftSide(int[] arr2) {
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]>0){ // imp condition
               int temp = arr2[i];
               arr2[i]=arr2[index];
               arr2[index]=temp;
               index++;
            }
        }
    }

    private static void rearrangeZeroAtLeftSide(int[] arr) {
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]==0) { // important condition
              int temp = arr[i];
              arr[i]= arr[index];
              arr[index]=temp;
              index++;
            }
        }
    }
    private static void rearrangeAllNegativeAtLeftSide(int[] arr) {
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]<0){ // just simple change the logic here to change the logic for left to right
                int temp = arr[i];
                arr[i]= arr[index];
                arr[index]=temp;
                index++;
            }
        }
    }

   private static void rearrangeZeroAtRightSide(int[] arr) {
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]= arr[index];
                arr[index]=temp;
                index++;
            }
        }
    }
}
