package DSandAlgorithmsPractice.Recursion;



public class ReverseString{
    public static void main(String[] args) {
        System.out.println(reverseStringRecursive("neevaN"));
    }

    public static String reverseStringRecursive(String str){
        if (str == ""){
            return null;
        }else {
            return reverseStringRecursive(str.substring(1)) + str.charAt(0);
        }
    }


}
