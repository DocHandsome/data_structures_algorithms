package handsome.doc.data_structures.hash_tables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstRecurringCharacterTest {

    @Test
    void testCase1() {
        final int[] array = {2, 5, 1, 2, 3, 5, 1, 2, 4};
        final int expected = 2;

        Assertions.assertEquals(expected, new FirstRecurringCharacter().firstRecurringCharacter(array));
    }

    @Test
    void testCase2() {
        final int[] array = {2,1,1,2,3,5,1,2,4};
        final int expected = 1;

        Assertions.assertEquals(expected, new FirstRecurringCharacter().firstRecurringCharacter(array));
    }
    
    @Test
    void testCase3() {
        final int[] array = {2,3,4,5};
        final int expected = -1;

        Assertions.assertEquals(expected, new FirstRecurringCharacter().firstRecurringCharacter(array));
    }


}