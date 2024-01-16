package timus;
//Программист Денис c детства мечтал побывать в Антарктиде, но почему-то регулярных рейсов туда нет. Поэтому Денис все лето изучал Антарктиду с помощью соседнего кинотеатра. Теперь он знает, что в Антарктиде водится несколько видов пингвинов:
//Императорские пингвины (Emperor Penguins) — любители петь;
//Малые пингвины (Little Penguins) — любители потанцевать;
//Пингвины Макарони (Macaroni Penguins) — любители сёрфинга.
//К сожалению, в мультфильмах не было сказано, какой вид пингвинов самый многочисленный. Денис решил выяснить это: он посмотрел эти мультфильмы еще раз, и каждый раз, когда видел пингвина, записывал в блокнот название его вида. Сейчас Денис дал вам блокнот с просьбой выяснить, какой вид пингвинов самый многочисленный.
//Исходные данные
//В первой строке записано целое число n — количество записей в блокноте (1 ≤ n ≤ 1000). В каждой из следующих n строк записано по одному виду пингвинов. Среди видов встречаются только «Emperor Penguin», «Little Penguin» и «Macaroni Penguin».
//Результат
//Выведите самый популярный вид пингвинов. Гарантируется, что такой вид только один.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class task_1585 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> penguins = new ArrayList<>();
        int N, E = 0, M = 0, L = 0;
        N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String s = scanner.nextLine();
            penguins.add(s);
            if (s.equals("Emperor Penguin"))
                E++;
            if (s.equals("Macaroni Penguin"))
                M++;
            if (s.equals("Little Penguin"))
                L++;
        }
        int MAX = Collections.max(Collections.singletonList(E));
        if (MAX == E)
            System.out.println("Emperor Penguin");
        else if (MAX == M)
            System.out.println("Macaroni Penguin");
        else if (MAX == L)
            System.out.println("Little Penguin");
    }
}
