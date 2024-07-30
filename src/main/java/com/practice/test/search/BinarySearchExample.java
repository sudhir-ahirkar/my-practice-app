package com.practice.test.search;


//o(logn)
class BinarySearchExample {
  public static void binarySearch(int arr[], int first, int last, int key){
    while( first <= last ){
        int mid = first + (last-first)/2;
        if ( arr[mid] < key ){
         first = mid + 1;
       }else if ( arr[mid] == key ){
         System.out.println("Element is found at index: " + mid);
         break;
       }else{
          last = mid - 1;
       }
    }
    if ( first > last ){  
       System.out.println("Element is not found!");  
    }  
  }  
  public static void main(String args[]){  
         int arr[] = {10,20,30,40,50,75,79};  
         int key = 50;  
         int last=arr.length-1;  
         binarySearch(arr,0,last,key);     
  }  
 }  