package AWT;/*Print PostScript - печатаем объект в
фаил (полученный фаил можно скоприровать и распечатать
на любом ПК где есть принтер)*/

import javax.print.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class AWT_14 {
    public static void main(String[] args) throws Exception {
        DocFlavor docFlavor = DocFlavor.INPUT_STREAM.JPEG;
        String mimeType = "application/postscript";
        StreamPrintServiceFactory[] f = StreamPrintServiceFactory.lookupStreamPrintServiceFactories(docFlavor, mimeType);
        OutputStream outputStream = new FileOutputStream("D:Post.odd");
        StreamPrintService streamPrintService = f[0].getPrintService(outputStream);

        InputStream inputStream = new FileInputStream("D:Картинка.jpg");
        DocPrintJob job = streamPrintService.createPrintJob();
        Doc doc = new SimpleDoc(inputStream, DocFlavor.INPUT_STREAM.JPEG, null);
        job.print(doc, null);
    }
}
