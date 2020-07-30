package DSandAlgorithmsPractice.practice.medium;

public class MaxSubsetSumNoAdjacent {
    //Time = o(n) || space = 0(1)
    public static int maxSubsetSumNoAdjacent(int[] array) {
        if(array.length == 0) return 0;
        if(array.length == 1) return array[0];
        int second = array[0];
        int first = Math.max(array[0], array[1]);
        for(int i =2; i < array.length; i++){
            int current = Math.max(first, second + array[i]);
            second = first;
            first = current;
        }
        return first;
    }

}
