package DSandAlgorithmsPractice.practice.easy;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        int currentIdx = 0;
        while(currentIdx < array.length -1){
            int smallIdx = currentIdx;
            for(int i = currentIdx+1; i < array.length; i ++ ){
                if(array[smallIdx] > array[i]){
                    smallIdx= i;
                }
            }
            swap(currentIdx, smallIdx, array);
            currentIdx ++;
        }
        return array;
    }

    private static void swap(int i, int j, int[] array){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
