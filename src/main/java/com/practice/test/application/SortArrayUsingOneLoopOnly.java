package com.practice.test.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayUsingOneLoopOnly {

  public static void main(String[] args) {

    int[] arr=new int[] {1,8,9,3,7,6};
    
//    for (int i = 0; i < arr.length-1; i++) {
//      
//      if(arr[i+1]<arr[i]) {
//        int temp=arr[i+1];
//        arr[i+1]=arr[i];
//        arr[i]=temp;
//      }
//    }
    
    for(int i = 0, j=i+1; i < arr.length && j<arr.length;)
    {       
        if(arr[i] > arr[j])
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;              
            i=0;
            j=i+1;
        } 
        else
        {
            i++;
            j++;
        }
    }
    
   
    
//    for (int i = 0, j = i + 1; i < arr.length && j < arr.length;) {
//
//            
//      if(arr[i]>arr[j]) {
//        
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//        i=0;
//        j=i+1;
//      }else {
//        i++;
//        j++;
//      }
//      
//    }
    
    
//    for (int i = 0, j = i + 1; i < arr.length && j < arr.length;) {
//
//      
//      if(arr[i]>arr[j]) {
//        
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//        i=0;
//        j=i+1;
//      }else {
//        i++;
//        j++;
//      }
//      
//    }
    
//    List<Integer> intLst=new ArrayList<>(Arrays.asList(arr));
//    Stream.of(arr).forEach(System.out::println);
   
    for (int i = 0; i < arr.length; i++) {
      
      System.out.println(arr[i]);
    }
    
    for(int i=0;true;i++) {
      System.out.println("Inside for loop");
    }
    

  }

}
