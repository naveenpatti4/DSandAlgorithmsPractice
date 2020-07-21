package DSandAlgorithmsPractice.practice.medium;

public class LongestPalindromicSubstring {

    public static String longestPalindromicSubstring(String str) {
        String longestPalindrome = "";
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                String subStr = str.substring(i, j+1);
                if(subStr.length() > longestPalindrome.length() && isPalindrome(subStr)){
                    longestPalindrome = subStr;
                }
            }
        }
        return longestPalindrome;
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }

        return true;
    }
}
