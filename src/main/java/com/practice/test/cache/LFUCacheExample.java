package com.practice.test.cache;

import java.util.*;

public class LFUCacheExample {
    private final int capacity;
    private int minFrequency;
    private final Map<Integer, Entry> cache;
    private final Map<Integer, List<Entry>> frequencyMap;

    public LFUCacheExample(int capacity) {
        this.capacity = capacity;
        this.minFrequency = 0;
        this.cache = new HashMap<>();
        this.frequencyMap = new HashMap<>();
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        Entry entry = cache.get(key);
        updateFrequency(entry);
        return entry.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (cache.containsKey(key)) {
            Entry entry = cache.get(key);
            entry.value = value;
            updateFrequency(entry);
        } else {
            if (cache.size() >= capacity) {
                List<Entry> minFreqList = frequencyMap.get(minFrequency);
                Entry toRemove = minFreqList.remove(minFreqList.size() - 1);
                if (toRemove != null) {
                    cache.remove(toRemove.key);
                }
            }
            Entry newEntry = new Entry(key, value);
            cache.put(key, newEntry);
            minFrequency = 1;
            frequencyMap.computeIfAbsent(1, k -> new ArrayList<>()).add(newEntry);
        }
    }

    private void updateFrequency(Entry entry) {
        int oldFreq = entry.frequency;
        List<Entry> oldFreqList = frequencyMap.get(oldFreq);
        oldFreqList.remove(entry);
        if (oldFreq == minFrequency && oldFreqList.isEmpty()) {
            minFrequency++;
        }
        entry.frequency++;
        frequencyMap.computeIfAbsent(entry.frequency, k -> new ArrayList<>()).add(entry);
    }

    class Entry {
        int key, value, frequency;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
            this.frequency = 1;
        }
    }

    public static void main(String[] args) {
        LFUCache cache = new LFUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // returns 1
        cache.put(3, 3); // evicts key 2
        System.out.println(cache.get(2)); // returns -1 (not found)
        System.out.println(cache.get(3)); // returns 3
        cache.put(4, 4); // evicts key 1
        System.out.println(cache.get(1)); // returns -1 (not found)
        System.out.println(cache.get(3)); // returns 3
        System.out.println(cache.get(4)); // returns 4
    }
}
