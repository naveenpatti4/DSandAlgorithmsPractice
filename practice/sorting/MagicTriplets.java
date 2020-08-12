package DSandAlgorithmsPractice.practice.sorting;

import org.w3c.dom.ls.LSOutput;

import java.util.*;


//MagicTriplets are the numbers where sum of three integers is zero
public class MagicTriplets {

   public static void main(String[] args) {
      int[] array2 = new int[]{6,10,3,-4,1, -6, 9};

      String[] strings =  findZeroSum(array2);
      Arrays.stream(strings).forEach(System.out::println);
    //  System.out.println(Arrays.stream(findZeroSum(array2)).forEach(System.out::println);


   }

   static String[] findZeroSum(int[] arr) {
      // Write your code here.
      return findMagicTriplets(arr);
   }

   private static String[] findMagicTriplets(int[] arr){
      List<String> magicTriplets = new ArrayList<>();
      Arrays.sort(arr);
      for(int i = 0; i< arr.length -2 ; i++){

         int ltPtr = i +1;
         int rtPtr = arr.length -1;
         while(ltPtr < rtPtr){
            int currentSum = arr[i] + arr[ltPtr] + arr[rtPtr];
            if(currentSum == 0){
               StringBuilder sb = new StringBuilder();
               sb.append(arr[i]).append(",").append(arr[ltPtr]).append(",").append(arr[rtPtr]);
               if (!magicTriplets.contains(sb.toString()))magicTriplets.add(sb.toString());
               ltPtr ++;
               rtPtr --;
            } else if (currentSum > 0){
               rtPtr --;
            } else if (currentSum < 0){
               ltPtr++;
            }
         }
      }

      return magicTriplets.toArray(new String[0]);
   }
}
