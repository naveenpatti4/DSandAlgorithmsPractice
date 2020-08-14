package DSandAlgorithmsPractice.practice.sorting;

import java.util.Arrays;

public class DutchNationalFlag {
   public static void main(String[] args) {
//      char[] chars = {'R','B','G','G','R','B','G'};
//      char[] result = dutchNational(chars);
//      Arrays.stream(new char[][]{result}).forEach(System.out::println);

      int[] nums = {2,0,2,1,1,0, 0, 2, 1, 0, 0 ,0 ,2, 0, 1};
      int[] res = sortColors(nums);
      Arrays.stream(res).forEach(System.out::println);
   }

   private static char[] dutchNational(char[] chars) {
      int i = 0;
      int lPtr = 0;
      int rPtr = chars.length -1;
      while (i <= rPtr){
         if (chars[i] == 'R'){
            swap(chars, lPtr, i);
            lPtr++; i++;
         } else if (chars[i] == 'B'){
            swap(chars, rPtr, i);
            rPtr--;
         } else if (chars[i] == 'G'){
            i++;
         }
      }
      return chars;

   }

   private static void swap(char[] chars, int i, int j){
      char temp = chars[j];
      chars[j] = chars[i];
      chars[i] = temp;
   }


   public static int[] sortColors(int[] nums) {

      int i = 0;
      int lP = 0;
      int rP = nums.length-1;

      while( i <= rP ){
         if(nums[i] == 0) {
            swap(nums, lP, i);
            i++; lP ++;
         } else if(nums[i] == 2){
            swap(nums, rP, i);
            rP --;
         } else if(nums[i] == 1){
            i++;
         }
      }

      return nums;

   }

   private static void swap(int[] nums, int i , int j){
      int temp = nums[j];
      nums[j] = nums[i];
      nums[i] = temp;
   }

}
