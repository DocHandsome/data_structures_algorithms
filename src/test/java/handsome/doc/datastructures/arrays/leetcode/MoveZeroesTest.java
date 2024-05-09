package handsome.doc.datastructures.arrays.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoveZeroesTest {

    @Test
    void testCase1() {
        int[] result = {0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(result);
        final int[] expected = {1, 3, 12, 0, 0};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testCase2() {
        int[] result = {0};
        new MoveZeroes().moveZeroes(result);
        final int[] expected = {0};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testCase3() {
        int[] result = {1, 0, 1};
        new MoveZeroes().moveZeroes(result);
        final int[] expected = {1, 1, 0};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testCase4() {
        int[] result = {2, 1};
        new MoveZeroes().moveZeroes(result);
        final int[] expected = {2, 1};
        Assertions.assertArrayEquals(expected, result);
    }


}