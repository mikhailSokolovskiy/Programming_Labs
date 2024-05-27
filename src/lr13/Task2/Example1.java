package lr13.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example1 {
    static List<String> _list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа через пробел: ");
        String elements = sc.nextLine();
        _list = List.of(elements.split(" "));
        System.out.println(avg(_list));
    }

    public static Object avg(List<String> list) {
        int sum;
        try {
            int[] integerList = list.stream().mapToInt(Integer::parseInt).toArray();
            sum = Arrays.stream(integerList).sum();
            for (int j : integerList) {
                if (j < 0) {
                    throw new IllegalArgumentException();
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Инвалид ввода))) вы ввели строку или тип данных  не очень или числа негативные(злые/отрицательные)");
            return null;
        }
        return sum / list.size();
    }

}
