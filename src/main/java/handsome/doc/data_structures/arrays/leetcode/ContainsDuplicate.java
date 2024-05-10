package handsome.doc.data_structures.arrays.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/contains-duplicate/
 * Time Complexity : O(n)
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        final Map<Integer, Void> map = new HashMap<>(nums.length);

        for (final int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }

            map.put(num, null);
        }

        return false;
    }
}
