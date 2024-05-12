package handsome.doc.data_structures.stacks_queues;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Queue<T> {

    class Node {
        T data;
        Node next = null;

        public Node(final T data) {
            this.data = data;
        }
    }

    private Node first;
    private Node last;
    private int length = 0;

    public T peek() {
        return this.first.data;
    }

    public void enqueu(@Nonnull final T value) {

        final Node newNode = new Node(value);

        if (first == null && last == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }

        length++;
    }

    @Nullable
    public T dequeu() {

        if (isEmpty()) {
            return null;
        }

        final T data = this.first.data;
        first = this.first.next;
        length--;
        return data;
    }

    public boolean isEmpty() {
        return length == 0;
    }
}
