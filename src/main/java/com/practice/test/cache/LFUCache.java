package com.practice.test.cache;

import java.util.*;

public class LFUCache   {
    private Map<Integer, Integer> valueMap = new HashMap<>();
    private Map<Integer, Integer> countMap = new HashMap<>();
    private TreeMap<Integer, List<Integer>> frequencyMap = new TreeMap<>();
    private final int size;

    public LFUCache(int capacity)
    {
        size = capacity;
    }

    public int get(int key)
    {
        if(valueMap.containsKey(key) == false || size == 0)
            return -1;
        //remove element from current frquency list and move it to the next containsKey
        // Not O(1)
        int frequency = countMap.get(key);
        frequencyMap.get(frequency).remove(new Integer(key));

        //remove frquency from map if list is empty
        if(frequencyMap.get(frequency).size() == 0)
            frequencyMap.remove(frequency);

        frequencyMap.computeIfAbsent(frequency + 1, k -> new LinkedList<>()).add(key);
        countMap.put(key, frequency + 1);
        return valueMap.get(key);
    }

    public void put(int key, int value)
    {
        if(valueMap.containsKey(key) == false && size > 0)
        {
            if(valueMap.size() == size)
            {
                // remove first element from the list
                //element with minimum frrquency
                int lowestCount = frequencyMap.firstKey();
                int keyToDelete = frequencyMap.get(lowestCount).remove(0);

                //remove frquency from map if list is empty
                if(frequencyMap.get(lowestCount).size() == 0)
                    frequencyMap.remove(lowestCount);

                valueMap.remove(keyToDelete) ;
                countMap.remove(keyToDelete);
            }

            valueMap.put(key, value);
            countMap.put(key, 1);
            frequencyMap.computeIfAbsent(1, v -> new LinkedList<>()).add(key);

        }
        else if(size > 0)
        {
            //update value
            valueMap.put(key, value);
            // update count and frequency map
            int frequency = countMap.get(key);
            frequencyMap.get(frequency).remove(new Integer(key));

            //remove frquency from map if list is empty
            if(frequencyMap.get(frequency).size() == 0)
                frequencyMap.remove(frequency);

            frequencyMap.computeIfAbsent(frequency + 1, k -> new LinkedList<>()).add(key);
            countMap.put(key, frequency + 1);
        }
    }

    public static void main(String[] args) {
        LFUCache lfuCache = new LFUCache(5);
        lfuCache.put(2,6);
        lfuCache.get(2);
        lfuCache.put(9,6);
        lfuCache.put(6,6);
        lfuCache.put(2,6);
        lfuCache.put(3,6);
        lfuCache.put(5,6);
        lfuCache.put(0,6);
        lfuCache.put(1,6);



    }
}
