package com.practice.test.array;

//Best Time to Buy and Sell Stock

    /*
        You are given an array prices where prices[i] is the price of a given stock on the ith day.
        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

        Example 1:

        Input: prices = [7,1,5,3,6,4]
        Output: 5

        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

        Example 2:

        Input: prices = [7,6,4,3,1]
        Output: 0
        Explanation: In this case, no transactions are done and the max profit = 0.

        Constraints:

        1 <= prices.length <= 105
        0 <= prices[i] <= 104*/

public class BuySellStock {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 8, 4};
        int maxProfit = maxProfitTest3(prices);
        System.out.println("Max profit ==>" + maxProfit);
    }

    private static int maxProfitTest3(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i],min);
            max = Math.max(max,(prices[i]-min));
        }
        return max;
    }

    private static int maxProfitTest1(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minVal = Math.min(minVal,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-minVal);
        }
        return maxProfit;
    }

    private static int maxProfitTest(int[] prices) {
        int minNum = Integer.MAX_VALUE,maxProfit=0;
        for (int num : prices){
//            if(num<minNum){
//                minNum = num;
//            }
           // or
            minNum = Math.min(num, minNum);
            maxProfit = Math.max((num - minNum),maxProfit);
        }
        return maxProfit;
    }









    public static int maxProfit1(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            max = Math.max((prices[i] - min), max);
        }
        return max;
    }


    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            System.out.println("(prices[i]-min)===>" + (prices[i] - min));
            max = Math.max((prices[i] - min), max);
        }
        return max;
    }

}

