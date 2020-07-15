package DSandAlgorithmsPractice.practice.easy;

public class BinarySearch {

    //Naive approach with o(n) time complexity
    public static int arraySearch(int[] array, int target) {
        for(int i = 0; i < array.length; i++ ){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }


    //recursive approach with O(log n) time and space
    public static int binarySearch(int[] array, int target) {

        return binarySearchHelper(array, 0, array.length-1, target);
    }


    private static int binarySearchHelper(int[] array,int firstIdx, int lastIdx, int target){

        if(firstIdx > lastIdx) return -1;

        int mid = (firstIdx + lastIdx)/2 ;

        if(target == array[mid]) {
            return mid;
        } else if(target < array[mid]){
            return binarySearchHelper(array, firstIdx, mid - 1, target);
        } else {
            return binarySearchHelper(array, mid +1 , lastIdx, target);
        }


    }


    //Iterative approach with o(log n ) time and o(1) space
    public static int binarySearchIterative(int[] array, int target) {

        return binarySearchIterative(array, 0, array.length-1, target);
    }


    private static int binarySearchIterative(int[] array,int firstIdx, int lastIdx, int target){
        while(firstIdx <= lastIdx){
            int mid = (firstIdx + lastIdx)/2;
            if(target == array[mid]){
                return mid;
            } else if( target < array[mid]){
                lastIdx = mid -1 ;
            } else{
                firstIdx = mid + 1;
            }
        }

        return -1;
    }

}
