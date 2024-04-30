package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
//    Напишите функцию, которая принимает на вход список строк и
//    возвращает новый список, содержащий только те строки, которые содержат
//    заданную подстроку.

    public static List<String> filterStrings(List<String> strings, String substring) {
        return strings.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "banana", "orange", "grape");
        String substring = "an";

        List<String> result = filterStrings(stringList, substring);

        System.out.println("Строки, содержащие подстроку \"" + substring + "\":");
        result.forEach(System.out::println);
    }
}
