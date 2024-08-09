package com.practice.test.coding_test;

public class Permutation {
    public static void main(String[] args) {
        String tempStr = "ABC";
        permutation(0,tempStr);

    }

    private static void permutation(int index,String tempStr) {

        if(index==tempStr.length()-1){
            System.out.println(tempStr);
            return;
        }

        for (int i = index; i < tempStr.length(); i++) {

            tempStr=swap(tempStr,i,index);
            permutation(index+1,tempStr);
            tempStr=swap(tempStr,i,index);


        }
    }

    public static String swap(String str, int i, int index){
        char[] charArr = str.toCharArray();
        char temp = charArr[i];
        charArr[i]=charArr[index];
        charArr[index]=temp;
        return new String(charArr);
    }
}
