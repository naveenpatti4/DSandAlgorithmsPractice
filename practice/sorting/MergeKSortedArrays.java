package DSandAlgorithmsPractice.practice.sorting;

import java.util.PriorityQueue;

public class MergeKSortedArrays {

   public static void main(String[] args) {
      int[][] array2 = new int[][]{{0,5,15},{30,10,20}};
      //[[0, 30],[5, 10],[15, 20]]
      System.out.println(mergeKSortedArrays(array2));
   }

   private static int[] mergeKSortedArrays(int[][] array) {
      int[] newSortedArray = new int[Integer.MAX_VALUE];
      PriorityQueue<int[][]> priorityQueue = new PriorityQueue();
      while (!priorityQueue.isEmpty()){

      }

      return newSortedArray;
   }


   // ax2 + bx+ c leetcode :  360
   public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
      int n = nums.length;
      for (int i = 0; i < n; i++) {
         nums[i] = nums[i] * nums[i] * a + nums[i] * b + c;
      }

      int[] res = new int[n];
      int i = 0, j = n - 1;
      if (a >= 0) {
         int index = n - 1;
         while (index >= 0) {
            if (nums[i] >= nums[j]) {
               res[index--] = nums[i++];
            } else {
               res[index--] = nums[j--];
            }
         }
      } else {
         int index = 0;
         while (index <= n - 1) {
            if (nums[i] >= nums[j]) {
               res[index++] = nums[j--];
            } else {
               res[index++] = nums[i++];
            }
         }


      }
      return res;
   }

}
