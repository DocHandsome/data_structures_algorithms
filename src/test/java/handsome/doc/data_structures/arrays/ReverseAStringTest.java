package handsome.doc.data_structures.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseAStringTest {

    @Test
    void reverse() {
        final String input = "Hi My name is Andrei";
        final String result = new ReverseAString().reverse(input);
        Assertions.assertEquals("ierdnA si eman yM iH", result);
    }
}