package com.practice.test.tiaa.coding.challenge;

public class Logic {

  static int count=0;
  static boolean check=true;
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub

    
  int val=  getValue(55,5);
  System.out.println(val);
  }

  private static int getValue(int n, int r) {
     if(n==0 || r==0 || (n<r)) {
       return 0;
     }
     int val=n/r;
//     count+=(!check)?val:(val*r+ val);
     count+=(count!=0)?val:(val*r+ val);
     if(val>=r) {
//       check=false;
       getValue(val,r);
     }
    return count;
  }

}
