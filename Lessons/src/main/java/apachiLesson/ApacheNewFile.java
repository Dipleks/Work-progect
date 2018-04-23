package apachiLesson;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ApacheNewFile
{
    public static void main(String[] args) throws IOException {

        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        HSSFSheet hssfSheet = hssfWorkbook.createSheet("testXLS"); //указываем на какой лист будет производится запись

        int rownum = 0;
        Cell cell;
        Row row;


        row = hssfSheet.createRow(rownum); //строка листа

        cell = row.createCell(0, CellType.STRING); //тип ячейки
        cell = row.createCell(1, CellType.STRING);
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("one"); //заполняем ячейку
        cell.setCellValue("two");
        cell.setCellValue("three");

        File file = new File("C:\\testXLS.xls"); //путь где будет создан новый фаил
        file.getParentFile().mkdirs();

        FileOutputStream fileOutputStream = new FileOutputStream(file); //помещаем фаил в поток
        hssfWorkbook.write(fileOutputStream); //создаем и заполняем фаил потока
    }
}
