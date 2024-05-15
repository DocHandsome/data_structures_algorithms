package handsome.doc.algorithms.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Test
    void iterative() {
        Assertions.assertEquals(2, new Fibonacci().fibonacciIterative(3));
        Assertions.assertEquals(21, new Fibonacci().fibonacciIterative(8));
    }

    @Test
    void recursive() {
        Assertions.assertEquals(2, new Fibonacci().fibonacciRecursive(3));
        Assertions.assertEquals(21, new Fibonacci().fibonacciRecursive(8));
    }
}