package com.practice.test.intervals;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merge = merge(intervals);
        printResult(merge);
    }

    private static void printResult(int[][] merge) {
        Arrays.stream(merge).forEach(ele -> {
            System.out.print(Arrays.toString(ele));
        });
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
            return new int[0][0];
        // Sort the intervals by their start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        printResult(intervals);
        LinkedList<int[]> result = new LinkedList<>();
        // Add the first interval to the result list
        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            // Get the last interval added to the result list
            int[] lastAddedInterval = result.getLast();
            // If the current interval overlaps with the last added interval, merge them
            if (lastAddedInterval[1] >= intervals[i][0]) {
                lastAddedInterval[1] = Math.max(lastAddedInterval[1], intervals[i][1]);
            } else {
                // Otherwise, add the current interval to the result list
                result.add(intervals[i]);
            }
        }
        // Convert the LinkedList to a 2D array and return it
        return result.toArray(new int[result.size()][]);
    }
}
