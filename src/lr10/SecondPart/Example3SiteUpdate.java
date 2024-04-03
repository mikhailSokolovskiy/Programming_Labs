package lr10.SecondPart;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.FileWriter;
import java.io.IOException;
public class Example3SiteUpdate {
    public static void main(String[] args) {
        try {
            // Подключаемся к сайту
            Document doc = connectWithRetry("http://fat.urfu.ru/index.html");

            // Находим все элементы с классом "blocktitle"
            Elements newsBlocks = doc.getElementsByClass("blocktitle");

            // Записываем полученные данные в файл
            writeToFile(newsBlocks, "news.txt");

            // Проходим по всем найденным элементам
            for (Element newsBlock : newsBlocks) {
                // Извлекаем текст заголовка новости
                String title = newsBlock.text();

                // Выводим заголовок новости
                System.out.println("Название новости: " + title);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Функция для подключения к сайту с возможностью переподключения в случае ошибки
    private static Document connectWithRetry(String url) throws IOException {
        int maxRetries = 3;
        int retries = 0;
        while (true) {
            try {
                return Jsoup.connect(url).get();
            } catch (IOException e) {
                retries++;
                if (retries == maxRetries) {
                    throw e;
                }
                System.out.println("Ошибка при подключении к сайту. Попытка переподключения...");
            }
        }
    }

    // Функция для записи данных в файл
    private static void writeToFile(Elements data, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (Element element : data) {
                fileWriter.write("Название новости: " + element.text() + "\n");
            }
            System.out.println("Данные успешно записаны в файл " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи данных в файл: " + e.getMessage());
        }
    }
}
