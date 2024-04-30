package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
//    Напишите функцию, которая принимает на вход список строк и
//    возвращает новый список, содержащий только те строки, которые имеют
//    длину больше заданного значения.

    public static List<String> filterLongerStrings(List<String> strings, int minLength) {
        return strings.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "banana", "orange", "grape");
        int minLength = 5;

        List<String> result = filterLongerStrings(stringList, minLength);

        System.out.println("Строки, длина которых больше " + minLength + ":");
        result.forEach(System.out::println);
    }
}
