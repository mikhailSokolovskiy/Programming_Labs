package lr11;

import java.util.Arrays;

public class Example2 {
    //    Напишите функцию, которая принимает на вход два массива целых
    //    чисел и возвращает новый массив, содержащий только те элементы, которые
    //    есть в обоих массивах.
    public static int[] getCommonElements(int[] nums1, int[] nums2) {
        return Arrays.stream(nums1)
                .filter(num -> Arrays.stream(nums2).anyMatch(n -> n == num))
                .distinct()
                .toArray();
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        int[] resultArray = getCommonElements(array1, array2);

        System.out.print("Общие элементы: ");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }
}
