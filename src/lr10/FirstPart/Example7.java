package lr10.FirstPart;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
public class Example7 {
    public static void main(String[] args) throws IOException {
        // Открываем файл Excel для чтения
        FileInputStream fileInputStream = new FileInputStream("output.xlsx");
        Workbook workbook = new XSSFWorkbook(fileInputStream);

        // Получаем лист с данными
        Sheet sheet = workbook.getSheetAt(0); // Лист "Товары"

        // Читаем данные из листа
        for (Row row : sheet) {
            // Пропускаем первую строку, так как это заголовок
            if (row.getRowNum() == 0) {
                continue;
            }

            // Читаем данные из ячеек
            String productName = row.getCell(0).getStringCellValue();
            String characteristics = row.getCell(1).getStringCellValue();
            String price = row.getCell(2).getStringCellValue();

            // Выводим данные в консоль
            System.out.println("Название товара: " + productName);
            System.out.println("Характеристики: " + characteristics);
            System.out.println("Стоимость: " + price);
            System.out.println();
        }

        // Закрываем поток чтения и книгу Excel
        fileInputStream.close();
        workbook.close();
    }
}
