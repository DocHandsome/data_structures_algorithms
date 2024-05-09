package handsome.doc.big_o;

import javax.annotation.Nonnull;

public class O_n {

    public static void main(String[] args) {
        final String[] nemo = {"Nemo"};
        final String[] everyone = {"dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt", "darla", "hank"};

        final String[] large = new String[100];

        for (int i = 0; i < 100; i++) {
            large[i] = "Nemo";
        }

        findNemo(large);
    }

    private static void findNemo(@Nonnull String[] array) { // O(n) --> Linear Time
        double t0 = System.nanoTime();

        for (int i = 0; i < array.length; i++) {
            if ("nemo".equalsIgnoreCase(array[i])) {
                System.out.println("Found NEMO!!!");
            }
        }

        double t1 = System.nanoTime();

        System.out.println("Cal to find Nemo took " + (t1 - t0) + " nanoseconds");
    }
}
