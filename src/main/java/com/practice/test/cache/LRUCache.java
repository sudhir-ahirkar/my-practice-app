package com.practice.test.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LRUCache {
//  4->5->8->9-11->78
    private Map<Integer,Entry> cache;
    private List<Integer> orderUsed;
    private int capacity;

    public LRUCache(int capacity){
       cache = new HashMap<>();
       orderUsed = new ArrayList<>();
       this.capacity = capacity;
    }

    private int get(int key) {
        if(!cache.containsKey(key)) {
           return -1;
        }
        orderUsed.remove(Integer.valueOf(key));
        orderUsed.add(0,key);
        return cache.get(key).value;
    }

    private void put(int key, int value){
        if(cache.containsKey(key)){
            cache.get(key).value=value;
            orderUsed.remove(Integer.valueOf(key));
            orderUsed.add(0,key);
        }else{
            if(cache.size()>=capacity) {
               int leaseUsedKey = orderUsed.remove(orderUsed.size()-1);
               cache.remove(leaseUsedKey);
            }
            cache.put(key,new Entry(key,value));
            orderUsed.add(0,key);
        }
    }

    private class Entry{
        private int key;
        private int value;
        public Entry(int key, int value){
            this.key=key;
            this.value=value;
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        System.out.println(lruCache.get(1)); // 1
        lruCache.put(3,3);
        System.out.println(lruCache.get(2)); // -1
        lruCache.put(4,4);
        System.out.println(lruCache.get(1)); // -1
        System.out.println(lruCache.get(3)); // 3
        System.out.println(lruCache.get(4)); // 4
    }
}
