/*
 * @lc app=leetcode id=274 lang=java
 *
 * [274] H-Index
 */

// H -Index: h papers have at least h citations each, and the other n - h papers have no more than h citations each.
// h papaer and h times cited
// return the researcher's h-index.
// sort, then atleast h times cited
// n-i <= citations[i]
// Time: O(nlogn) Space: O(1)

import java.util.Arrays;

// package Array;
// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                return h;
            }
        }
        return 0;
    }
}
// @lc code=end
