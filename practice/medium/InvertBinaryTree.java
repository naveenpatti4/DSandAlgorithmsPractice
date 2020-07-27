package DSandAlgorithmsPractice.practice.medium;

public class InvertBinaryTree {
    public static void invertBinaryTree(BinaryTree tree) {
        if(tree == null){
            return;
        }
        swapNodes(tree);
        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }

    public static void swapNodes(BinaryTree tree){
        BinaryTree tempNode = tree.left;
        tree.left = tree.right;
        tree.right = tempNode;
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
