package com.Interview.algorithms.arrayproblems;

//Problem: Given an array where the ith element represents the price of a stock on day i,
// find the maximum profit that can be made by buying and selling one stock.
public class MaxProfit {

    public  static  void  main (String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int minPrice = prices[0]; // Store the minimum price encountered
        int maxProfit = 0;        // Store the maximum profit found

        // Iterate through the prices array
        for (int i = 1; i < prices.length; i++) {
            // Update minPrice if we find a lower price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Calculate the profit by selling at the current price
            else {
                int profit = prices[i] - minPrice;
                // Update maxProfit if the current profit is greater
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }


        System.out.println(maxProfit);
    }
}
