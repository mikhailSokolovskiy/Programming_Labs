package timus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Задача
//        Вам надо написать программу, которая определяет по заданному разбиению избирателей на группы минимальное количество сторонников партии, достаточное, при некотором распределении их по группам, для принятия любого решения.
//        Исходные данные
//        В первой строке записано нечётное число K — количество групп избирателей (1 ≤ K ≤ 101). Во второй строке через пробел записаны K нечётных чисел, которые задают количество избирателей в группах. Население острова не превосходит 9999 человек.
//        Результат
//        Выведите минимальное количество сторонников партии, способное решить исход голосования.
public class task_1025 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, n05, Ans = 0;
        n = input.nextInt();
        ArrayList<Integer> groups = new ArrayList<>(n);
        n05 = n / 2 + 1;
        for (int i = 0; i < n; i++) {
            groups.add(input.nextInt());
        }
        for (int i = 0; i < n05; i++) {
            Ans += Collections.min(groups) / 2 + 1;
            groups.remove(Collections.min(groups));
        }
        System.out.println(Ans);
    }
}
