package com.practice.test.concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test7 {
    public static void main(String args[]){

        String s="java";

        char c[]=  s.toCharArray();

       /* Map<Character,Integer> characterIntegerMap=new HashMap<>();

        for(char c1: c){

            if (characterIntegerMap.get(c1) == null)
                characterIntegerMap.put(c1, 1);
            else
                characterIntegerMap.put(c1, characterIntegerMap.get(c1) + 1);
        }

        System.out.println("characterIntegerMap==>"+characterIntegerMap);

        Set<Map.Entry<Character, Integer>> entries = characterIntegerMap.entrySet();

        for (Map.Entry<Character, Integer> e:entries )
            System.out.println("characterIntegerMap==>"+e.getKey()+" "+e.getValue());*/

        List<Character> characters=new ArrayList<Character>();

        System.out.println("characters==>"+characters);

        for(char c1: c){
            characters.add(c1) ;
        }

        for(char c1: c){
            System.out.println(c1+"==="+ Collections.frequency(characters,c1));
        }

//        Stream.of(c).map(e->(char)e).filter(e->Collections.frequency(c,e)>1).collect(Collectors.toList());



    }

}
