package lr10.FirstPart;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
public class Example4 {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("example-json.json")) {
            // Читаем JSON файл
            Object obj = parser.parse(reader);

            // Преобразуем объект JSON в JSONObject
            JSONObject jsonObject = (JSONObject) obj;

            // Выводим содержимое JSON в консоль
            System.out.println("Содержимое JSON файла:");
            for (Object key : jsonObject.keySet()) {
                System.out.println(key + ": " + jsonObject.get(key));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
