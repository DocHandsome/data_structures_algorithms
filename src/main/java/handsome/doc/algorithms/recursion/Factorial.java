package handsome.doc.algorithms.recursion;

public class Factorial {

    public int findFactorialRecursive(final int number) {
        if (number == 1) {
            return 1;
        }

        return  number * findFactorialRecursive(number - 1);
    }

    public int findFactorialIterative(final int number) {
        int anwser = 1;

        for (int i = 2; i <= number; i++) {
            anwser = anwser * i;
        }

        return anwser;
    }
}
