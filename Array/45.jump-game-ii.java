/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// Min Number of Jumps to Reach the Last Index
// You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
// Each element nums[i] represents the maximum length of a forward jump from index i. In
// other words, if you are at nums[i], you can jump to any nums[i + j] where:
// Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].

// package Array;
// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0; // for counting jumps
        int farthest = 0; // for finding the farthest we can reach

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]); // sum(index, max jump from that index(2,3,4 = 3 + index of 3))
            if (i == currentEnd) { // we need to make a jump, so we update the currentEnd to farthest
                jumps++;
                currentEnd = farthest; // update the currentEnd to the farthest we can reach
            }
        }
        return jumps;
    }
}
// @lc code=end
