package handsome.doc.data_structures.linked_lists;

import org.junit.jupiter.api.Test;

class LinkedListTest {

    @Test
    void append() {
        final LinkedList<Integer> myLinkedList = new LinkedList<>(10);
        myLinkedList.append(5);
        myLinkedList.append(16);

        myLinkedList.printList();

        myLinkedList.insert(1, 22);
        myLinkedList.printList();

        myLinkedList.prepend(3);
        myLinkedList.printList();

        myLinkedList.delete(3);
        myLinkedList.printList();
    }

}