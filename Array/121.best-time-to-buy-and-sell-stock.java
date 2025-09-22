/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

//Buy on the lowest day, sell on the highest day after that
//array traversal, O(n) time, O(1) space
//max profit = max(sell - buy)
//lowest buy, highest sell(profit)

// package Array;
// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > maxProfit) {
                maxProfit = prices[i] - buy; // sell - buy
            }
        }
        return maxProfit;
    }
}
// @lc code=end
