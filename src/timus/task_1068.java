package timus;
//Всё, что от вас требуется — найти сумму всех целых чисел, лежащих между 1 и N включительно.
//        Исходные данные
//        В единственной строке расположено число N, по модулю не превосходящее 10000.
//        Результат
//        Выведите целое число — ответ задачи.
import java.util.Scanner;

public class task_1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int Summ = 0;
        if (n < 1) {
            for (int i = n; i <= 1; i++) {
                Summ += i;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                Summ += i;
            }
        }
        System.out.println(Summ);
    }
}
