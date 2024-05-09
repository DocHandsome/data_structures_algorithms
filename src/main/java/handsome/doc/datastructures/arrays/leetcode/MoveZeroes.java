package handsome.doc.datastructures.arrays.leetcode;

/**
 * https://leetcode.com/problems/move-zeroes/
 * Time Complexity = O(n)
 * Space Complexity = O(1)
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) {
            return;
        }

        int pointerLeft = 0;
        int pointerRight = 1;

        while (pointerRight < nums.length) {
            if (nums[pointerLeft] == 0 && nums[pointerRight] != 0) {
                nums[pointerLeft] = nums[pointerRight];
                nums[pointerRight] = 0;
                pointerLeft++;
                pointerRight++;
            } else if (nums[pointerLeft] != 0) {
                if (pointerLeft < pointerRight) {
                    pointerLeft++;
                } else {
                    pointerRight++;
                }
            } else {
                pointerRight++;
            }
        }
    }
}
