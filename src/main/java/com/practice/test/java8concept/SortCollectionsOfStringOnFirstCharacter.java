package com.practice.test.java8concept;

import com.practice.test.application.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortCollectionsOfStringOnFirstCharacter {

  public static void main(String[] args) {
    
    List<String> myList=Arrays.asList("Sudhib","Ajinkya","Rajesh");
      List<String> sortedLstWithFirstCharOfString =  myList.stream().sorted(Comparator.comparing(e -> e.charAt(0)))
              .collect(Collectors.toList());

      System.out.println(sortedLstWithFirstCharOfString);

  List<String> sortedLstWithLastCharOfString=  myList.stream().sorted(Comparator.comparing(e -> e.charAt(e.length()-1)))
    .collect(Collectors.toList());

    System.out.println(sortedLstWithLastCharOfString);

    List<String> reverseLst=sortedLstWithLastCharOfString.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    System.out.println(reverseLst);
    
   List<Employee> empList= Arrays.asList(new Employee(2,"Sudhir"),new Employee(3,"Ajinkya"),new Employee(7,"Rajesh"));
   List<Employee> sortedEmpListt=  empList.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());
   System.out.println("Sorted using comparable==>"+sortedEmpListt);
   //========================OR========================================
      List<Employee> sortedEmpLst=  empList.stream().sorted((e1,e2)->e1.getId().compareTo(e2.getId())).collect(Collectors.toList());
      System.out.println("Sorted using comparable==>"+sortedEmpListt);
   
   List<Employee> sortedEmpListOnId=empList.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());
   System.out.println("===>"+sortedEmpListOnId);
   
   List<Employee> sortedEmpListOnString = empList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
   System.out.println("===>"+sortedEmpListOnString);
   
   
   List<Employee> sortedEmpListOnStringReversed =  empList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
   System.out.println("===>"+sortedEmpListOnStringReversed); 

   
   List<String> file1 = new ArrayList<>();
   file1.add("W");
   file1.add("M");
   List<String> file2 = new ArrayList<>();
   file2.add("A");
   file2.add("P");   
   
   List<String> lastList = Stream.of(file1, file2).
       flatMap(Collection::stream).
       sorted(String::compareTo).
       sorted(Comparator.reverseOrder()).
       collect(Collectors.toList());
   System.out.println(lastList); 
   
   Employee em=empList.stream().filter(e->e.getName().equals("Sudhirs")).findAny().orElse(null);
   Employee em1=empList.stream().filter(e->e.getName().equals("Sudhirs")).findAny().orElseThrow(()->new RuntimeException());

   System.out.println(em);
   
}
  
}
