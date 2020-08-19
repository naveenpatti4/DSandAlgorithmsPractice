package DSandAlgorithmsPractice.Recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutations {

   public static void main(String[] args) {
      int[] array2 = new int[]{1, 2, 3};
      List<List<Integer>> res = permutations(array2);
      System.out.println("res :: --> " + res);

   }

   // subsets without duplicates
   public static List<List<Integer>> permutations(int[] nums) {
      List<List<Integer>> res = new ArrayList<>();

      helper(nums, 0, res);

      return res;

   }

   private static void helper(int[] nums, int idx, List<List<Integer>> res) {

      //base case
      if (idx == nums.length) {
         res.add(convertToList(nums));
         return;
      }
      //recursive case
      else {
         for (int i = idx; i < nums.length; i++) {
            swap(nums, idx, i);
            helper(nums, idx + 1, res);
            swap(nums, idx, i);
         }
      }

   }

   private static void swap(int[] nums, int i, int j) {
      int temp = nums[j];
      nums[j] = nums[i];
      nums[i] = temp;
   }

   private static List<Integer> convertToList(int[] nums) {
      List<Integer> list = new ArrayList<>();
      for (int num : nums) {
         list.add(num);
      }
      return list;
   }
}
