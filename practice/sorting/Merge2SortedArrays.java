package DSandAlgorithmsPractice.practice.sorting;

import java.util.Arrays;

//Merge Two Sorted Arrays

public class Merge2SortedArrays {

   public static void main(String[] args) {
      int[] arr1 = {1, 3, 4, 5};
      int[] arr2 = {2, 4, 6, 8};
      int[] strings = mergeSortedArrays(arr1, arr2);
      Arrays.stream(strings).forEach(System.out::println);
   }

   //O(n) time
   public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {

      int[] mergedArray = new int[arr1.length + arr2.length];
      int first = 0, second = 0, mergedArrayLength = 0;
      while (first < arr1.length && second < arr2.length) {
         if (arr1[first] < arr2[second]) {
            mergedArray[mergedArrayLength] = arr1[first];
            first++;
         } else {
            mergedArray[mergedArrayLength] = arr2[second];
            second++;
         }
         mergedArrayLength++;
      }

      while (first < arr1.length) {
         mergedArray[mergedArrayLength] = arr1[first];
         first++;
         mergedArrayLength++;
      }

      while (second < arr2.length) {
         mergedArray[mergedArrayLength] = arr2[second];
         second++;
         mergedArrayLength++;
      }

      return mergedArray;
   }




}

