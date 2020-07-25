package DSandAlgorithmsPractice.practice.medium;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static List<List<Integer>> powerset(List<Integer> array) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        for(Integer el : array){
            int len = subsets.size();
            for(int i = 0; i< len; i++){
                List<Integer> currentSubset = new ArrayList<>(subsets.get(i));
                currentSubset.add(el);
                subsets.add(currentSubset);
            }
        }
        return subsets;
    }
}
