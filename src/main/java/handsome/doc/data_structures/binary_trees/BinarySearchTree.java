package handsome.doc.data_structures.binary_trees;

import javax.annotation.Nonnull;

public class BinarySearchTree<T extends Comparable<T>> {

    class Node {
        private T data;
        private Node left = null;
        private Node right = null;

        public Node(final T data) {
            this.data = data;
        }
    }

    private Node root = null;

    public void insert(@Nonnull final T value) {
        final Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
        } else {
            Node currentNode = root;
            while (true) {
                if (value.compareTo(currentNode.data) < 0) {
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        return;
                    }

                    currentNode = currentNode.left;
                } else {
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        return;
                    }

                    currentNode = currentNode.right;
                }
            }
        }
    }

    public boolean lookup(@Nonnull final T value) {
        if (root == null) {
            return false;
        }

        Node currentNode = root;

        while (currentNode != null) {
            if (value.compareTo(currentNode.data) < 0) {
                currentNode = currentNode.left;
            } else if (value.compareTo(currentNode.data) > 0) {
                currentNode = currentNode.right;
            } else {
                return true;
            }
        }

        return false;
    }
}
