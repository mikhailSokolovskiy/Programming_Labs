package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Example6 {
    //    Напишите функцию, которая принимает на вход список целых чисел и
//    возвращает новый список, содержащий только те числа, которые делятся на
//    заданное число без остатка.
    public static List<Integer> getDivisibleNumbers(List<Integer> numbers, int divisor) {
        return numbers.stream()
                .filter(n -> n % divisor == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int divisor = 3;

        List<Integer> result = getDivisibleNumbers(numbers, divisor);

        System.out.println("Числа, делящиеся на " + divisor + " без остатка:");
        result.forEach(System.out::println);
    }
}
