package com.practice.test.array;

public class PrimeNumber {

    public static void main(String[] args) {
        int num = 2;
        boolean checkIsNumber = isPrimeNumber(num);
        if (checkIsNumber) {
            System.out.println(num + " is Prime Number");
        } else {
            System.out.println(num + " is Not Prime Number");
        }
    }
    public static boolean isPrimeNumber(int num) {
       boolean isPrime = false;
        for (int i = 2; i <= num; i++) {
            if(num%2==0) {
                return isPrime;
            }
        }
        return true;
    }
}

