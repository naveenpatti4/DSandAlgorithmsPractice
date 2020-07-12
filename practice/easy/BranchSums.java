package DSandAlgorithmsPractice.practice.easy;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> sums = new ArrayList<Integer>();
        calculateBranchSums(root,0,sums);
        return sums;
    }

    public static void calculateBranchSums(BinaryTree node, int runSum, List<Integer> sums){
        if(node == null) {
            return;
        }

        int newRunSum = runSum + node.value;

        if(node.left == null && node.right == null){
            sums.add(newRunSum);
            return;
        }

        calculateBranchSums(node.left, newRunSum, sums);

        calculateBranchSums(node.right, newRunSum, sums);

    }
}
