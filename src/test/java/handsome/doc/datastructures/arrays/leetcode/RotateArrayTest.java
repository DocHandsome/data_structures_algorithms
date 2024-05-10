package handsome.doc.datastructures.arrays.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.annotation.Nonnull;

class RotateArrayTest {

    @Test
    void testCase1() {
        int[] result = {1, 2, 3, 4, 5, 6, 7};
        new RotateArray().rotate(result, 3);
        final int[] expected = {5, 6, 7, 1, 2, 3, 4};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testCase2() {
        int[] result = {-1, -100, 3, 99};
        new RotateArray().rotate(result, 2);
        final int[] expected = {3, 99, -1, -100};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testCase3() {
        int[] result = {1, 2};
        new RotateArray().rotate(result, 3);
        final int[] expected = {2, 1};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testCase4() {
        int[] result = {-1};
        new RotateArray().rotate(result, 2);
        final int[] expected = {-1};
        Assertions.assertArrayEquals(expected, result);
    }
}