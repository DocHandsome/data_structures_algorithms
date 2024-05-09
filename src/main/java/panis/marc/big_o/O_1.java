package panis.marc.big_o;

import javax.annotation.Nonnull;

public class O_1 {

    public static void main(String[] args) {
        final int[] boxes = {0, 1, 2, 3, 4, 5};
        logFirstTwoBoxes(boxes); // O(2)
    }

    private static void logFirstTwoBoxes(@Nonnull int[] boxes) {
        System.out.println(boxes[0]); // O(1)
        System.out.println(boxes[1]); // O(1)
    }
}
