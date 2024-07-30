package com.practice.test.application;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorConceptExample {
  public static void main(String ars[]) {
    ArrayList<String> list = new ArrayList<String>(); 
    
    list.add("A");
    list.add("B"); 
    list.add("C"); 
    list.add("D"); 
    list.add("E"); 

    // Iterator to traverse the list 
    ListIterator iterator = list.listIterator(); 

    System.out.println("List elements : "); 
    iterator.add("U");
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    
     
    }
       
  
    System.out.println(); 
  }
 
}
