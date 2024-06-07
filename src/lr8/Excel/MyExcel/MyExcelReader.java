package lr8.Excel.MyExcel;

import java.io.IOException;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class MyExcelReader {
    public static void main(String[] args) {
        try {
            String filePath = "src/lr8/Excel/MyExcel/example.xlsx";
            FileInputStream inputStream = new FileInputStream(filePath);

            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Товары");
            for (Row row : sheet){
                for (Cell cell : row){
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
            workbook.close();
            inputStream.close();
        } catch (IOException e){
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (Exception ex) {
            System.out.println("Произошла ошибка: " + ex.getMessage());
        }
    }
}