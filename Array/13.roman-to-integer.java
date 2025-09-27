/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

//logic: 
// 1. Create a map to store the values of the Roman numerals
// 2. Initialize a variable to keep track of the total value
// 3. Iterate through the string, and for each character, check if the next character is larger
// 4. If it is, subtract the current value from the total, otherwise add it
// 5. Return the total

// package Array;

// @lc code=start

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0; // ?: means if-else // total meaning: if
                                                                            // next exists, get its value, otherwise 0

            if (current < next) {
                total -= current;
            } else {
                total += current;
            }
        }
        return total;
    }
}
// @lc code=end
