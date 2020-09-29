package DSandAlgorithmsPractice.practice.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MergeKSortedArrays {

   public static void main(String[] args) {
      int[][] array2 = new int[][]{
              {1000, 50, 15},
              {100, 20, 2},
              {10, 9, 6, 5, 1}};
      //[[0, 30],[5, 10],[15, 20]]
      Arrays.stream(mergeKSortedArrays(array2)).forEach(System.out::println);
   }

   //merge K sorter preserving order i.e increasing or decreasing
   private static int[] mergeKSortedArrays(int[][] array) {
      int size = 0;
      PriorityQueue<Integer> pq;
      boolean asc = true;
      int m = array.length-1;
      int n = array[0].length-1;
      for(int i=0;i<=m;i++){
         if(array[i][n] < array[i][0]){
            asc = false;
         }
      }
      if (asc){
         pq = new PriorityQueue();
      } else{
         pq = new PriorityQueue<>(Collections.reverseOrder());
      }

      for (int row = 0; row < array.length; row++) {
         for (int col = 0; col < array[row].length; col++) {
            pq.offer(array[row][col]);
            size++;
         }
      }

      int[] newSortedArray = new int[size];
      int res = 0;
      while (!pq.isEmpty()) {
        newSortedArray[res++] = pq.poll();
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
