/*
 * @lc app=leetcode id=380 lang=java
 *
 * [380] Insert Delete GetRandom O(1)
 */

// array list: store,insert,delete,get random
// hash map: val,index in array list

import java.util.ArrayList;
import java.util.Random;

// package Array;
// @lc code=start
class RandomizedSet {

    ArrayList<Integer> list;

    public RandomizedSet() {
        list = new ArrayList<>();

    }

    public boolean insert(int val) {
        if (list.contains(val)) {
            return false;
        }
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!list.contains(val)) {
            return false;
        }
        list.remove(Integer.valueOf(val));
        return true;
    }

    public int getRandom() {
        Random ran = new Random();
        return list.get(ran.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
// @lc code=end
