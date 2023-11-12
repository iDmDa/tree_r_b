public class Main {
    public static void main(String[] args) {
        RedBlackTree rbTree = new RedBlackTree();

        rbTree.insert(8);
        rbTree.insert(18);
        rbTree.insert(5);
        rbTree.insert(15);
        rbTree.insert(16);
        rbTree.insert(25);
        rbTree.insert(40);
        rbTree.insert(80);
        rbTree.insert(71);

        // Вывод дерева
        rbTree.printTree(rbTree.root, "", true);
    }
}
