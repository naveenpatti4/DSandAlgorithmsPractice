package DSandAlgorithmsPractice.practice.sorting;

import java.util.Arrays;

public class QuickSort {
   public static void main(String[] args) {
      // int[] array2 = new int[]{6,10,3,-4,1, -6, 9};
      int[] array2 = new int[]{8, 5, 2, 9, 5, 6, 3};

      int[] nums = quickSort(array2);
      Arrays.stream(nums).forEach(System.out::println);
   }

   public static int[] quickSort(int[] array) {
      quickSortHelper(array, 0, array.length - 1);
      return array;
   }

   private static void quickSortHelper(int[] array, int start, int end) {
      if (start >= end) return;
      int randIdx = (int) (Math.random() * (end - start + 1) + start);
      swap(array, randIdx, start);
      int pivot = array[start];
      int orange = start;

      for (int green = start + 1; green < end + 1; green++) {
         if (array[green] <= pivot) {
            orange++;
            swap(array, orange, green);
         }
      }
      swap(array, start, orange);
      quickSortHelper(array, start, orange - 1);
      quickSortHelper(array, orange + 1, end);
   }


   private static void swap(int[] array, int i, int j) {
      int temp = array[j];
      array[j] = array[i];
      array[i] = temp;
   }
}
