/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// Swap two segments of an array
// Reverse the entire array: abcde -> edcba
// Reverse the first k elements: edcba -> cdeba
// Reverse the remaining n-k elements: cdeba -> cdeab
// reverse(nums, 0, n - 1);
// reverse(nums, 0, k - 1);
// reverse(nums, k, n - 1);

package Array;

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {

        // Brute Force
        // int n = nums.length;
        // int j = 0;

        // for (int i = 0; i < k % n; i++) {
        // int temp = nums[n - 1];
        // for (j = n - 1; j > 0; j--) {
        // nums[j] = nums[j - 1];
        // }
        // nums[0] = temp;
        // }

        // Optimal Approach
        int n = nums.length;

        if (k > n) {
            k = k % n;
        }
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
// @lc code=end
