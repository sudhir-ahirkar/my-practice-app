package com.practice.test.java8concept;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8code {
    
    public static void main(String[] args) {
      Calendar cal = Calendar.getInstance();
      Date currentTime = cal.getTime();
     Long l= currentTime.getTime() / 1000L;
     Long l1=l/60;
     
     System.out.println(l);
     System.out.println(l1);
    Integer arrays[] = {1,2,3,4,5,6,7,5,3,8,9,10,2,6,1};
  //1.convertArrayToArrayList
    ArrayList<Integer> arrayToArrayList=new ArrayList<>(Arrays.asList(arrays));
    System.out.println("final arrayList:"+arrayToArrayList);
    System.out.println("Duplicate:=================>");
    //5.duplicateNumber
    arrayToArrayList.stream().filter(i ->Collections.frequency(arrayToArrayList, i)>1).collect(Collectors.toSet()).forEach(System.out::println);
    System.out.println("Only unique elements===============>:");
    //5.unique
   arrayToArrayList.stream().filter(i ->Collections.frequency(arrayToArrayList, i)==1).collect(Collectors.toSet()).forEach(System.out::println);
  
    
    Integer int1=Integer.valueOf(20);
    Integer int2=Integer.valueOf(20);
    System.out.println("check flyweight==>"+int1.equals(int2));
    System.out.println(int1==int2);
    
    
    
    //2.oddNumber
    List<Integer> oddNumber = arrayToArrayList.stream().filter(i->i%2!=0).collect(Collectors.toList());
    System.out.println("oddNumber:"+oddNumber);
    
    //3.evenNumber
    List<Integer> evenNumber = arrayToArrayList.stream().filter(i->i%2 ==0).collect(Collectors.toList());
    System.out.println("evenNumber:"+evenNumber);
    
    //4.removeDuplicateNumber
    List<Integer> removeDuplicate = arrayToArrayList.stream().distinct().collect(Collectors.toList());
    System.out.println("removeDuplicate:"+removeDuplicate);

    //6.sortingAscendingOrder
    List<Integer> sortingAsscendingOrder=arrayToArrayList.stream().sorted().collect(Collectors.toList());
    System.out.println("sortingAsscendingOrder:"+sortingAsscendingOrder);
    
    //7.sortingReverseOrder
    List<Integer>sortingReverseOrder=arrayToArrayList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    System.out.println("sortingReverseOrder:"+sortingReverseOrder);
    
    //8.sumOfallNumber
    Integer sumOfallNumber=arrayToArrayList.stream().mapToInt(i->i.intValue()).sum();
    System.out.println("sumOfallNumber:"+sumOfallNumber);
    
    //9.maxNumber
    Optional<Integer> maxNumber=arrayToArrayList.stream().max(Comparator.naturalOrder());
    System.out.println("maxNumber:"+maxNumber);

    // OR
        int max = arrayToArrayList.stream().mapToInt(e -> e.intValue()).max().getAsInt();
    // OR
        Optional<Integer> maxNumbers=arrayToArrayList.stream().reduce(Integer::max);
    System.out.println("maxNumber:"+maxNumbers.get());


//    10.minNumber
    Optional<Integer>minNumber=arrayToArrayList.stream().min(Comparator.naturalOrder());
    System.out.println("minNumber:"+minNumber);
    // OR
    Optional<Integer> maxNum=arrayToArrayList.stream().max(Comparator.naturalOrder());
    System.out.println("maxNum:===>"+maxNum);
    // OR
    int min = arrayToArrayList.stream().mapToInt(e -> e.intValue()).min().getAsInt();


    //11 Count total Number
    long count=arrayToArrayList.stream().count();
    System.out.println("count:"+count);
    
    //12.removing Number OnGivenLength
    List<Integer>removingNumberOnGivenLength=arrayToArrayList.stream().skip(5).collect(Collectors.toList());
    System.out.println("removingNumberOnGivenLength:"+removingNumberOnGivenLength);
    
    
    //13.lowerCaseToUpperCase
    List<String> stringList=Arrays.asList("manoj");
    List<String>upperCase=stringList.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
    System.out.println("upperCase:"+upperCase);
    
    //14.lowerCaseToUpperCase second Way
    Function<String, String> lowerCase=(String s)->s.toUpperCase();
    System.err.println(lowerCase.apply("manoj"));
    
    //15.upperCaseToLowerCase
    Function<String, String> upperCases= (s)->s.toLowerCase();
    System.out.println(upperCases.apply("MANOJ"));
    
    
    //6.sortingAsscendingOrder
    Set<Integer> sortingAsscendingOrderSet=arrayToArrayList.stream().collect(Collectors.toSet());
    System.out.println("sortingAsscendingOrderSet:"+sortingAsscendingOrderSet);
    
    
  Set<Integer> set =  arrayToArrayList.stream().filter(s->Collections.frequency(arrayToArrayList, s)==1).collect(Collectors.toSet());
  Map<Integer,Integer>  intMap= set.stream().collect(Collectors.toMap(a->a*1,a-> a*2));
  System.out.println("Converted list to Map==>"+intMap);
    
    }
}
