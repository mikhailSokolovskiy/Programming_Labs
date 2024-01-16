package timus;
//Вова купил билет в трамвае 13-го маршрута и сразу посчитал суммы первых трёх цифр и последних трёх цифр номера билета (номер у билета шестизначный). Оказалось, что суммы отличаются ровно на единицу. «Я в одном шаге от счастья», — подумал Вова, — «или предыдущий или следующий билет точно счастливый». Прав ли он?
//Исходные данные
//В единственной строке записан номер билета. Номер состоит ровно из шести цифр, среди которых могут быть и нули. Гарантируется, что Вова умеет считать, то есть суммы первых трёх цифр и последних трёх цифр отличаются ровно на единицу.
//Результат
//Выведите «Yes», если Вова прав, и «No», если нет.
import java.util.Scanner;

public class task_1493 {
    public static int sum(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f, l, a;
        String fs, ls;
        a = scanner.nextInt();
        int apl = a + 1, fpl = apl / 1000, lpl = apl % 1000, amns = a - 1, fmns = amns / 1000, lmns = amns % 1000;
        if (sum(fpl) == sum(lpl) || sum(fmns) == sum(lmns))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
