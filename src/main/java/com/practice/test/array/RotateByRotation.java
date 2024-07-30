package com.practice.test.array;

public class RotateByRotation {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 4;
        System.out.print("Source Array===>");
        printArr(input);
        printToNextLine();
        int[] resultRight = rotateArrayByRight(input,k);
        System.out.print("Rotate right ==> ");
        printArr(resultRight);
        printToNextLine();
        int[] resultLeft = rotateArrayByRight(input,k);
        System.out.print("Rotate Left ==> ");
        printArr(resultLeft);
    }

    public static int[] rotateArrayByRight(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            int temp = arr[arr.length-1];
            for (int j = arr.length-1; j > 0; j--) {
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        return arr;
    }

    public static int[] rotateArrayByLeft(int[] arr, int k){
        for (int i = 0; i < k; i++) {
            int temp = arr[0];
            for (int j = 0; j > arr.length; j++) {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        return arr;
    }

    public static void printArr(int[] arr){
        for (int num : arr){
            System.out.print(num+" ");
        }
    }

   public static void printToNextLine(){
       System.out.println();
       System.out.println("================");
    }
}
