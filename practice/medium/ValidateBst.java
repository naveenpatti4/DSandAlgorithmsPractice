package DSandAlgorithmsPractice.practice.medium;

public class ValidateBst {
    public static boolean validateBst(BST tree) {

        return validateBstHelper(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean validateBstHelper(BST tree, int minVal, int maxVal){
        if(tree.value < minVal || tree.value >= maxVal){
            return false;
        }

        if(tree.left != null && !validateBstHelper(tree.left, minVal, tree.value )){
            return false;
        }

        if(tree.right != null && !validateBstHelper(tree.right, tree.value, maxVal )){
            return false;
        }

        return true;
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
