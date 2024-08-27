package com.adidas;

public class PermutationOfString {
    public static void main(String[] args) {
        String str = "ABC";
        int index = 0;
        permutationOfStrChar(index,str);
    }

    private static void permutationOfStrChar(int index, String str) {
        if(index==str.length()-1){
            System.out.println(str);
            return;
        }
        for (int i = index; i < str.length(); i++) {
            str = swap(str,i,index);
            permutationOfStrChar(index+1,str);
            str = swap(str,i,index);
        }
    }

    private static String swap(String str, int i, int j){
       char[] arr =  str.toCharArray();
       char temp = arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
       return new String(arr);
    }
}
