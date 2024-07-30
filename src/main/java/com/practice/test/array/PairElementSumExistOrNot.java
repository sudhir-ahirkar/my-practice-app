package com.practice.test.array;

import java.util.HashMap;
import java.util.Map;

public class PairElementSumExistOrNot {

    public static void main (String[] args)
    {
        int arr_int[] = {22, 25, 17, 18, 19, 20};
        int sum = 42;
        int n = arr_int.length;
        if (sum_pair(arr_int, n, sum))
            System.out.print("Array has a pair of elements with sum 42.");
        else
            System.out.print("Array has no pair with sum 42.");
    }
    private static boolean sum_pair(int[] arr_int, int n, int sum) {
        boolean isSumPairExist = false;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr_int.length; i++) {
            if(!map.containsKey(sum-arr_int[i])) {
                map.put(arr_int[i], i);
            }else {
                int[] arr=new int[2];
                int val= map.get(sum-arr_int[i]);
                int val1=i;
                arr[0]=val;
                arr[1]=val1;
                System.out.println("Indexes are "+val+" "+ val1 +" values are "+ arr_int[i] +" and" + arr_int[val]);
                isSumPairExist = true;
//                break;
            }
        }
        return isSumPairExist;
    }
}
