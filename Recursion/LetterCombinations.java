package DSandAlgorithmsPractice.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

   public static void main(String[] args) {
      String s = "23";

      List<String> ls = letterCombinations(s);
      System.out.println("res :: " + ls);
      //ls.stream().forEach(System.out::println);
   }


   public static List<String> letterCombinations(String digits) {

      List<String> res = new ArrayList<>();

      Map<Character, String> keyMap = new HashMap<>();

      StringBuilder slate =  new StringBuilder();

      keyMap.put('2', "abc");
      keyMap.put('3', "def");
      keyMap.put('4', "ghi");
      keyMap.put('5', "jkl");
      keyMap.put('6', "mno");
      keyMap.put('7', "pqrs");
      keyMap.put('8', "tuv");
      keyMap.put('9', "wxyz");
      lcHelper(0,digits,keyMap, slate, res);
      return res;
   }

   private static void lcHelper(int idx, String digits,  Map<Character, String> keyMap, StringBuilder slate, List<String> res){
      if (idx == digits.length()){
         res.add(slate.toString());
         return;
      } else{
         String keyVal = keyMap.get(digits.charAt(idx));
         for (int i = 0; i<keyVal.length(); i++){
            slate.append(keyVal.charAt(i));
            lcHelper(idx +1, digits, keyMap, slate, res);
            slate.deleteCharAt(slate.length()-1);
         }

      }

   }
}
