package DSandAlgorithmsPractice.practice.Trees;

import java.util.*;

public class TreeLevelTraversal {

   //Binary Tree level Traversal
   //N- ary Tree Level Traversal

   public static List<List<Integer>> treeLevelTraversal(TreeNode root){

      List<List<Integer>> res = new ArrayList<>();

      List<Integer> result = new ArrayList<>();
      return bfsTLT(root, res);

   }


   private static List<List<Integer>> bfsTLT(TreeNode root, List<List<Integer>> res){
      if (root == null){
         return res;
      }

      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);

      while(!queue.isEmpty()){
         int numNodes = queue.size();
         List<Integer> temp = new ArrayList<>();
         for (int i = 0; i< numNodes; i++){
            TreeNode node = queue.poll();
            temp.add(node.value);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
         }
         res.add(temp);
      }
      return res;
   }

   //tree traversal reverse
   private  List<List<Integer>> bfs(TreeNode root,  List<List<Integer>> result){
      if(root == null) return result;

      Queue<TreeNode> queue = new LinkedList<>();

      queue.add(root);

      while(!queue.isEmpty()){
         int numNodes = queue.size();
         List<Integer> temp = new ArrayList<>();

         for(int i=0; i<numNodes; i++){
            TreeNode node = queue.poll();
            temp.add(node.value);

            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
         }

         result.add(temp);
      }
      Collections.reverse(result);
      return result;
   }


   class TreeNode {
      int value;
      TreeNode left;
      TreeNode right;

      TreeNode(int value) {
         this.value = value;
         right = null;
         left = null;
      }
   }
}
