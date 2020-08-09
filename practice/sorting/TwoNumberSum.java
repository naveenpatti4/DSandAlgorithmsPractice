package DSandAlgorithmsPractice.practice.sorting;

import java.util.Arrays;

public class TwoNumberSum {
   //Time=O(n)|| Space = O(1)

   public static void main(String[] args) {
      int[] array2 = new int[]{2,7,11,15};
      System.out.println(twoNumSum3(array2,9));
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
}
