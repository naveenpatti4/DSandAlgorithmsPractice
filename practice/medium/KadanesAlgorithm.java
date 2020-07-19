package DSandAlgorithmsPractice.practice.medium;

public class KadanesAlgorithm {
    public static int kadanesAlgorithm(int[] array) {
        int tempSum = array[0];
        int maxSum = array[0];
        for(int i = 1; i < array.length; i++){
            int num = array[i];
            tempSum = Math.max(num, tempSum + num);
            maxSum = Math.max(maxSum, tempSum);
        }
        return maxSum;
    }
}
