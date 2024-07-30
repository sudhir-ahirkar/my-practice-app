package com.practice.test.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LRUCache123 {
    Map<String,String> cache;
    List<String> orderUsed;
    int capacity;

    public LRUCache123(int capacity){
       cache = new HashMap<>();
       orderUsed = new ArrayList<>();
       this.capacity = capacity;
    }

    private String get(String key){
        if(!cache.containsKey(key)){
            return null;
        }
        orderUsed.remove(orderUsed.size()-1);
        orderUsed.add(0,key);
        return cache.get(key);
    }

    private void put(String key, String value){
        if(cache.containsKey(key)){
            cache.put(key,value);
            orderUsed.remove(value);
            orderUsed.add(0,value);
        }else{
            if(cache.size()>=capacity){
                String remValue = orderUsed.remove(orderUsed.size()-1);
                cache.remove(remValue);
                capacity--;
            }
            cache.put(key,value);
            orderUsed.add(0,value);
        }
    }
 }
