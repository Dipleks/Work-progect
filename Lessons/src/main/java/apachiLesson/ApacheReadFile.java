package apachiLesson;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ApacheReadFile {
    public static void main(String[] args) throws IOException {


// Чтение из файла:
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\zagorodnev\\Desktop\\pr.xls");
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(fileInputStream); //получаем фаил из потока
        HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0); //лист файла xls

        Cell cell1;
        Cell cell2;
        Cell cell3;
        Cell cell4;
        Cell cell5;
        Cell cell6;
        Row row1;
        Row row2;
        Row row3;

        row1 = hssfSheet.getRow(0); //номер строки
        row2 = hssfSheet.getRow(1);
        row3 = hssfSheet.getRow(3);
        cell1 = row1.getCell(0); //номер ячейки строки
        cell2 = row1.getCell(1);
        cell3 = row2.getCell(0);
        cell4 = row2.getCell(1);
        cell5 = row3.getCell(0);
        cell6 = row3.getCell(1);
        System.out.println(cell1 + " " + cell2);
        System.out.println(cell3 + " " + cell4);
        System.out.println(cell5 + " " + cell6);

    }
}
