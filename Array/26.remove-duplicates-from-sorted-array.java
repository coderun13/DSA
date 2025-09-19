/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// Two Pointers: i, j
// i: slow pointer, j: fast pointer
// If nums[i] == nums[j], move j
// If nums[i] != nums[j], copy nums[j] to nums[i + 1], move both pointers
// Example: [0,0,1,1,1,2,2,3,3,4]
// i = 0, j = 1 -> nums[0] == nums[1], j++
// i = 0, j = 2 -> nums[0] != nums[2], i++, nums[1] = nums[2], j++
// i = 1, j = 3 -> nums[1] == nums[3], j++
// i = 1, j = 4 -> nums[1] == nums[4], j++
// i = 1, j = 5 -> nums[1] != nums[5], i++, nums[2] = nums[5], j++
// i = 2, j = 6 -> nums[2] == nums[6], j++
// i = 2, j = 7 -> nums[2] != nums[7], i++, nums[3] = nums[7], j++
// i = 3, j = 8 -> nums[3] == nums[8], j++
// i = 3, j = 9 -> nums[3] != nums[9], i++, nums[4] = nums[9], j++
// End: i = 4, return i + 1 = 5

package Array;

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 1; // fast pointer

        for (int i = 0; i < n - 1; i++) { // slow pointer
            if (nums[i] != nums[j - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
// @lc code=end
