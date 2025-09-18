/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

//the package name should be the same as the file path
package Array;

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
// @lc code=end