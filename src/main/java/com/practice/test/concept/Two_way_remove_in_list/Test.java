package com.practice.test.concept.Two_way_remove_in_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by sudhir.ahirkar on 12/2/2017.
 */
public class Test {

    public static void main(String args[]){
//      final List<Integer> list = new ArrayList<Integer>();
        
        final List<Integer> list = new CopyOnWriteArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
//        Arrays.sort(list);
//        The reason is that there are two removal operations on a List:
//
//        remove(int index)
//        remove(Object obj)
//        The JVM will always select the most specific overload of a method; and here we pass an int as an argument, the code therefore removes the element at index 2.
//
//        To remove the _element_ 2 from the list, the following needs to be written:*/

//        list.remove(2);
//        list.remove(Integer.valueOf(2));

//        list.remove(new Integer(2));


        System.out.println("list====>"+list);
        for (Integer i: list){
            list.remove(i);
            list.add(9);
        }
        
        list.forEach(System.out::println);
        System.out.println("list====>"+list);//list====>[9, 9, 9]
    }
}
