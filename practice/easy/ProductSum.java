package DSandAlgorithmsPractice.practice.easy;

import java.util.ArrayList;
import java.util.List;

// sample input {"array": [5, 2, [7, -1], 3, [6, [-13, 8], 4]]}

// sample output = 12

public class ProductSum {

    public static int productSum(List<Object> array) {
        return productSumR(array, 1);
    }

    private static int productSumR(List<Object> array, int mul){
        int sum = 0;
        for(Object elem : array){
            if(elem instanceof ArrayList){
                ArrayList<Object> ls = (ArrayList<Object>) elem;
                sum = sum + productSumR(ls, mul + 1);
            } else{
                sum = sum + (int) elem;
            }
        }

        return sum * mul;
    }
}
