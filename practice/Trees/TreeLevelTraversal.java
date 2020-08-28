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

   //average of each level
   private static List<Double> bfsAverage(TreeNode root, List<Double> res){
      if (root == null){
         return res;
      }

      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);

      while(!queue.isEmpty()){
         int numNodes = queue.size();
         double temp = 0;
         for (int i = 0; i< numNodes; i++){
            TreeNode node = queue.poll();
            temp = temp+node.value;
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
         }
         res.add(Double.valueOf(temp/numNodes));
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

//N-Ary Level order traversal
   private  List<List<Integer>> bfs( Node root, List<List<Integer>> result){
      if( root == null ) return result;

      Queue<Node> queue = new ArrayDeque<>();

      queue.add(root);

      while(!queue.isEmpty()){
         int numNodes = queue.size();
         List<Integer> temp = new ArrayList<>();

         for(int i = 0; i<numNodes; i++ ){
            Node node = queue.poll();
            temp.add(node.val);
            for(Node child : node.children){
               queue.add(child);
            }

         }
         result.add(temp);
      }
      return result;
   }


   //right side view of the tree
   public List<Integer> rightSideView(TreeNode root) {

      List<Integer> result = new ArrayList<>();

      return bfsr(root, result);

   }

   public List<Integer> bfsr(TreeNode root, List<Integer> result){
      if(root == null) return result;

      Queue<TreeNode> queue = new ArrayDeque<>();

      queue.add(root);


      while(!queue.isEmpty()){
         int numNodes = queue.size();

         int temp = 0;

         for(int i =0; i< numNodes; i++){
            TreeNode node = queue.poll();
            temp = node.value;

            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);

         }

         result.add(temp);
      }


      return result;
   }


   //Zig zag level order traversal
   public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

      List<List<Integer>> result = new ArrayList<>();

      return bfsz(root, result);
   }


   public List<List<Integer>> bfsz(TreeNode root, List<List<Integer>> result){
      if(root == null) return result;

      Queue<TreeNode> queue = new ArrayDeque();

      queue.add(root);

      boolean rtol = false;

      while(!queue.isEmpty()){
         int numNodes = queue.size();
         List<Integer> temp = new ArrayList<>();

         for(int i =0; i< numNodes; i++){
            TreeNode node = queue.poll();
            temp.add(node.value);

            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);

         }

         if(rtol) Collections.reverse(temp);

         rtol = !rtol;
         result.add(temp);
      }

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

   class Node {
      public int val;
      public List<Node> children;

      public Node() {}

      public Node(int _val) {
         val = _val;
      }

      public Node(int _val, List<Node> _children) {
         val = _val;
         children = _children;
      }
   };
}
