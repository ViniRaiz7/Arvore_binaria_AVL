package Arvores_java.src;

public class Main {
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 10, 4, 5, 9, 7, 8, 6};

        // Árvore Binária de Busca (BST)
        System.out.println("=== Árvore Binária de Busca (BST) ===");
        BinarySearchTree bst = new BinarySearchTree();
        for (int elem : elements) {
            bst.root = bst.insert(bst.root, elem);
        }
        System.out.print("Travessia em ordem: ");
        bst.inOrder(bst.root);
        System.out.println("\nEstrutura da BST:");
        bst.display(bst.root, "", true);

        // Árvore AVL (Auto-balanceada)
        System.out.println("\n=== Árvore AVL (Auto-balanceada) ===");
        AVLTree avl = new AVLTree();
        for (int elem : elements) {
            avl.root = avl.insert(avl.root, elem);
        }
        System.out.print("Travessia em ordem: ");
        avl.inOrder(avl.root);
        System.out.println("\nEstrutura da AVL:");
        avl.display(avl.root, "", true);
    }
}
