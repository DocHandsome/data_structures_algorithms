package handsome.doc.datastructures.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyArrayTest {

    @Test
    void get() {
    }

    @Test
    void push() {
        final MyArray myArray = new MyArray();
        myArray.push("hi");

        Assertions.assertEquals("hi", myArray.get(0));
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> myArray.get(99));
    }

    @Test
    void pop() {
        final MyArray myArray = new MyArray();
        myArray.push("hi");
        myArray.push("you");
        myArray.push("!");

        final Object lastItem = myArray.pop();

        Assertions.assertEquals("!", lastItem);
    }


}