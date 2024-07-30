package com.practice.test.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseaIntegerArrayListInList {

  public static void main(String[] args) {

    List<Integer> intList = new ArrayList<>(Arrays.asList(1, 8, 6, 7, 10,6));
    
    System.out.println(intList);

    
    
//    for (int i = 0; i < intList.size(); i++) {
//      for (int j = i+1; j < intList.size(); j++) {
//        
//        if(intList.get(i)>intList.get(j)) {
//          int temp=intList.get(i);
//          intList.set(i, intList.get(j));
//          intList.set(j, temp);
//        }
//      }
//
//    }
    
    for (int i = 0; i < intList.size() / 2; i++) {
      int temp = intList.get(i);
      intList.set(i, intList.get(intList.size() - i - 1));
      intList.set(intList.size() - i - 1, temp);
    }
    System.out.println("List after sorting==>"+intList);
  }

}
