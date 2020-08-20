package DSandAlgorithmsPractice.Recursion;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Subsets {

   public static void main(String[] args) {
      int[] array2 = new int[]{1,3,2};
//      List<List<Integer>> res = subsets(array2);
//      System.out.println("res :: --> " + res);

      String[] op = generate_all_subsets("xy");
      Arrays.stream(op).forEach(System.out::println);

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

   static String[] generate_all_subsets(String s) {

      List<String> strings = new ArrayList<>();

      strHelper(s, 0, new StringBuilder(),strings);

      return strings.toArray(new String[0]);
   }


   private static void strHelper(String s, int idx, StringBuilder slate,  List<String> strings ){

      //base case
      if (idx == s.length()){
         strings.add(slate.toString());
         return;
      }
      //recursive case
      else{
         //exclude
         strHelper(s, idx+1, slate, strings);

         //include
         slate.append(s.charAt(idx));
         strHelper(s, idx+1, slate, strings);
         slate.deleteCharAt(slate.length()-1);
      }

   }

}
