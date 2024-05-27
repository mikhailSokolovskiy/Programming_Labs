package lr10.SecondPart;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Example2CarsJSON {
    public static void main(String[] args) {
        Example2CarsJSON JsonHandler = new Example2CarsJSON();
        Scanner scanner = new Scanner(System.in);

        // Бесконечный цикл для отображения меню
        while (true) {
            // Выводим на экран меню
            System.out.println("Выберите действие:");
            System.out.println("1. Создать новую машину");
            System.out.println("2. Добавить новую машину");
            System.out.println("3. Найти машину по марке");
            System.out.println("4. Удалить машину по марке");
            System.out.println("5. Выйти");

            // Читаем выбор пользователя
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищаем буфер после считывания числа

            // Выполняем соответствующее действие в зависимости от выбора пользователя
            switch (choice) {
                case 1:
                    JsonHandler.CreateJsonCars();
                    break;
                case 2:
                    JsonHandler.AddNewCar();
                    break;
                case 3:
                    JsonHandler.SearchByMark();
                    break;
                case 4:
                    JsonHandler.DeleteCar();
                    break;
                case 5:
                    System.out.println("Программа завершена.");
                    System.exit(0);
                default:
                    System.out.println("Неверный ввод. Пожалуйста, выберите действие из списка.");
            }
        }
    }

    private void DeleteCar() {
        try {
            // Чтение существующего JSON файла
            String fileName = "cars.json";
            if (!Files.exists(Paths.get(fileName))) {
                System.out.println("JSON файл не найден.");
                return;
            }

            // Запросить у пользователя марку машины для удаления
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите марку машины для удаления:");
            String deleteMake = scanner.nextLine();

            // Парсинг JSON файла и удаление машины по марке
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(fileName));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray carsArray = (JSONArray) jsonObject.get("cars");

            boolean found = false;
            for (int i = 0; i < carsArray.size(); i++) {
                JSONObject car = (JSONObject) carsArray.get(i);
                String make = (String) car.get("make");

                // Если марка машины совпадает с удаляемой, удаляем машину из массива
                if (make.equalsIgnoreCase(deleteMake)) {
                    carsArray.remove(i);
                    found = true;
                    break;
                }
            }

            // Обновление JSON объекта с новым массивом машин и запись в файл
            if (found) {
                jsonObject.put("cars", carsArray);

                try (FileWriter file = new FileWriter(fileName)) {
                    file.write(jsonObject.toJSONString());
                    System.out.println("Машина с маркой '" + deleteMake + "' успешно удалена из JSON файла.");
                }
            } else {
                System.out.println("Машина с маркой '" + deleteMake + "' не найдена в JSON файле.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void SearchByMark() {
        try {
            // Чтение существующего JSON файла
            String fileName = "cars.json";
            if (!Files.exists(Paths.get(fileName))) {
                System.out.println("JSON файл не найден.");
                return;
            }

            // Запросить у пользователя марку машины для поиска
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите марку машины для поиска:");
            String searchMake = scanner.nextLine();

            // Парсинг JSON файла и поиск машин по марке
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(fileName));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray carsArray = (JSONArray) jsonObject.get("cars");

            boolean found = false;
            for (Object carObject : carsArray) {
                JSONObject car = (JSONObject) carObject;
                String make = (String) car.get("make");

                // Если марка машины совпадает с искомой, вывести информацию о машине
                if (make.equalsIgnoreCase(searchMake)) {
                    System.out.println("Машина найдена:");
                    System.out.println("Марка: " + car.get("make"));
                    System.out.println("Модель: " + car.get("model"));
                    System.out.println("Год выпуска: " + car.get("year"));
                    System.out.println();
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Машина с маркой '" + searchMake + "' не найдена.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void AddNewCar() {
// Запросить данные о новой машине у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите марку машины:");
        String make = scanner.nextLine();
        System.out.println("Введите модель машины:");
        String model = scanner.nextLine();
        System.out.println("Введите год выпуска машины:");
        int year = scanner.nextInt();

        // Создать JSON объект для новой машины
        JSONObject newCar = new JSONObject();
        newCar.put("make", make);
        newCar.put("model", model);
        newCar.put("year", year);

        try {
            // Чтение существующего JSON файла
            JSONParser parser = new JSONParser();
            JSONArray carsArray;

            try (FileReader fileReader = new FileReader("cars.json")) {
                Object obj = parser.parse(fileReader);
                JSONObject jsonObject = (JSONObject) obj;
                carsArray = (JSONArray) jsonObject.get("cars");
            }

            // Добавление новой машины в массив машин
            carsArray.add(newCar);

            // Обновление JSON объекта с новым массивом машин
            JSONObject updatedLibrary = new JSONObject();
            updatedLibrary.put("cars", carsArray);

            // Запись обновленного JSON в файл
            try (FileWriter file = new FileWriter("cars.json")) {
                file.write(updatedLibrary.toJSONString());
                System.out.println("Новая машина успешно добавлена в JSON файл.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void CreateJsonCars() {
        JSONObject library = new JSONObject();
        JSONArray cars = new JSONArray();

        JSONObject car1 = new JSONObject();
        car1.put("make", "Toyota");
        car1.put("model", "Camry");
        car1.put("year", 2018);

        JSONObject car2 = new JSONObject();
        car2.put("make", "BMW");
        car2.put("model", "X5");
        car2.put("year", 2020);

        cars.add(car1);
        cars.add(car2);

        library.put("cars", cars);

        try (FileWriter file = new FileWriter("cars.json")) {
            file.write(library.toJSONString());
            System.out.println("Json создан");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
