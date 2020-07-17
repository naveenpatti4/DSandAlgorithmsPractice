package DSandAlgorithmsPractice.practice.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    //Naive approach O(n^3)
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> arraySet = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++ ){
                for(int k = j+1; k < array.length; k++ ){
                    if(array[i] + array[j] + array[k] == targetSum){
                        Integer[] arry = {array[i], array[j], array[k]};
                        arraySet.add(arry);
                    }
                }
            }
        }

        return arraySet;
    }

    //Better approach o(n^2) time and O(n) space
    public static List<Integer[]> threeNumberSum2(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> targetList = new ArrayList<>();
        for(int i = 0; i < array.length-2; i ++){
            int left = i +1;
            int right = array.length-1;
            while(left < right ){
                int currentSum = array[i] + array[left] + array[right];
                if(currentSum == targetSum){
                    Integer[] targetSet = {array[i],array[left], array[right]};
                    targetList.add(targetSet);
                    left ++;
                    right --;
                }else if(currentSum > targetSum){
                    right --;
                }else if(currentSum < targetSum){
                    left ++;
                }
            }
        }
        return targetList;
    }
}
