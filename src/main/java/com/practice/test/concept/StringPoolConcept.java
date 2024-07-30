package com.practice.test.concept;

public class StringPoolConcept {
  public static void main(String ar[] ) {
    String s=new String("Sudhir");
    System.out.println("hashcode of String s :"+s.hashCode());  // it creates 2 objects , 1 in heap and other in String Constant Pool
//    System.out.println("intern() method hascode ==>"+s.intern().hashCode());
    String s1 ="Sudhir"; // here no object is created instead first it check SCP , if content
    // is not available then only create
    System.out.println("s1===>"+s1.hashCode());  // it check same object that created at line 5, understand
    if(s1.hashCode()==s.hashCode()){
      System.out.println("Both hashcodes are same===>");
    }
    // No need to do intern here
    if(s1.hashCode()==s.intern().hashCode()){
      System.out.println("Both hashcodes are same===>");
    }
    System.out.println(s1==s.intern());
    String s2=s1.concat(""); // content wise no change in s1 and s2
    System.out.println(s2==s1); // checked object references in String Constant Pool
  }
}
