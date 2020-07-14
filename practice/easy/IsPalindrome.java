package DSandAlgorithmsPractice.practice.easy;

public class IsPalindrome {
    //Naive O(n^2) | O(n) space
    public static boolean isPalindrome(String str) {
        String rStr = "";
        for(int i = str.length()-1; i >= 0; i --){
            rStr = rStr + str.charAt(i);
        }

        if(str.equals(rStr)){
            return true;
        }
        return false;
    }

    //O(n) time | O(1) space
    public static boolean isPalindrome2(String str) {
        int leftIdx = 0;
        int rightIdx = str.length() - 1;
        while(leftIdx < rightIdx){
            if(str.charAt(leftIdx) != str.charAt(rightIdx)){
                return false;
            }
            leftIdx ++;
            rightIdx--;
        }
        return true;
    }


}
