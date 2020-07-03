package DSandAlgorithmsPractice.Recursion;


//problem statement : return the value of item at the given index
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(8));
    }

    //not ideal here because time complexity //0(2^n)
    public static int fibonacciRecursive(int x){
        if (x < 2) return x;
        else return fibonacciRecursive(x-1) + fibonacciRecursive(x-2);
    }

}
