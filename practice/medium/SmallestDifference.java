package DSandAlgorithmsPractice.practice.medium;

import java.util.Arrays;

public class SmallestDifference {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int idxOne = 0;
        int idxTwo = 0;
        int smallest = Integer.MAX_VALUE;
        int current = Integer.MAX_VALUE;
        int[] smallestPair = new int[2];
        while(idxOne < arrayOne.length && idxTwo < arrayTwo.length){
            int firstNum = arrayOne[idxOne];
            int secondNum = arrayTwo[idxTwo];
            if(firstNum < secondNum){
                current = secondNum - firstNum;
                idxOne ++;
            } else if(firstNum > secondNum){
                current = firstNum - secondNum;
                idxTwo++;
            } else{
                return new int[]{firstNum, secondNum};
            }

            if(smallest > current){
                System.out.println(current);
                smallest = current;
                smallestPair = new int[]{firstNum, secondNum};
            }
        }
        return smallestPair;
    }
}
