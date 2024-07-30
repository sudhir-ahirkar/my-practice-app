package com.practice.test.concept;

import java.util.HashMap;
import java.util.Map;

public class ConcurrentHashMapAndHashMap {

    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("A",23);
        hashMap.put("B",23);
        hashMap.put("C",23);
        hashMap.put("D",23);
        System.out.println("hashMap===>"+hashMap);
        for (Map.Entry<String,Integer> entry  :hashMap.entrySet()){
            // Exception in thread "main" java.util.ConcurrentModificationException
//            hashMap.remove(entry.getKey());

            // Exception in thread "main" java.util.ConcurrentModificationException
//            hashMap.put("T",98);


            // No issue , we can modify but if structure changed then concurrent modificaion come into picture
            hashMap.put(entry.getKey(),1039);

        }
        System.out.println("hashMap1===>"+hashMap);

    }
}
