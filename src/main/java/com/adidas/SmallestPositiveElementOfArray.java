package com.adidas;

public class SmallestPositiveElementOfArray {
    public static void main(String[] args) {
        int[] arr = {2,5,8,45,2,34,11,67,15,3,2,8,4,-3};
        int result = getMinimumValue(arr);
        System.out.println("result===>"+result);
    }

    private static int getMinimumValue(int[] arr) {
        int minNum = Integer.MAX_VALUE;
        for (int num : arr){
            if(num>=0 && num<minNum){
                minNum=num;
            }
        }
       return minNum;
    }
}
