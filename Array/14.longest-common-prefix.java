/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

//Logic: store the first string then iterate through the rest of the strings
// If the current string does not start with the prefix, reduce the prefix by one character
//Time Complexity: O(N*M) where N is the number of strings and M is the length of the shortest string
//Space Complexity: O(1)

//  package Array;
// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}
// @lc code=end
