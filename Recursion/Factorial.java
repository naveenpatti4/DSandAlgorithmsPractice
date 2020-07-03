package DSandAlgorithmsPractice.Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(2));
        System.out.println(factorialIteration(2));

    }

    //recursion
    public static int factorial(int x){
        if (x == 1 || x== 2) return x;
        else {
            return x * factorial(x - 1);
        }
    }

    //iteration
    public static int factorialIteration(int x){
        int i1 =1;
        if (x == 1 || x== 2) return x;
        else {
            for (int i = 2; i<= x; i++){
               i1 = i1 * i;
            }

        }

        return i1;
    }
}
