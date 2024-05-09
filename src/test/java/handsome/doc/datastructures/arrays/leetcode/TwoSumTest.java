package handsome.doc.datastructures.arrays.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void testCase1() {
        final int[] result = new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9);
        final int[] expected = {0, 1};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testCase2() {
        final int[] result = new TwoSum().twoSum(new int[]{3, 2, 4}, 6);
        final int[] expected = {1,2};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testCase3() {
        final int[] result = new TwoSum().twoSum(new int[]{3, 3}, 6);
        final int[] expected = {0, 1};
        Assertions.assertArrayEquals(expected, result);
    }

}