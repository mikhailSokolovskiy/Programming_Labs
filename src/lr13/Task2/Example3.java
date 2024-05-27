package lr13.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите размер массива:");
            int size = scanner.nextInt();
            byte[] array = new byte[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextByte();
            }

            int sum = 0;
            for (byte el : array) sum += el;

            System.out.println("Сумма элементов массива = " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число или число вне диапазона типа byte.");
        }
    }
}
