package handsome.doc.datastructures.arrays.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            final int difference =  target - num;
            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.put(num, i);
        }

        return new int[]{};
    }

}
