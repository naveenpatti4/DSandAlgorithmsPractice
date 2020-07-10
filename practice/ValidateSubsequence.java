package DSandAlgorithmsPractice.practice;

import java.util.ArrayList;
import java.util.List;

public class ValidateSubsequence {
    public static void main(String[] args) {

    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int ai = 0;
        int si = 0;
        while(ai < array.size() && si < sequence.size()){
            if(array.get(ai) == sequence.get(si)){
                si ++;
            }
            ai++;
        }

        if(si == sequence.size()){
            return true;
        }

        return false;
    }

    public static boolean isValidSubsequence2(List<Integer> array, List<Integer> sequence) {
        int si = 0;
        for(Integer ai : array){
            if(si == sequence.size()){
                break;
            }

            if(sequence.get(si) == ai ){
                si ++;
            }

        }
        return si == sequence.size();
    }
}
