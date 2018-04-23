package AWT;/*Печать документов*/

import javax.print.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class AWT_13 {
    public static void main(String[] args) throws Exception{
        DocFlavor flavor = DocFlavor.INPUT_STREAM.JPEG;
        //Получаем доступ к принтсервису, в него помещаем формат нашего фала,
        //и параметры принтера при необходимости (у нас null)^
        PrintService[] service = PrintServiceLookup.lookupPrintServices(flavor, null);
        //Указываем фаил:
        InputStream inputStream = new FileInputStream("D:Картинка.jpg");
        //Создаем документ для печати с нашими параметрами:
        Doc doc = new SimpleDoc(inputStream, flavor, null);
        if (service.length > 0) {
            DocPrintJob job = service[0].createPrintJob();
            job.print(doc, null); //печатаем нашу картинку.
        }
    }
}
