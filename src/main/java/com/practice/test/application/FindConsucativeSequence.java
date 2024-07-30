package com.practice.test.application;

public class FindConsucativeSequence {

 
 
    
    
    public static void main(String args[]) 
    { 
         int arr[] = { 1, 2, -3, 2, 3, 4, 7,1, 2, 3, 4, 9, 11, 5, 6 };
         int n = arr.length;
         getLongestSeq(arr, n);
    }

    private static void getLongestSeq(int[] arr, int n) {
     int maxIn=0,maxNum=0,curIn=0,curMax=0;
     
     for (int i = 0; i < arr.length; i++) {
      
       if(arr[i]>0) {
         curMax++;
         
         if(curMax==1) {
           curIn=i;
         }
       }else {
         
         if(curMax>maxNum) {
           maxNum=curMax;
           maxIn=curIn;
           curMax=0;
         }
       }
    }
      
     
     System.out.println("Current Max number==>"+maxNum+" Current Max Index is==>"+maxIn);
    }

  

  
}
