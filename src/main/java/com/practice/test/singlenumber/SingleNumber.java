package com.practice.test.singlenumber;
//263. Ugly Number
/*An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
Given an integer n, return true if n is an ugly number.

Example 1:

Input: n = 6
Output: true
Explanation: 6 = 2 × 3
Example 2:

Input: n = 1
Output: true
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
Example 3:

Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.
*/
public class SingleNumber {

    public static void main(String[] args) {
        int n = 14;
        boolean isUgly = isUgly(n);
        System.out.println("isUgly======>"+isUgly);
    }
    /*
Start with the number 8.
Check if it's less than or equal to 0. It's not, so continue.
Check divisibility by 2. 8 is divisible by 2, so divide 8 by 2, which gives 4.
Now, check if 4 is divisible by 2 again. It is, so divide 4 by 2, which gives 2.
Now, check if 2 is divisible by 2 again. It is, so divide 2 by 2, which gives 1.
Check if 1 is equal to 1. It is, so return true.
*/
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
