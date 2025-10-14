package Arvores_java.src;

public class BinarySearchTree {
    class Node {
        int value;
        Node left, right;
        Node(int value) { this.value = value; }
    }

    Node root;
    
    Node insert(Node node, int value) {
        if (node == null)
            return new Node(value);
        if (value < node.value)
            node.left = insert(node.left, value);
        else if (value > node.value)
            node.right = insert(node.right, value);
        return node;
    }

    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }

    void display(Node node, String prefix, boolean isTail) {
        if (node == null) return;
        System.out.println(prefix + (isTail ? "└── " : "├── ") + node.value);
        if (node.left != null || node.right != null) {
            if (node.right != null)
                display(node.right, prefix + (isTail ? "    " : "│   "), false);
            if (node.left != null)
                display(node.left, prefix + (isTail ? "    " : "│   "), true);
        }
    }
}
