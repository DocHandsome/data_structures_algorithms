package handsome.doc.data_structures.stacks_queues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QueueTest {


    @Test
    void enqueue() {
        final Queue<Integer> myQueue = new Queue<>();
        myQueue.enqueu(10);
        myQueue.enqueu(20);
        myQueue.enqueu(30);
        Assertions.assertEquals(10, myQueue.peek());
    }

    @Test
    void dequeu() {
        final Queue<Integer> myQueue = new Queue<>();
        myQueue.enqueu(10);
        myQueue.enqueu(20);
        myQueue.enqueu(30);
        Assertions.assertEquals(10, myQueue.dequeu());
        Assertions.assertEquals(20, myQueue.dequeu());
        Assertions.assertEquals(30, myQueue.dequeu());
        Assertions.assertNull(myQueue.dequeu());
    }
}