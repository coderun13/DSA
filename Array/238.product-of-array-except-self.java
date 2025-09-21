/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// logic: product not including self = product of left side * product of right side
// left side product can be stored in result array
// right side product can be stored in a variable and updated in each iteration

//Perfix and Suffix product approach
// Prefix product: product of all elements to the left of the current element
// Suffix product: product of all elements to the right of the current element
// lastly multiply prefix and suffix products to get the final result

//  package Array;
// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1; // product of left side of first element is 1
        for (int i = 1; i < n; i++) { // traverse from left to right
            result[i] = result[i - 1] * nums[i - 1]; // product of left side
        }
        int R = 1; // R is product of right side
        for (int i = n - 1; i >= 0; i--) { // traverse from right to left
            result[i] *= R; // multiply with product of right side
            R *= nums[i]; // update product of right side
        }
        return result;
    }
}
// @lc code=end
