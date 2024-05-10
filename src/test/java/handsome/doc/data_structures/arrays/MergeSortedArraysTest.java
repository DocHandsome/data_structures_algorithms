package handsome.doc.data_structures.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortedArraysTest {

    @Test
    void mergeSortedArrays() {
        final int[] result = new MergeSortedArrays().mergeSortedArrays(new int[]{0, 3, 4, 31}, new int[]{4, 6, 30});
        final int[] expected = {0, 3, 4, 4, 6, 30, 31};
        Assertions.assertArrayEquals(expected, result);
    }

}