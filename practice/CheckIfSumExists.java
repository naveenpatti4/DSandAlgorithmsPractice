package DSandAlgorithmsPractice.practice;

import java.util.HashSet;
import java.util.Set;

public class CheckIfSumExists {

    //Naive way
    public static boolean checkIfSumExists(int[] array, int sum)
    {

        for( int i = 0; i < array.length; i++)
        {

            for( int j = 1; j < array.length; j++)
            {

                if(array[i] + array[j] == sum && i != j)
                {
                    return true;
                }

            }
        }
        return false;
    }

    public static boolean checkIfSumExists2(int[] array, int sum)
    {
        Set<Integer> map= new HashSet<>(); //Create an Hashset which stores the difference of sum-array[i]

        for(int i = 0; i < array.length; i++) //Loop through the array
        {

            if(map.contains(array[i]) == true) //if the Hashset contains our difference , then return true else add the difference to array
            {
                return true;
            }else{
                map.add(sum - array[i]);
            }

        }

        return false; //return false if no difference
    }

    public static void main(String args[])
    {
        int sum = 8;
        int[] arr1 = {1,2,3,9};
        int[] arr2 = {2,2,2,4};
        //calling Naive function
        System.out.println(checkIfSumExists(arr2,sum)); // Time complexity O(n^2) space complexity O(1)

        //Calling efficient function
        System.out.println(checkIfSumExists2(arr2, sum)); // Time complexity O(n) space complexity O(n)

    }
}
