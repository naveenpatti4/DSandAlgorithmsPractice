package DSandAlgorithmsPractice.practice;

import java.util.Arrays;

public class TwoNumSum {

    public static void main(String[] args) {
        int[] array = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;

        System.out.println(twoNumberSum2(array,targetSum));

    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int[] arr = new int[2];
        for(int i=0; i< array.length; i++){
            for(int j=1; j< array.length; j++){
                if((array[i] + array[j]) == targetSum && i != j){
                    arr[0] = array[i];
                    arr[1] = array[j];
                    return arr;
                }
            }

        }
        return new int[0];
    }

    public static int[] twoNumberSum2(int[] array, int targetSum) {
        Arrays.sort(array);
        int[] arr = new int[2];
        int i = 0;
        int j = array.length - 1;
        while(i < j){
            int temp = array[i]+ array[j];
            if(temp == targetSum){
                arr[0] = array[i];
                arr[1] = array[j];
                return arr;
            } else if(temp > targetSum){
                j--;
            } else if(temp < targetSum){
                i++;
            }
        }
        return new int[0];
    }
}
