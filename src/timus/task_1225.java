package timus;

import java.util.Scanner;

//В День флага России владелец магазина решил украсить свою витрину полосками ткани белого, синего и красного цветов. Он хочет, чтобы выполнялись следующие условия:
//Полоски одного цвета не должны располагаться рядом друг с другом.
//Синяя полоска может быть расположена только между белой и красной или между красной и белой.
//Определите количество способов выполнить желание владельца магазина.
//Например, для N = 3 возможны следующие варианты:
//Problem illustration
//Исходные данные
//N — количество полосок, 1 ≤ N ≤ 45.
//Результат
//M — количество способов украсить витрину.
public class task_1225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long elPP, elP, el;
        elP = el = 2;
        int N;
        N = scanner.nextInt();
        if (N <= 2) {
            System.out.println(2);
            return;
        }
        for (int i = 3; i <= N; i++) {
            elPP = elP;
            elP = el;
            el = elPP + elP;
        }
        System.out.println(el);
    }
}
