/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// Logic: Jump Game, Steps to Reach the Last Index, Greedy Approach
// Time Complexity: O(n)
// Start from the last index and check if we can reach it from the current index
// If we can reach the last index from the current index, update the last index to the current index
// Continue this process until we reach the first index
// pre index + max jump >= last index

// package Array;
// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        if (goal == 0)
            return true;
        return false;
    }
}
// @lc code=end
