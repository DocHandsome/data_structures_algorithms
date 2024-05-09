package handsome.doc.big_o;

import javax.annotation.Nonnull;

public class O_n_pow_2 {

    // Log al pairs of array.
    public static void main(String[] args) {
        String[] boxes ={"a", "b", "c", "d", "e"} ;
        logAllPairsOfArray(boxes);
    }

    private static void logAllPairsOfArray(@Nonnull String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + " " + array[j]);
            }
        }
    }
}
