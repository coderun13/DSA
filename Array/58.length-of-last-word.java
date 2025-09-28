/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// logic: traverse from end to start, ignore trailing spaces, then count until next space or start of string
// time: O(n), space: O(1)

// package Array;
// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); // Remove leading and trailing spaces
        int length = 0;
        int i = s.length() - 1;

        for (; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                break; // Stop counting when a space is encountered
            }
        }
        return length;
    }
}
// @lc code=end
