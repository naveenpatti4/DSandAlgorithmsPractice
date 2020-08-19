package DSandAlgorithmsPractice.Recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets {

   public static void main(String[] args) {
      int[] array2 = new int[]{1,3,2};
      List<List<Integer>> res = subsets(array2);
      System.out.println("res :: --> " + res);

   }

   // subsets without duplicates
   public static List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> res = new LinkedList<>();

      helper(nums, 0, new ArrayList<>(), res);

      return res;

   }

   private static void helper(int[] nums, int idx, List<Integer> slate, List<List<Integer>> res){

      //base case
      if(idx == nums.length){
         res.add(new ArrayList<>(slate));
         return;
      } else{
         //exclude the element
         helper(nums, idx+1, slate, res);

         //include the element
         slate.add(nums[idx]);
         helper(nums, idx+1, slate, res);
         slate.remove(slate.size() -1);

      }

   }
}
