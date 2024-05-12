package handsome.doc.data_structures.stacks_queues;

import javax.annotation.Nonnull;

public class Stack<T> {

    class Node {
        T data;
        Node next = null;

        public Node(final T data) {
            this.data = data;
        }
    }

    private Node top = null;
    private Node bottom = null;
    private int length = 0;

    public T peek() {
        return this.top.data;
    }

    public void push(@Nonnull final T value) {
        final Node newNode = new Node(value);

        if (isEmpty()) {
            this.bottom = newNode;
        } else {
            this.top.next = newNode;
        }

        this.top = newNode;
        length++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("The Stack is empty!");
        }
        Node currentNode = this.bottom;

        int counter = 1;
        while (counter < this.length - 1) {
            currentNode = currentNode.next;
            counter++;
        }

        final T pop = this.top.data;
        this.top = currentNode;
        currentNode.next = null;
        length--;
        return pop;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }
}
