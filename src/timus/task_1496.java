package timus;
//Среди наших знакомых есть известный спамер. В конце каждого контеста он сабмитит свои неправильные решения со скоростью пулемёта. Кроме того, он ещё и ведёт нечестную игру, всегда используя по несколько отладочных аккаунтов. Жюри наконец-то решило дисквалифицировать спамера. Для этого они сначала хотят определить все его отладочные аккаунты. Известно, какие команды сабмитили свои решения в последние 10 минут контеста. Ваша задача — найти все отладочные аккаунты спамера. Жюри считает аккаунтами спамера всех, кто сабмитил решения больше одного раза в последние 10 минут.
//Исходные данные
//В первой строке записано число N — количество сабмитов в последние 10 минут (0 ≤ N ≤ 100). Следующие N строк содержат названия команд, сабмитивших решения. Названия состоят только из строчных латинских букв и цифр. Длина названий не превосходит 30 символов.
//Результат
//Выведите все аккаунты, под которыми, по мнению жюри, играет спамер. Порядок вывода не важен.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class task_1496 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<String> list = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            list.add(scanner.next());
        }
        Collections.sort(list);
        for (int i = 0; i < N - 1; ) {
            String comp = list.get(i);
            int kolCompEl = 0;
            for (int i1 = i; i1 < N; i1++) {
                if (list.get(i1).equals(comp)) {
                    i++;
                    kolCompEl++;
                }
            }
            if (kolCompEl > 1) {
                System.out.println(comp);
            }
        }
    }
}
