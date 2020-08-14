package DSandAlgorithmsPractice.practice.sorting;

import java.util.Arrays;

public class DutchNationalFlag {
   public static void main(String[] args) {
      char[] chars = {'R','B','G','G','R','B','G'};
      char[] result = dutchNational(chars);
      Arrays.stream(new char[][]{result}).forEach(System.out::println);
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
}
