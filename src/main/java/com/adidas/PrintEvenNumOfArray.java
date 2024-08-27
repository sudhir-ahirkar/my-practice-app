package com.adidas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenNumOfArray {
    public static void main(String[] args) {
        int[] arr = {2,4,7,6,9,11,14,16};
        List<Integer> lst =
                Arrays.stream(arr)
                        .filter(num->num%2==0)
                        .boxed()
                        .collect(Collectors.toList());
        System.out.println("lst===>"+lst);
    }
}
