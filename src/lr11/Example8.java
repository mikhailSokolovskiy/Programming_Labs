package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Example8 {
    //    Напишите функцию, которая принимает на вход список целых чисел и
//    возвращает новый список, содержащий только те числа, которые больше
//    заданного значения.
    public static List<Integer> filterGreaterThan(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int threshold = 5;

        List<Integer> result = filterGreaterThan(numbers, threshold);

        System.out.println("Числа, большие " + threshold + ":");
        result.forEach(System.out::println);
    }
}
