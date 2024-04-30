package lr11;

import java.util.Arrays;

public class Example1 {
    //    Напишите функцию, которая принимает на вход массив целых чисел и
    //    возвращает новый массив, содержащий только четные числа из исходного
    //    массива.
    public static int[] getEvenNumbers(int[] nums) {
        return Arrays.stream(nums)
                .filter(num -> num % 2 == 0)
                .toArray();
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resultArray = getEvenNumbers(inputArray);

        System.out.print("Четные числа из исходного массива: ");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }
}
