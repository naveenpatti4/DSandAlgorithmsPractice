package DSandAlgorithmsPractice.practice.easy;

public class NodeDepths {

    public static int nodeDepths(BinaryTree root) {
        return nodeDepthsRecursive(root, 0);
    }


    private static int nodeDepthsRecursive(BinaryTree root, int depth){
        if(root == null){
            return 0;
        }
        return depth + nodeDepthsRecursive(root.left, depth + 1) + nodeDepthsRecursive(root.right, depth + 1);

    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
