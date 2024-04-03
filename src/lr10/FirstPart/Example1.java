package lr10.FirstPart;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
public class Example1 {
    public static void main(String[] args) {
        try {
            // Создаем фабрику для создания парсера XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Создаем новый документ XML
            Document document = builder.newDocument();

            // Создаем корневой элемент
            Element rootElement = document.createElement("root");
            document.appendChild(rootElement);

            // Создаем дочерние элементы и добавляем их к корневому элементу
            Element childElement1 = document.createElement("child1");
            childElement1.setTextContent("Content1");
            rootElement.appendChild(childElement1);

            Element childElement2 = document.createElement("child2");
            childElement2.setTextContent("Content2");
            rootElement.appendChild(childElement2);

            // Используем Transformer для записи DOM-структуры в файл
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult("output.xml");
            transformer.transform(source, result);

            System.out.println("XML файл создан успешно.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
