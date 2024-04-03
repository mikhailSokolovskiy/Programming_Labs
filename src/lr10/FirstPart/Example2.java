package lr10.FirstPart;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.io.File;
public class Example2 {
    public static void main(String[] args) {
        try {
            // Создаем фабрику для создания парсера XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Читаем XML файл
            File file = new File("output.xml");
            Document document = builder.parse(file);

            // Получаем корневой элемент
            Element rootElement = document.getDocumentElement();

            // Получаем список всех дочерних элементов
            NodeList nodeList = rootElement.getChildNodes();

            // Выводим содержимое дочерних элементов в консоль
            System.out.println("Содержимое XML файла:");
            for (int i = 0; i < nodeList.getLength(); i++) {
                if (nodeList.item(i).getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                    Element element = (Element) nodeList.item(i);
                    System.out.println(element.getNodeName() + ": " + element.getTextContent());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
