package DSandAlgorithmsPractice.practice.easy;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static int getNthFib(int n) {
        if(n == 2){
            return 1;
        }else if(n ==1){
            return 0;
        }else{
            return getNthFib(n-1) + getNthFib(n-2);
        }

    }


    public static int getNthFib2(int n) {
        Map<Integer, Integer> memoize = new HashMap<Integer, Integer>();
        memoize.put(1,0);
        memoize.put(2,1);
        return getNthFib(n, memoize);
    }

    public static int getNthFib(int n,  Map<Integer, Integer> memoize){
        if(memoize.containsKey(n)){
            return memoize.get(n);
        }else{
            memoize.put(n, getNthFib(n-1, memoize)+ getNthFib(n-2, memoize));
            return memoize.get(n);
        }
    }


    public static int getNthFib3(int n) {
        int[] lastTwo = {0,1};
        int counter = 3;
        while(counter <= n){
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter ++;
        }
        return n >1 ? lastTwo[1] : lastTwo[0];
    }
}
