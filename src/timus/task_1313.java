package timus;
//Исходные данные
//В первой строке записано целое число N (1 ≤ N ≤ 100) — количество пикселей на стороне квадратного монитора. Далее идут N строк, в каждой по N целых чисел в пределах от 1 до 100, разделенных пробелом. Это изображение, которое выводит обычная видеокарта (как видно, глубина цветности у нового монитора небольшая, все равно нормальному программисту больше ста цветов и не надо).
//Результат
//На выходе преобразователя должна получиться последовательность для ввода в новый монитор. Пиксели нумеруются от левого верхнего угла, по диагоналям, слева-направо и снизу-вверх. Подробнее объяснять тут долго и неинтересно, посмотрите на пример, дальше сами догадаетесь.
import java.util.Scanner;
import java.util.ArrayList;
public class task_1313 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, Chislo;
        N = input.nextInt();
        ArrayList<Integer> AnsVec = new ArrayList<Integer>(N*N);
        for (int Num = 0; Num < N*N; Num++) {
            Chislo = input.nextInt();
            if (Num/N + Num%N<N-1) {
                int DRaw = Num / N + Num % N;
                int Ans = (1 + DRaw)*DRaw / 2 + Num % N;
                AnsVec.set(Ans, Chislo);
            }
            else {
                int RNum =  N * N - 1 - Num;
                int AftDRaw = RNum / N + RNum % N;
                int Ans = (1 + AftDRaw)*AftDRaw / 2 + RNum % N;
                AnsVec.set(N * N - Ans-1, Chislo);
            }
        }
        for (int i = 0; i < N*N; i++) {
            System.out.print(AnsVec.get(i) + " ");
        }
    }
}
