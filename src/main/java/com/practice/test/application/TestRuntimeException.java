package com.practice.test.application;

public class TestRuntimeException {

//  public static void main(String[] args) {
//    // TODO Auto-generated method stub
//
//    foo();
//  }
//  
//  
//  public static void foo() {
//    throw new RuntimeException();
//  }
  
  
  public static void main(String[] args) throws Exception {
    // TODO Auto-generated method stub
    foo();
  }
  
  
  // If it's runtime exception then throws not cumpulsory in methods declaration
  public static void foo1(){
    throw new RuntimeException();
  }

  // If it's checked  exception then throws not cumpulsory in methods main method declaration
  public static void foo() throws Exception {
//    throw new RuntimeException();
    throw new Exception();
  }

}
