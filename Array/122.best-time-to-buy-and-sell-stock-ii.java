/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// You can buy and sell multiple times
// Logic: whenever there is a profit, take it
// buy on the lowest day, sell on the highest day after that

// package Array;
// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buy) {
                maxProfit += prices[i] - buy;
            }
            buy = prices[i];
        }
        return maxProfit;
    }
}
// @lc code=end
