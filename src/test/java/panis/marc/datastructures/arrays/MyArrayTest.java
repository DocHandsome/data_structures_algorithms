package panis.marc.datastructures.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}