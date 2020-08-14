package DSandAlgorithmsPractice.practice.sorting;

import java.util.Arrays;

//Merge Two Sorted Arrays

public class Merge2SortedArrays {

   public static void main(String[] args) {
//      int[] arr1 = {1, 3, 4, 5};
//      int[] arr2 = {2, 4, 6, 8};
//      int[] strings = mergeSortedArrays(arr1, arr2);
//      Arrays.stream(strings).forEach(System.out::println);

      int[] arr3 = {1, 3, 4, 5};
      int[] arr4 = {2, 4, 6, 8, 0, 0, 0,0};
      int[] arr = mergeSortedArraysInPlace(arr3, arr4);
      Arrays.stream(arr).forEach(System.out::println);
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


   //O(n) time
   public static int[] mergeSortedArraysInPlace(int[] arr1, int[] arr2) {

      int first = arr1.length-1, second = arr1.length-1, mergingArrayLength = arr2.length-1;
      while (first >=0 && second >=0) {
         if (arr1[first] > arr2[second]) {
            arr2[mergingArrayLength] = arr1[first];
            first--; mergingArrayLength--;
         } else {
            arr2[mergingArrayLength] = arr2[second];
            second--; mergingArrayLength--;
         }
      }

      while (first >= 0) {
         arr2[mergingArrayLength] = arr1[first];
         first--;
         mergingArrayLength--;
      }

      while (second >=0 ) {
         arr2[mergingArrayLength] = arr2[second];
         second--;
         mergingArrayLength--;
      }

      return arr2;
   }

   static void merger_first_into_second(int[] arr1, int[] arr2) {
      /*
       * Write your code here.
       */
      int i = arr1.length -1;
      int j = arr1.length -1;
      int k = arr2.length -1;

      while(i >= 0 && j >= 0){
         if(arr1[i] > arr2[j]) arr2[k--] = arr1[i--];
         else arr2[k--] = arr2[j--];
      }

      while(i >= 0){
         arr2[k--] = arr1[i--];
      }

      while(j >= 0) {
         arr2[k--] = arr2[j--];
      }
   }


}

