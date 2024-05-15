package handsome.doc.algorithms.recursion;

import java.util.ArrayList;

public class Fibonacci {

    public long fibonacciIterative(final int n) {
        ArrayList<Long> arr = new ArrayList<>();
        arr.add(0L);
        arr.add(1L);

        for (int i = 2; i <= n; i++) {
            arr.add(arr.get(i - 2) + arr.get(i - 1));
        }

        return arr.get(n);
    }

    public long fibonacciRecursive(final int n) {
        if (n < 2) {
            return n;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
