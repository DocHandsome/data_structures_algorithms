package handsome.doc.data_structures.arrays;

import javax.annotation.Nonnull;

/**
 * mergeSortedArrays([0,3,4,31],[4,6,30])
 * solution: [0, 3, 4, 4, 6, 30, 31]
 */
public class MergeSortedArrays {

    /**
     * My Solution before watching the solution video
     */
    @Nonnull
    public int[] mergeSortedArrays(@Nonnull final int[] array1, @Nonnull final int[] array2) {

        final int totalLength = array1.length + array2.length;
        final int[] result = new int[totalLength];
        int array1Pointer = 0;
        int array2Pointer = 0;

        for (int i = 0; i < totalLength; i++) {
            if (array1Pointer < array1.length && (array2Pointer == array2.length || array1[array1Pointer] <= array2[array2Pointer])) {
                result[i] = array1[array1Pointer];
                array1Pointer++;
            } else {
                result[i] = array2[array2Pointer];
                array2Pointer++;
            }
        }

        return result;
    }
}
