/*
 * @lc app=leetcode id=134 lang=java
 *
 * [134] Gas Station
 */

// logic: Gas Station
// gas: [1,2,3,4,5]
// cost: [3,4,5,1,2]
// 4-1=3
// 3+5-2=6
// 6+1-3=4
// 4+2-4=2
// 2+3-5=0
// start from index 3
// circuit complete
// TC: O(n)

//  package Array;
// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0; // total gas
        int totalcost = 0; // total cost

        for (int i = 0; i < gas.length; i++) {
            totalgas += gas[i];
            totalcost += cost[i];
        }
        if (totalgas < totalcost) {
            return -1;
        }
        int sum = 0;
        int start = 0; // start index
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            if (sum < 0) { // if sum > 0, then that index can be a start point
                sum = 0;
                start = i + 1;
            }
        }
        return start;
    }
}
// @lc code=end
