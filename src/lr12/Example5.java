package lr12;

import java.util.*;

public class Example5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = findMax(arr);
        System.out.println("Максимальное значение: " + max);
    }

    public static int findMax(int[] arr) {
        OptionalInt maxVal = Arrays.stream(arr).parallel().max();
        return maxVal.orElse(Integer.MIN_VALUE);
    }
}
