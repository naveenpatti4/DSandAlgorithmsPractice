package DSandAlgorithmsPractice.practice.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
   //Time=O(n)|| Space = O(1)

   public static void main(String[] args) {
      int[] array2 = new int[]{2,7,11,15};
      System.out.println(twoNumSum3(array2,9));
      int[] array = new int[]{3, 5, -4, 8, 11, 1, -1, 6};

      int[] res = checkSum2(array, 10);
      Arrays.stream(res).forEach(System.out::println);
   }
   //if array is Sorted
   public static boolean twoNumSum3(int[] array, int targetSum){
      return checkSum(array, targetSum);
   }

   //Time=O(n)|| Space = O(1)
   //if array is Not Sorted Sorted
   public static boolean twoNumSum4(int[] array, int targetSum){
      Arrays.sort(array);
      return checkSum(array, targetSum);
   }

   private static boolean checkSum(int[] array, int targetSum) {
      int left = 0;
      int right = array.length -1;
      while( left < right ){
         int currentSum = array[left] + array[right];
         if ( targetSum == currentSum ) return true;
         else if ( currentSum > targetSum ) right --;
         else if ( currentSum < targetSum ) left ++;
      }
      return false;
   }


   private static int[] checkSum2(int[] array, int target){
      Set<Integer> nums = new HashSet<>();

      for (int num : array){
         int tempSum = target - num;
         if (nums.contains(tempSum)) return new int[] {num, tempSum};
         else nums.add(num);
      }

      return new int[0];
   }
}
