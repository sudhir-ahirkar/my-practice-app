package com.practice.test.sort;

import com.practice.test.util.Utility;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {3,4,7,9,2,7};
        mergeSort(arr);
    }

    private static void mergeSort(int[] arr) {
        int si = 0;
        int ei = arr.length-1;
        divideAndConcur(arr,si,ei);
        Utility.printArr(arr);
    }

    private static void concur(int[] arr, int si, int mi, int ei) {
        System.out.println("mi===>"+mi);
        int[] mergedArr = new int[ei-si+1]; // if array length is 6 then 5-0+1
        int firstArrIndex = si; // it's for first left side array reference
        int secArrIndex = mi+1; // it's for 2nd right side array reference
        int mergedArrIndex = 0; // it's for mergedArray track reference

        // find out the element from 1st left and 2nd right side array and copied into mergedArray
        while(firstArrIndex<=mi && secArrIndex<=ei){
            if(arr[firstArrIndex]<=arr[secArrIndex]){
                mergedArr[mergedArrIndex++]=arr[firstArrIndex++];
            }else{
                mergedArr[mergedArrIndex++]=arr[secArrIndex++];
            }
        }
       // copy remaining element from 1st left side array
        while(firstArrIndex<=mi ){
            mergedArr[mergedArrIndex++]=arr[firstArrIndex++];
        }
        // copy remaining element from 2nd right side array
        while(secArrIndex<=ei){
            mergedArr[mergedArrIndex++]=arr[secArrIndex++];
        }
        // copied
        System.out.println("si===>"+si);
        for (int i = 0,j=si; i < mergedArr.length; i++,j++) {
            arr[j]=mergedArr[i];
        }
    }

    private static void divideAndConcur(int[] arr, int si, int ei) {
        if(si>=ei) { // this is base condition to stop recursion
            return;
        }
        int mi = si+(ei-si)/2; // This is very important condition
        divideAndConcur(arr,si,mi); // This is to divide from stat to mid
        divideAndConcur(arr,mi+1,ei); // This is to divide from mid+1 to end
        concur(arr,si,mi,ei); // merge the left side and right side sub array
    }

}
