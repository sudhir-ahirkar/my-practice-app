package com.practice.test.coding_test;

public class TestCoding {

    // integer list //


    // Ascenting or Desceding if both not then retrun

    // Ascending

    // "String"

    public static void main(String[] args) {

        int[] arr = {1,6,7,9,34};
//        int[] arr = {9,8,5,4,3};

        isArrayAscenOrDesced(arr);
    }

    private static void isArrayAscenOrDesced(int[] arr){
        int flag = 0;
        int index = 0;
        int i = 1;
            while(i<arr.length){
                if(arr[index]>arr[i]){
                    flag = 1;
                    index++;
                    i++;
                }else{
                    flag=0;
                    break;
                }
            }

            while(i<arr.length){
                if(arr[index]<arr[i]){
                    flag = 2;
                    index++;
                    i++;
                }else{
                    flag=0;
                    break;
                }
            }

        if(flag==2){
            System.out.println("List is Ascending order");
        }else if(flag==1){
            System.out.println("List is Descending order");
        }else{
            System.out.println("List is not Ascending and Descending order");
        }
    }
}
