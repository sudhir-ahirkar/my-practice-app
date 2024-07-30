package com.practice.test.array;

public class  FindClosestNumber {

    public static void main(String[] args) {
//        int[] arr = {-100000,-100000};
//        int[] arr = {-100000,100000};
//        int[] arr = {-4,-2,1,4,8};
        int[] arr = {8, 9, 5, -3, 4, 3, 28};
        //int closestNum = getClosestToZero6(arr);
        int closestNum = getClosestToZero9(arr);
        System.out.println("Closest Number ===>" + closestNum);
//        System.out.println("findClosestNumber: Two of largest two element is : " + getClosestToZero7(arr));
    }
/*
*
*         int minNum = Integer.MAX_VALUE, closeNum = 0;
        for (int num : a) {
            if (Math.abs(num) < minNum) {
                minNum = Math.abs(num);
                closeNum = num;
            } else if (Math.abs(num) == minNum) {
                closeNum = Math.max(closeNum, num);
            }
        }
* */
    private static int getClosestToZero9(int[] arr) {
        int min = Integer.MAX_VALUE;
        int closestNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(Math.abs(arr[i])<min){
                min = Math.abs(arr[i]);
                closestNum = arr[i];
            }else if(min==Math.abs(arr[i])){
                closestNum = Math.max(arr[i],min);
            }
        }
        return closestNum;
    }






    // Min one
    private static int getClosestToZero8(int[] arr) {
        int minNum = Integer.MAX_VALUE, maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int num = Math.abs(arr[i]);
            if(num<minNum){
                minNum = num;
                maxNum = arr[i];
            }else if(num==minNum){
                maxNum = Math.max(maxNum,arr[i]);
            }
        }
       return maxNum;
    }

    private static int getClosestToZero7(int[] arr) {
       int minNum = Integer.MAX_VALUE, closeNum = 0;
       for (int num : arr){
           if(Math.abs(num)<minNum){
               minNum = Math.abs(num);
               closeNum = num;
           }else if (minNum == Math.abs(num)){
               closeNum = Math.max(num, closeNum);
           }
       }
        return closeNum;
    }









        private static int getClosestToZero6(int[] arr) {
        int minNum = Integer.MAX_VALUE, closestNum=0;
        for (int num : arr){
            if(Math.abs(num)<minNum){
             closestNum = num;
             minNum = Math.abs(minNum);
            }else if(Math.abs(num)==minNum){
                closestNum = num;
            }
        }
         return closestNum;
    }

    //2. Implement the following function
    public static int getClosestToZero(int[] a) {
      /*
      Please implement this method to return the integer number
      in a given array that is closest to zero.
      If there are two equally closest to zero elements like 2 and -2
      consider the positive element, i.e. 2, to be closer to zero
    */
        int minNum = Integer.MAX_VALUE, closeNum = 0;
        for (int num : a) {
            if (Math.abs(num) < minNum) {
                minNum = Math.abs(num);
                closeNum = num;
            } else if (Math.abs(num) == minNum) {
                closeNum = Math.max(closeNum, num);
            }
        }
        return closeNum;
    }
/*    private static int getClosestToZero6(int[] arr) {
        int minNum = Integer.MAX_VALUE, closeNumber = 0;
        for (int num : arr){
            if(Math.abs(num)<minNum){
                closeNumber = num;
                minNum = Math.abs(minNum);
            }else if(minNum==Math.abs(num)){
                closeNumber = num;
            }
        }
        return closeNumber;
    }*/
}
