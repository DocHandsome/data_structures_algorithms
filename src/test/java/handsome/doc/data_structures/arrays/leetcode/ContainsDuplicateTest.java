package handsome.doc.data_structures.arrays.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {

    @Test
    void testCase1() {
        Assertions.assertTrue(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    void testCase2() {
        Assertions.assertFalse(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    void testCase3() {
        Assertions.assertTrue(new ContainsDuplicate().containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}