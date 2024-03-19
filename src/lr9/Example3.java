package lr9;

import java.util.Scanner;

public class Example3 {
    // Метод для ввода элементов массива
    static void inputArray(int[] arr, int index, Scanner scanner) {
        if (index < arr.length) {
            System.out.print("Введите элемент массива с индексом " + index + ": ");
            arr[index] = scanner.nextInt();
            inputArray(arr, index + 1, scanner);
        }
    }

    // Метод для вывода элементов массива
    static void outputArray(int[] arr, int index) {
        if (index < arr.length) {
            System.out.println("Элемент массива с индексом " + index + ": " + arr[index]);
            outputArray(arr, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();

        int[] array = new int[size];

        // Ввод массива
        inputArray(array, 0, in);

        System.out.println("Введенный массив:");
        // Вывод массива
        outputArray(array, 0);

        in.close();
    }
}
