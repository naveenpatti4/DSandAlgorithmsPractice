import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {

        mergeArrays2(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 55, 68)), new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6)));

    }

    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> a1, ArrayList<Integer> a2){
        ArrayList<Integer> mergeArray = new ArrayList<>();

        for (int i=0; i<a1.size(); i++){
            mergeArray.add(a1.get(i));
        }

        for (int j=0; j<a2.size(); j++ ){
            mergeArray.add(a2.get(j));
        }

        Collections.sort(mergeArray);
        System.out.println(mergeArray);
        return mergeArray;
    }

    public static ArrayList<Integer> mergeArrays2(ArrayList<Integer> a1, ArrayList<Integer> a2){
        ArrayList<Integer> mergeArray = new ArrayList<>();
        if (a1.size() == 0){
            return a2;
        }

        if (a2.size() == 0){
            return a1;
        }
        mergeArray.addAll(a1);
        mergeArray.addAll(a2);
        Collections.sort(mergeArray);
        System.out.println(mergeArray);
        return mergeArray;
    }

}
