package com.practice.test.application;

import java.net.NetworkInterface;
import java.util.Arrays;

public class KeepMaintaindedOr {

  
  public static void main(String[] args) {
    int count_negative = 0;
    int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6, -1};
    int n = arr.length;
    segregate(arr, n);
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
  }

  private static void segregate(int[] arr, int n) {

  Long negativeCount= Arrays.stream(arr).filter(a->a<0).count();
  int i=0,j=i+1;
  while(i!=negativeCount) {
    
    if(arr[i]<0) {
      
      i++;
      j=i+1;
    }else if(arr[i]>0 && j<n) {
       
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      
      j++;
    }
  }
    
  }
}
