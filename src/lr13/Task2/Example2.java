package lr13.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Пример матрицы
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        try {
            System.out.println("Введите номер столбца:");
            int column = scanner.nextInt();

            if(column < 0 || column >= matrix[0].length) {
                throw new ArrayIndexOutOfBoundsException("Нет столбца с таким номером.");
            }

            System.out.println("Столбец " + column + ":");
            for (int[] el : matrix) {
                System.out.println(el[column]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
