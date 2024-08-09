package com.practice.test.coding_test;

public class IsNumberUgly {
    public static void main(String[] args) {
        System.out.println(isUgly(11));
    }
    public static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }

        int[] factors = {2, 3, 5};

        for (int factor : factors) {
            while (num % factor == 0) {
                num /= factor;
            }
        }

        return num == 1;
    }
}
