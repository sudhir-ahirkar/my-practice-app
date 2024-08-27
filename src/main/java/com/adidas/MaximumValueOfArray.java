package com.adidas;

public class MaximumValueOfArray {
    public static void main(String[] args) {
        int[] arr = {2,5,8,45,2,34,11,67,15,3,2,8,0};
        int result = getMaximumValue(arr);
        System.out.println("result===>"+result);
    }

    private static int getMaximumValue(int[] arr) {
        int maxNum = Integer.MIN_VALUE;
        for (int num : arr){
            if(num>maxNum){
                maxNum = num;
            }
        }
       return maxNum;
    }
}
