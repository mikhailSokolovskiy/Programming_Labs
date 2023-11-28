package lr6;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Set;

public class Example3 {
    public static void main(String[] args) {
        class MyClass{

            public static int Max(int... args) {
                int max = 0;
                for (int arg : args){
                    if (arg > max){
                        max = arg;
                    }
                }
                return max;
            }
            public static int Min(int... args) {
                int min = args[0];
                for (int arg : args){
                    if (arg < min){
                        min = arg;
                    }
                }
                return min;
            }
            public static double Avg(int... args) {
                double avg = 0;
                for (int arg : args){
                    avg += arg;
                }
                avg /= args.length;
                return avg;
            }
            public static void Show(){
                System.out.println("Наибольшее значение из введенных: " + Max(5, 22, 3, 4, 5));
                System.out.println("Наименьшее значение из введенных: " + Min(5, 22, 3, 4, 5));
                System.out.println("Среднее значение из введенных: " + Avg(5, 22, 3, 4, 5));
                System.out.println("Наибольшее значение из введенных: " + Max(new int[] {21, 2, 33, 47, 5}));
                System.out.println("Наименьшее значение из введенных: " + Min(new int[] {21, 2, 33, 47, 5}));
                System.out.println("Среднее значение из введенных: " + Avg(new int[] {21, 2, 33, 47, 5}));
            }
        }

        MyClass.Show();

    }
}
