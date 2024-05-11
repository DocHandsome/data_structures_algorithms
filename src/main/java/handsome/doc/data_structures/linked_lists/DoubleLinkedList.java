package handsome.doc.data_structures.linked_lists;

import javax.annotation.Nonnull;

public class DoubleLinkedList<T> {

    class Node {
        T data;
        Node next;
        Node prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    public DoubleLinkedList(@Nonnull final T data) {
        this.head = new Node(data);
        this.tail = this.head;
        this.length = 1;
    }

    public void append(@Nonnull final T value) {
        final Node newNode = new Node(value);
        newNode.prev = this.tail;
        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;
    }

    public void prepend(@Nonnull final T value) {
        final Node newNode = new Node(value);
        this.head.prev = newNode;
        newNode.next = this.head;
        this.head = newNode;
        this.length++;
    }

    public void insert(final int index, @Nonnull final T value) {
        if (index > this.length) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            prepend(value);
        }

        if (index == this.length) {
            append(value);
        }

        Node leader = traverseToIndex(index);

        final Node newNode = new Node(value);
        newNode.prev = leader;
        newNode.next = leader.next;
        leader.next.prev = newNode;
        leader.next = newNode;
        this.length++;
    }

    public void delete(final int index) {
        final Node leader = traverseToIndex(index - 1);
        leader.next.prev = leader;
        leader.next = leader.next.next;
        this.length--;
    }

    private Node traverseToIndex(final int index) {
        int counter = 0;
        Node currentNode = this.head;
        while (counter != index) {
            currentNode = currentNode.next;
            counter++;
        }
        return currentNode;
    }

    public void printList() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        Node currentNode = this.head;
        while (currentNode != null) {
            stringBuilder.append(currentNode.data.toString())
                    .append(", ");
            currentNode = currentNode.next;
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());
    }

}
