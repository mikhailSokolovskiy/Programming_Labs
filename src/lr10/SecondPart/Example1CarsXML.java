package lr10.SecondPart;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Scanner;

public class Example1CarsXML {
    public static void main(String[] args) {
        Example1CarsXML xmlHandler = new Example1CarsXML();
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
                    xmlHandler.CreateXMLCars();
                    break;
                case 2:
                    xmlHandler.AddNewCar();
                    break;
                case 3:
                    xmlHandler.SearchByMark();
                    break;
                case 4:
                    xmlHandler.DeleteCar();
                    break;
                case 5:
                    System.out.println("Программа завершена.");
                    System.exit(0);
                default:
                    System.out.println("Неверный ввод. Пожалуйста, выберите действие из списка.");
            }
        }

    }

    // Метод для создания элемента "car"
    private static Element createCarElement(Document document, String make, String model, String year) {
        Element carElement = document.createElement("car");

        Element makeElement = document.createElement("make");
        makeElement.setTextContent(make);
        carElement.appendChild(makeElement);

        Element modelElement = document.createElement("model");
        modelElement.setTextContent(model);
        carElement.appendChild(modelElement);

        Element yearElement = document.createElement("year");
        yearElement.setTextContent(year);
        carElement.appendChild(yearElement);

        return carElement;
    }
    public void CreateXMLCars(){
        try {
            // Создаем фабрику для создания парсера XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Создаем новый документ XML
            Document document = builder.newDocument();

            // Создаем корневой элемент
            Element rootElement = document.createElement("cars");
            document.appendChild(rootElement);

            // Создаем автомобили и добавляем их к корневому элементу
            Element car1 = createCarElement(document, "Toyota", "Camry", "2018");
            rootElement.appendChild(car1);

            Element car2 = createCarElement(document, "BMW", "X5", "2020");
            rootElement.appendChild(car2);

            // Используем Transformer для записи DOM-структуры в файл
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult("cars.xml");
            transformer.transform(source, result);

            System.out.println("XML файл создан успешно.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void AddNewCar(){
        try {
            // Создаем фабрику для создания парсера XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Загружаем существующий XML-файл или создаем новый
            Document document;
            try {
                document = builder.parse("cars.xml");
            } catch (Exception e) {
                document = builder.newDocument();
            }

            // Получаем корневой элемент "cars" или создаем новый, если он отсутствует
            Element rootElement;
            if (document.getDocumentElement() == null) {
                rootElement = document.createElement("cars");
                document.appendChild(rootElement);
            } else {
                rootElement = document.getDocumentElement();
            }

            // Получаем данные о новой машине от пользователя
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите марку машины:");
            String make = scanner.nextLine();
            System.out.println("Введите модель машины:");
            String model = scanner.nextLine();
            System.out.println("Введите год выпуска машины:");
            String year = scanner.nextLine();

            // Создаем новый элемент "car" и добавляем его к корневому элементу
            Element newCar = createCarElement(document, make, model, year);
            rootElement.appendChild(newCar);

            // Используем Transformer для записи DOM-структуры в файл
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult("cars.xml");
            transformer.transform(source, result);

            System.out.println("Новая машина успешно добавлена в XML файл.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void SearchByMark(){
        try {
            // Создаем фабрику для создания парсера XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Загружаем XML-файл
            Document document = builder.parse("cars.xml");

            // Получаем корневой элемент
            Element rootElement = document.getDocumentElement();

            // Получаем марку машины для поиска
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите марку машины для поиска:");
            String searchMake = scanner.nextLine();

            // Получаем список всех дочерних элементов <car>
            NodeList carList = rootElement.getElementsByTagName("car");

            // Перебираем каждый элемент <car>
            boolean found = false;
            for (int i = 0; i < carList.getLength(); i++) {
                Element carElement = (Element) carList.item(i);

                String make = carElement.getElementsByTagName("make").item(0).getTextContent();
                String model = carElement.getElementsByTagName("model").item(0).getTextContent();
                String year = carElement.getElementsByTagName("year").item(0).getTextContent();

                // Проверяем, соответствует ли машина введенной марке
                if (make.equalsIgnoreCase(searchMake)) {
                    System.out.println("Марка: " + make);
                    System.out.println("Модель: " + model);
                    System.out.println("Год выпуска: " + year);
                    System.out.println();
                    found = true;
                }
            }

            // Если машина с указанной маркой не найдена
            if (!found) {
                System.out.println("Машина с маркой '" + searchMake + "' не найдена.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DeleteCar(){
        try {
            // Создаем фабрику для создания парсера XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Загружаем XML-файл
            Document document = builder.parse("cars.xml");

            // Получаем корневой элемент
            Element rootElement = document.getDocumentElement();

            // Получаем список всех дочерних элементов <car>
            NodeList carList = rootElement.getElementsByTagName("car");

            // Получаем марку машины для поиска
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите марку машины для удаления:");
            String makeToRemove = scanner.nextLine();

            // Перебираем каждый элемент <car>
            for (int i = 0; i < carList.getLength(); i++) {
                Element carElement = (Element) carList.item(i);

                String make = carElement.getElementsByTagName("make").item(0).getTextContent();

                // Проверяем, соответствует ли машина указанной марке для удаления
                if (make.equalsIgnoreCase(makeToRemove)) {
                    // Удаляем элемент <car> из документа
                    Node parent = carElement.getParentNode();
                    parent.removeChild(carElement);
                    System.out.println("Машина с маркой '" + makeToRemove + "' успешно удалена из XML файла.");
                    // Используем Transformer для записи DOM-структуры в файл
                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    DOMSource source = new DOMSource(document);
                    StreamResult result = new StreamResult("cars.xml");
                    transformer.transform(source, result);
                    return; // Мы можем завершить метод после удаления машины
                }
            }

            // Если машина с указанной маркой не найдена
            System.out.println("Машина с маркой '" + makeToRemove + "' не найдена в XML файле.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
