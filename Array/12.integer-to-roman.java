/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// logic: 
// 1. Create a map to store the values of the Roman numerals
// 2. Initialize a StringBuilder to build the Roman numeral string
// 3. Iterate through the map in descending order of values
// 4. For each value, while the number is greater than or equal to the value, append the corresponding Roman numeral to the StringBuilder
// 5. Subtract the value from the number
// 6. Return the StringBuilder as a string

// @lc code=start

import java.util.HashMap;

class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        int[] intVal = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] code = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        for (int i = 0; i < intVal.length; i++) {
            while (num >= intVal[i]) {
                num -= intVal[i];
                sb.append(code[i]);
            }
        }
        return sb.toString();
    }
}
// @lc code=end
