package DSandAlgorithmsPractice.practice.sorting;

import java.util.HashSet;
import java.util.Set;

public class InterSectionOfTwoSortedArrays {

   public static void main(String[] args) {
      int[] array1 = new int[]{2,7,11,11,15};
      int[] array2 = new int[]{2,9,11,11, 23};
      System.out.println(interSectionOfTwoSortedArrays(array1, array2));
      System.out.println(interSectionOfTwoSortedArrays1(array1, array2));
   }

   private static Set<Integer> interSectionOfTwoSortedArrays(int[] A1, int[] A2){
     Set<Integer> res = new HashSet<>();

      for (int i = 0; i < A1.length -1 ; i++){
         for (int j = 0; j < A2.length -1 ; j++){
               if ( A1[i] == A2[j] ) res.add(A1[i]);
         }
      }
      return res;
   }

   private static Set<Integer> interSectionOfTwoSortedArrays1(int[] A1, int[] A2){
      Set<Integer> res = new HashSet<>();
      int i = 0;
      int j = 0;

      while (i < A1.length && j < A2.length) {
         if ( A1[i] == A2[j] ) {
            res.add(A1[i]);
            i++;
            j++;
         }
         else if ( A1[i] > A2[j] ) j++;
         else i++;
      }
      return res;
   }
}
