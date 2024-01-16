package timus;

import java.util.Scanner;

//Определение 1. n!!…! = n(n−k)(n−2k)…(n mod k), если n не делится на k; n!!…! = n(n−k)(n−2k)…k, если n делится на k (знаков ! в обоих случаях k штук).
//Определение 2. X mod Y — остаток от деления X на Y.
//Например, 10 mod 3 = 1; 3! = 3·2·1; 10!!! = 10·7·4·1.
//Мы по заданным n и k смогли вычислить значение выражения из определения 1. А вам слабо?
//Исходные данные
//В единственной строке сначала дано целое число n, 1 ≤ n ≤ 10, затем ровно один пробел, затем k восклицательных знаков, 1 ≤ k ≤ 20.
//Результат
//Выведите одно число — n!!…!
public class task_1083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int k = s.length();
        System.out.println(fact(n, k));
    }

    public static long fact(int n, int k) {
        long fact = 0, ans = 1;
        int i = 0;
        for (; n - i * k > 0; i++) {
            ans *= n - i * k;
        }
        return ans;
    }
}
