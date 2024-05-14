package handsome.doc.data_structures.binary_trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {


    @Test
    void lookup() {
        BinarySearchTree<Integer> myTree = new BinarySearchTree<>();

        myTree.insert(9);
        myTree.insert(4);
        myTree.insert(6);
        myTree.insert(20);
        myTree.insert(170);
        myTree.insert(15);
        myTree.insert(1);

        Assertions.assertTrue(myTree.lookup(9));
        Assertions.assertTrue(myTree.lookup(4));
        Assertions.assertTrue(myTree.lookup(6));
        Assertions.assertTrue(myTree.lookup(170));
        Assertions.assertTrue(myTree.lookup(15));
        Assertions.assertTrue(myTree.lookup(1));
        Assertions.assertFalse(myTree.lookup(50));
    }
}
