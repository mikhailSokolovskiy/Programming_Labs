package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    //    Напишите функцию, которая принимает на вход список строк и
//    возвращает новый список, содержащий только те строки, которые содержат
//    только буквы (без цифр и символов).
    public static List<String> filterOnlyLetters(List<String> strings) {
        return strings.stream()
                .filter(s -> s.chars().allMatch(Character::isLetter))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "banana", "123orange", "grape");

        List<String> result = filterOnlyLetters(stringList);

        System.out.println("Строки, содержащие только буквы:");
        result.forEach(System.out::println);
    }
}
