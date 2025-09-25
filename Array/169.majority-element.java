/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

//1. Brute Force: Sorting
//2. HashMap: (key, value) = (element, frequency)
//3. Boyer-Moore Voting Algorithm: (count, candidate), if count == 0, candidate = current element, if current element == candidate, count++, else count--
// Optimised way: Boyer-Moore Voting Algorithm
// Time Complexity: O(n)

// @lc code=start

package Array;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {

        // Method 2: HashMap
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        // if (map.containsKey(nums[i])) {
        // int count = map.get(nums[i]);
        // map.put(nums[i], count + 1);
        // } else {
        // map.put(nums[i], 1);
        // }
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        // if (entry.getValue() > n / 2) {
        // return entry.getKey();
        // }
        // }
        // }
        // return 0;

        // Method 3: Boyer-Moore Voting Algorithm
        // (count, candidate), if count == 0, candidate = current element, if current
        // element == candidate, count++, else count--
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
// @lc code=end
