package com.practice.test.sort;

import com.practice.test.util.Utility;

public class QuickSort {
    public static void main(String[] args) {
//        int[] arr = {1, 7, 4, 3, 81, 6, 25, 7};
        int[] arr = {6,3,9,5,2,8};
        System.out.print("Original Array ====>");
        Utility.printArr(arr);
        System.out.println();
        int start = 0;
        int end = arr.length - 1;
        quickSort(arr, start, end);
        System.out.print("Sorted Array ===>");
        Utility.printArr(arr);
    }

    private static void quickSort(int[] arr, int start, int end) {
      if(start<end){ // This is base condition for stop recursion
          int partitionIndex = partition(arr,start,end); // calling partition
//          quickSort(arr,start,partitionIndex-1); // sort element as per partition
//          quickSort(arr,partitionIndex+1,end); // sort element as per partition
          quickSort(arr,start,partitionIndex-1); // sort element as per partition
          quickSort(arr,partitionIndex+1,end); // sort element as per partition
      }
    }
    private static int partition(int[] arr, int start, int end) { // here at least confirm, pivot element will get correct position
        int pivot =  arr[end]; // here we have considered pivot as last element but it can be any element of array
        int partitionIndex = start; // set partition index as start initially
        for (int i = start; i<end ; i++) {
            if(arr[i]<pivot) { // this is imp condition for sorting
                swap(arr,i,partitionIndex); // Swap if element is less than pivot
                partitionIndex++; // here need to track partition index for placing correct element
            }
        }
        swap(arr,partitionIndex,end);// Swap pivot with element at partition index, here pivot will sit at correct position index in array
        return partitionIndex;
    }

   private static void swap(int[] arr,int start, int end) {
        int temp = arr[start];
        arr[start] =  arr[end];
        arr[end] =  temp;
    }
}
