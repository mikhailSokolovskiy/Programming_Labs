package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
//    Напишите функцию, которая принимает на вход список чисел и
//    возвращает новый список, содержащий квадраты этих чисел.
public static List<Integer> getSquares(List<Integer> numbers) {
    return numbers.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());
}

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> squares = getSquares(numbers);

        System.out.println("Квадраты чисел:");
        squares.forEach(System.out::println);
    }

}
