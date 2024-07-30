package com.practice.test.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeArray {

  public static void main(String[] args) {

    Integer[] arr1= {1,-1,3,5,7,9};
    Integer[] arr2= {-2,2,3,4,5,6};
    
    int [] arr3=mergerArray(arr1,arr2);
    
    Arrays.stream(arr3).forEach(System.out::print);
  }

  private static int [] mergerArray(Integer[] arr1, Integer[] arr2) {

    
//    Object[] objarry=Stream.of(arr1, arr2).flatMap(Stream::of).toArray(); 
//    return  Arrays.stream(objarry).map(Object::toString).map(Integer::valueOf).sorted().mapToInt(Integer::intValue).toArray();
   
  
//   System.out.println("asdfsadf==>"+);// @formatter:off
   
  // @formatter:on
// @formatter:off
   
  // @formatter:on
;
//   lst1.stream().sorted().toArray();
    
  List<Integer> lst=new ArrayList(Arrays.asList(arr1));
   lst.addAll(Arrays.asList(arr2));
//   Object[] objarry=lst.toArray();
//   Arrays.sort(arr3);
 return  Arrays.stream(lst.toArray()).map(Object::toString).map(Integer::valueOf).mapToInt(Integer::intValue).sorted().toArray();

   
//  Integer[] intarray= Arrays.stream(arr3).map(Object::toString).map(Integer::valueOf).toArray(Integer[]::new);
//  return arr4;
   
 
  
// return null;
  }
  
  
//  public class Solution {
//    public ListNode rotateRight(ListNode head, int n) {
//        // Start typing your Java solution below
//        // DO NOT write main() function
//        if(head==null) return null;
//        ListNode cur=head;
//        int len=1;
//        while(cur.next!=null){
//            cur=cur.next;
//            len++;
//        }
//        cur.next=head;
//        int preLen=len-n%len-1;
//        ListNode pre=head;
//        while(preLen>0){
//            pre=pre.next;
//            preLen--;
//        }
//        head=pre.next;
//        pre.next=null;
//        return head;
//    }
//}

}
