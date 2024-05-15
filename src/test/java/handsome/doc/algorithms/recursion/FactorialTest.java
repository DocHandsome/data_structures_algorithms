package handsome.doc.algorithms.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    void iterative() {
        Assertions.assertEquals(120, new Factorial().findFactorialIterative(5));
        Assertions.assertEquals(2, new Factorial().findFactorialIterative(2));
        Assertions.assertEquals(1, new Factorial().findFactorialIterative(1));
    }

    @Test
    void recursive() {
        Assertions.assertEquals(120, new Factorial().findFactorialRecursive(5));
        Assertions.assertEquals(2, new Factorial().findFactorialRecursive(2));
        Assertions.assertEquals(1, new Factorial().findFactorialRecursive(1));
    }
}