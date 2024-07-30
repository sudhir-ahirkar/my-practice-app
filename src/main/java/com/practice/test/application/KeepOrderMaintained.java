package com.practice.test.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Java program to move all
// negative numbers to beginning
// and positive numbers to end
// keeping order.
class KeepOrderMaintained {
  static void segregate(int arr[], int n) {

    // Count negative numbers
    int count_negative = 0;
    for (int i = 0; i < n; i++)
      if (arr[i] < 0)
        count_negative++;

    // Run a loop until all
    // negative numbers are
    // moved to the beginning
    
//  -12, 11, -13, -5, 6, -7, 5, -3, -6, -1  ==>0
//  -12, -13, 11 , -5, 6, -7, 5, -3, -6, -1 ==>1
//  -12, -13, -5, 11 , 6, -7, 5, -3, -6, -1 ==>2
//  -12, -13, -5, 11, 6, -7, 5, -3, -6, -1  ==>3
//  -12, -13, -5, 11, -7, 6, 5, -3, -6, -1  ==>4
//  -12, 11, -13, -5, 6, -7, 5, -3, -6, -1  ==>5
//    int i = 0, j = i + 1;
//    while (i != count_negative) {

      // If number is negative,
      // update position of next
      // positive number.
//      if (arr[i] < 0) {
//        i++;
//        j = i + 1;
//      }

      // If number is positive, move
      // it to index j and increment j.
//      else if (arr[i] > 0 && j < n) {
//        int t = arr[i];
//        arr[i] = arr[j];
//        arr[j] = t;
//        j++;
//      }
//    }
    // int z=1;
    // for(int l=0;l<=count_negative;l++) {
    //
    // if(arr[l]<0) {
    // z++;
    // }else if(arr[l]>0 && z<n) {
    // int t = arr[l];
    // arr[l] = arr[z];
    // arr[z] = t;
    // z++;
    // }
    // }
    
    
    
  }
  
 public static void keepMaintainOrder(int arr[], int n) {
   
   int i=0,j=i+1;
   
   Long negativeLenght = Arrays.stream(arr).filter(a->a < 0).count();
   
   while(i!=negativeLenght) {
     
     if(arr[i]<0) {
       i++;
       j+=i;
     }else if(arr[i]>0 && j< n) {
       
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
       j++;
     }
   }
 }

  // Driver code
  public static void main(String[] args) {
    int count_negative = 0;
    int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6, -1};
    int n = arr.length;
//    segregate(arr, n);
    keepMaintainOrder(arr,n);
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
  }
}

// This code is contributed
// by ChitraNayal
