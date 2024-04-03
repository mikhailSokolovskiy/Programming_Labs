package lr10.FirstPart;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
public class Example5 {
    public static void main(String[] args) {
        try {
            // Подключаемся к сайту
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            // Находим все элементы с классом "blocktitle"
            Elements newsBlocks = doc.getElementsByClass("blocktitle");

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
}
