package handsome.doc.data_structures.hash_tables;

import javax.annotation.Nonnull;
import java.util.HashMap;

public class FirstRecurringCharacter {

    /**
     * Solution before watching the solution video.
     */
    public int firstRecurringCharacter(@Nonnull final int[] input) {
        final HashMap<Integer, Boolean> map = new HashMap<>();

        for (final int value : input) {
            if (map.containsKey(value)) {
                return value;
            }

            map.put(value, true);
        }

        return -1;
    }
}
