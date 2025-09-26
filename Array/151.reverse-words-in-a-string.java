/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

//  package Array;
// @lc code=start
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // Split by one or more spaces
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]); // Append the word
            if (i != 0) { // Avoid adding space after the last word
                reversed.append(" "); // Append a space
            }
        }
        return reversed.toString(); // Convert StringBuilder to String and return
    }
}
// @lc code=end
