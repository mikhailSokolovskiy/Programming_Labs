package lr12;

import java.util.Arrays;

public class Example6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumArray(arr);
        System.out.println("Сумма элементов массива: " + sum);
    }

    public static int sumArray(int[] arr) {
        return Arrays.stream(arr).parallel().sum();
    }
}
