package timus;
//Эта задача настолько проста, что авторы даже поленились сочинить для нее условие!
//        Исходные данные
//        Входной поток содержит набор целых чисел Ai (0 ≤ Ai ≤ 1018), отделённых друг от друга произвольным количеством пробелов и переводов строк. Размер входного потока не превышает 256 КБ.
//        Результат
//        Для каждого числа Ai, начиная с последнего и заканчивая первым, в отдельной строке вывести его квадратный корень не менее чем с четырьмя знаками после десятичной точки.

import java.util.Scanner;

public class task_1001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] mOut = new double[262144];
        int i = 0;

        while (scanner.hasNextDouble()) {
            double In = scanner.nextDouble();
            mOut[i] = Math.sqrt(In);
            i++;
        }

        for (i--; i >= 0; i--) {
            System.out.printf("%.4f%n", mOut[i]);
        }
    }
}
