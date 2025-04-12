package RedBlackTree;
import java.util.*;
public class RedBlackTree {
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    class Node {
        int data;
        Node left, right, parent;
        boolean color;

        Node(int data) {
            this.data = data;
            this.color = RED; // New nodes are red by default
        }
    }
    private Node root;
    // Left rotate
    private void rotateLeft(Node x) {
        Node y = x.right;
        x.right = y.left;

        if (y.left != null)
            y.left.parent = x;

        y.parent = x.parent;

        if (x.parent == null)
            root = y;
        else if (x == x.parent.left)
            x.parent.left = y;
        else
            x.parent.right = y;

        y.left = x;
        x.parent = y;
    }
    // Right rotate
    private void rotateRight(Node x) {
        Node y = x.left;
        x.left = y.right;
        if (y.right != null)
            y.right.parent = x;

        y.parent = x.parent;

        if (x.parent == null)
            root = y;
        else if (x == x.parent.right)
            x.parent.right = y;
        else
            x.parent.left = y;

        y.right = x;
        x.parent = y;
    }

    // Fixing Red-Black Tree violations after insertion
    private void fixViolation(Node node) {
        while (node != root && node.parent.color == RED) {
            Node parent = node.parent;
            Node grandparent = parent.parent;

            if (parent == grandparent.left) {
                Node uncle = grandparent.right;

                if (uncle != null && uncle.color == RED) {
                    // Case 1: Uncle is red -> recolor
                    parent.color = BLACK;
                    uncle.color = BLACK;
                    grandparent.color = RED;
                    node = grandparent;
                } else {
                    // Case 2 and 3: Uncle is black
                    if (node == parent.right) {
                        node = parent;
                        rotateLeft(node);
                    }
                    parent.color = BLACK;
                    grandparent.color = RED;
                    rotateRight(grandparent);
                }
            } else {
                Node uncle = grandparent.left;

                if (uncle != null && uncle.color == RED) {
                    // Mirror Case 1
                    parent.color = BLACK;
                    uncle.color = BLACK;
                    grandparent.color = RED;
                    node = grandparent;
                } else {
                    // Mirror Case 2 and 3
                    if (node == parent.left) {
                        node = parent;
                        rotateRight(node);
                    }
                    parent.color = BLACK;
                    grandparent.color = RED;
                    rotateLeft(grandparent);
                }
            }
        }

        root.color = BLACK;
    }

    // Insert node
    public void insert(int data) {
        Node node = new Node(data);
        Node y = null;
        Node x = root;

        while (x != null) {
            y = x;
            if (node.data < x.data)
                x = x.left;
            else
                x = x.right;
        }

        node.parent = y;

        if (y == null)
            root = node;
        else if (node.data < y.data)
            y.left = node;
        else
            y.right = node;

        fixViolation(node);
    }
    // Inorder Traversal
    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + (node.color == RED ? "(R) " : "(B) "));
            inorder(node.right);
        }
    }
    public void printTree() {
        inorder(root);
        System.out.println();
    }

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        int[] nums = {10, 20, 30, 15, 25, 5};
        for (int num : nums)
            tree.insert(num);
        tree.printTree();
    }
}