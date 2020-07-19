package DSandAlgorithmsPractice.practice.medium;

public class IsMonotonic {
    public static void main(String[] args) {
        int[] testArray = {-1,-2,-3,-5,-20};
        System.out.println(isDecreasing(testArray));
    }

    public static boolean isMonotonic(int[] array) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1])
                increasing = false;
            if (array[i] < array[i - 1])
                decreasing = false;
        }

        return increasing || decreasing;
    }

    public static boolean isDecreasing(int[] array) {
        boolean decreasing = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1])
                decreasing = true;
        }

        return decreasing;
    }
}
