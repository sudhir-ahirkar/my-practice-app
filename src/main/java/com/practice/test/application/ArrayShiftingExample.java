package com.practice.test.application;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayShiftingExample {
  public static void main(String args[]) {
    
    
    LocalDate date = LocalDate.parse("2017-02-05");
    System.out.println("Parsed Date?= " + date);
    int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9, -10};
    int n = arr.length;

    rearrangArr1(arr);
//    rearrangArr(arr);
    printArray(arr, n);
  }


  //Approach 1 : +ve element will loose there position while rearranging elements
  static void rearrangArr(int[] arr) {
    int index = 0;
    for(int i = 0; i < arr.length; i++) {
      if(arr[i]<0){
        int temp = arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
        index++;
      }
    }
  }
// o/p : -1 -3 -7 -10 5 6 2 8 9 4

  //Approach 2  : +ve element will not the loose there position while rearranging elements
  static void rearrangArr1(int[] arr){
    int i=0,j=i+1;
    long l = Arrays.stream(arr).filter(e->e<0).count();
    while(i!=l){
      if(arr[i]<0){
        i++;
        j=i+1;
      }else if(arr[i]>0){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        j++;
      }
    }
//    return arr;
  }
// o/p: -1 -3 -7 -10 2 4 5 6 8 9


  //
  private static void rearrange(int[] arr) {
    int i=0, j = i+1, temp = 0;
   long l= Arrays.stream(arr).filter(e->e<0).count();
    while(i!=l) {
      if (arr[i] < 0) {
        i++;
        j=i+1;
      }else {
        if (arr[i] > 0 ) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          j++;
        }
      }
    }
  }



  // A utility function to print an array
  static void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
  }

}
