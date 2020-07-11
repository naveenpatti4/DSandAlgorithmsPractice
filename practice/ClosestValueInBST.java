package DSandAlgorithmsPractice.practice;

public class ClosestValueInBST {

    //recursive style
    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBstHelper(tree, target, tree.value);
    }

    public static int findClosestValueInBstHelper(BST tree, int target, int closest) {
        if (tree == null) {
            return closest;
        }

        //Base condition
        if (Math.abs(target - closest) > Math.abs(target - tree.value)) {
            closest = tree.value;
        }

        //Recursive condition
        if (target < tree.value && tree.left != null) {
            return findClosestValueInBstHelper(tree.left, target, closest);
        } else if (target > tree.value && tree.right != null) {
            return findClosestValueInBstHelper(tree.right, target, closest);
        } else {
            return closest;
        }
    }

    //iterative
    public static int findClosestValueInBstIterative(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBstIterativeHelper(tree, target, tree.value);
    }

    public static int findClosestValueInBstIterativeHelper(BST tree, int target, int closest) {
        BST currentNode = tree;

        //Base condition
        while(currentNode != null){
            if (Math.abs(target - closest) > Math.abs(target - currentNode.value)) {
                closest = currentNode.value;
            }

            //Recursive condition
            if (target < currentNode.value) {
                currentNode = currentNode.left;
            } else if (target > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                break;
            }
        }
        return closest;
    }
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
