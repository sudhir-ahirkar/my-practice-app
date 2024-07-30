package com.practice.test.coding_test.other;

import java.util.Comparator;



/*// employee => name, id, mgrid
// Get the frequency of employee count under Manager
: Answers
Select  emp.mgrid , count (*) as empCount from employee emp
Grouping by emp.mgrid
*/


public class CodingSkillWithCity {

    public static void main(String[] args) {
        String str = "bcdaczd";
         // expecttion : frequency of each char
        char frequencyOfChar = getFrequencyOfChar(str);
        System.out.println("frequencyOfChar===>"+frequencyOfChar);

        ///================================
        B b = new C();
        b.m1();
    }

    private static char getFrequencyOfChar(String str){
/*     return str.chars().mapToObj(ele -> (char) ele)
              .collect(Collectors.groupingBy(Function.identity()
                , LinkedHashMap::new, Collectors.counting()))
              .entrySet().stream()
             .filter(entry->entry.getValue()>1).limit(1)
             .findFirst().get().getKey();*/

        //// OR //////

        Character first = str.chars().mapToObj(ele -> (char) ele)
                .max(Comparator.reverseOrder()).stream().findFirst().get();
        System.out.println(first);
       return first;
    }
}

class A{
   static void m1(){
       System.out.println("Calling m1() A class");
    }
}

class B extends A{
    static void m1(){
        System.out.println("Calling m1() B class");
    }
}

class C extends B{
    static void m1(){
        System.out.println("Calling m1() C class");
    }
}
