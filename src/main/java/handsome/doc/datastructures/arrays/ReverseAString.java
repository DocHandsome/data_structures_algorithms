package handsome.doc.datastructures.arrays;

import javax.annotation.Nonnull;

/**
 * Create a function that reverses a string
 * "Hi My name is Andrei" should be:
 * "ierdnA si eman yM iH"
 */
public class ReverseAString {

    // My solution (before watching the solution video)
    // Time complexity : O(n) - Linear Time
    @Nonnull
    public String reverse(@Nonnull final String value) {
        final StringBuilder stringBuilder = new StringBuilder(value.length());

        for (int i = value.length() - 1; i >= 0; i--) {
            stringBuilder.append(value.charAt(i));
        }

        return stringBuilder.toString();
    }
}
