package handsome.doc.data_structures.linked_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    @Test
    void append() {
        final DoubleLinkedList<Integer> myLinkedList = new DoubleLinkedList<>(10);
        myLinkedList.append(5);
        myLinkedList.append(16);

        myLinkedList.printList();

        myLinkedList.insert(1, 22);
        myLinkedList.printList();

        myLinkedList.prepend(3);
        myLinkedList.printList();

        myLinkedList.delete(3);
        myLinkedList.printList();

        myLinkedList.reverse();
        myLinkedList.printList();

    }
}