/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// i=2, j-2 

// package Array;

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 2;

        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
// @lc code=end
