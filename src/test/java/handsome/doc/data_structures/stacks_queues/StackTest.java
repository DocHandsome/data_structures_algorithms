package handsome.doc.data_structures.stacks_queues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack<Integer> myStack;

    @BeforeEach
    void setup() {
        myStack = new Stack<>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
    }

    @Test
    void push() {
        myStack.push(10);
        Assertions.assertEquals(10, myStack.peek());
        myStack.push(20);
        Assertions.assertEquals(20, myStack.peek());
        myStack.push(30);
        Assertions.assertEquals(30, myStack.peek());
    }

    @Test
    void isEmpty() {
        final Stack<Integer> stacky = new Stack<>();
        assertTrue(stacky.isEmpty());
        stacky.push(5);
        assertFalse(stacky.isEmpty());
    }

    @Test
    void pop() {
        assertEquals(Integer.valueOf(50), myStack.pop());
        assertEquals(Integer.valueOf(40), myStack.pop());
        assertEquals(Integer.valueOf(30), myStack.pop());
        assertEquals(Integer.valueOf(20), myStack.pop());
        assertEquals(Integer.valueOf(10), myStack.pop());
        assertThrows(IllegalStateException.class, () -> myStack.pop());
    }

}