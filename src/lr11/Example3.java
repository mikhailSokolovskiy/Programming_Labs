package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Example3 {

//    Напишите функцию, которая принимает на вход список строк и
//    возвращает новый список, содержащий только те строки, которые
//    начинаются с большой буквы.
    public static List<String> getCapitalizedStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("Apple", "banana", "Orange", "grape");

        List<String> result = getCapitalizedStrings(stringList);

        System.out.println("Строки, начинающиеся с большой буквы:");
        result.forEach(System.out::println);
    }
}
