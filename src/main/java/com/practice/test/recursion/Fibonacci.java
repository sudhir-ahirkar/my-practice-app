package com.practice.test.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        int a = 0;
        int b = 1;
        printFibonacci(a,b,n);
    }

    private static void printFibonacci(int a, int b, int n) {
        if(n==0){
            return;
        }
        System.out.print(a+" ");
        int c = a+b;
        printFibonacci(b,c,n-1);
    }
}
