package DSandAlgorithmsPractice.Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

   public static void main(String[] args) {
      String s = "12345a";

      List<String> ls = letterCasePermutation(s);
      ls.stream().forEach(System.out::println);
   }

   public static List<String> letterCasePermutation(String S) {

      List<String> res = new ArrayList<>();
      StringBuilder slate = new StringBuilder();

      lcHelper(S, 0, slate, res);

      return res;
   }

   //Mutable
   //Runtime: 2 ms, faster than 83.34% of Java online submissions for Letter Case Permutation
   //Memory Usage: 40.2 MB, less than 80.72% of Java online submissions for Letter Case Permutation.
   private static void lcHelper(String ip, int idx, StringBuilder slate, List<String> res) {

      if (idx == ip.length()) {
         res.add(slate.toString());
         return;
      } else {
         if (Character.isDigit(ip.charAt(idx))) {
            slate.append(Character.toString(ip.charAt(idx)));
            lcHelper(ip, idx + 1, slate, res);
            slate.deleteCharAt(idx);
         } else {
            slate.append(Character.toUpperCase(ip.charAt(idx)));
            lcHelper(ip, idx + 1, slate, res);
            slate.deleteCharAt(idx);

            slate.append(Character.toLowerCase(ip.charAt(idx)));
            lcHelper(ip, idx + 1, slate, res);
            slate.deleteCharAt(idx);
         }

      }
   }


   public static List<String> letterCasePermutationImmutable(String S) {

      List<String> res = new ArrayList<>();

      lcHelper(S, 0, "", res);

      return res;
   }

   //Immutable
   //Runtime: 7 ms, faster than 44.15% of Java online submissions for Letter Case Permutation.
   //Memory Usage: 40.3 MB, less than 71.85% of Java online submissions for Letter Case Permutation.
   private static void lcHelper(String ip, int idx, String slate, List<String> res) {

      if (idx == ip.length()) {
         res.add(slate);
         return;
      } else {
         if (Character.isDigit(ip.charAt(idx))) {

            lcHelper(ip, idx + 1, slate + ip.charAt(idx), res);

         } else {

            lcHelper(ip, idx + 1, slate + Character.toUpperCase(ip.charAt(idx)), res);

            lcHelper(ip, idx + 1, slate + Character.toLowerCase(ip.charAt(idx)), res);
         }

      }
   }


}
