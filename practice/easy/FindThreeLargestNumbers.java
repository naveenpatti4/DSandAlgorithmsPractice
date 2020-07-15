package DSandAlgorithmsPractice.practice.easy;

import java.util.Arrays;

public class FindThreeLargestNumbers {

    //Dumb answer
    public static int[] findThreeLargestNumbersdumb(int[] array) {
        Arrays.sort(array);
        if (array.length < 3 ) return null;

        int[] newArr = new int[3];
        System.out.println(array.length);
        System.out.println(array[array.length-1]);

        newArr[0] = array[array.length-3];
        newArr[1] = array[array.length-2];
        newArr[2] = array[array.length-1];


        return newArr;
    }

//{"array": [55, 7, 8]}
    public static int[] findThreeLargestNumbers(int[] array) {
        int[] threeLargest = {Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};
        for(int num : array){
            updateLargest(threeLargest, num);
        }
        return threeLargest;
    }

    public static void updateLargest(int[] threeLargest,int num){
        if(num > threeLargest[2]){
            shiftAndUpdate(threeLargest, num, 2);
        }else if(num > threeLargest[1]){
            shiftAndUpdate(threeLargest, num, 1);
        }else if(num > threeLargest[0]){
            shiftAndUpdate(threeLargest, num, 0);
        }
    }

    public static void shiftAndUpdate(int[] array, int num, int idx){
        for(int i = 0; i<= idx; i++){
            if(i == idx){
                array[i] = num;
            } else {
                array[i] = array[i +1];
            }
        }
    }
}
