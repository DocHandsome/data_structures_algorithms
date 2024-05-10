package handsome.doc.data_structures.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyArrayTest {

    private MyArray myArray;

    @BeforeEach
    void setup() {
        this.myArray = new MyArray();
        myArray.push("hi");
        myArray.push("you");
        myArray.push("!");
    }

    @Test
    void get() {
        Assertions.assertEquals("hi", myArray.get(0));
    }

    @Test
    void push() {
        final int index = myArray.push("Test");
        Assertions.assertEquals("Test", myArray.get(index));
    }

    @Test
    void get_outOfBoundsException() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> myArray.get(99));
    }

    @Test
    void pop() {
        final Object lastItem = myArray.pop();
        Assertions.assertEquals("!", lastItem);
    }

    @Test
    void delete() {
        final Object deleted = myArray.delete(1);
        Assertions.assertEquals("you", deleted);
        Assertions.assertEquals("hi", myArray.get(0));
        Assertions.assertEquals("!", myArray.get(1));
        Assertions.assertNull(myArray.get(2));
    }

    @Test
    void length() {
        Assertions.assertEquals(3, myArray.length());
    }
}