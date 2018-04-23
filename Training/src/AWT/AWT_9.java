package AWT;
/*Чтение и запись изображений*/
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

public class AWT_9 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:zappy-768x768.png"); //указваем место хранения файла.
        BufferedImage image = ImageIO.read(file); //производим чтение файла.
        ImageIO.write(image, "jpg", new File("D:zappy-768x768.jpg")); //перезаписываем фаил в новый формат.

        //Просмотрим все поддерживаемые форматы:
        String[] extension = ImageIO.getReaderFileSuffixes();
        for (String str : extension){
            System.out.println(str);
        }

        //Проверяем данные на поддержку формата:
        ImageReader reader = null;
        Iterator<ImageReader> iterator = ImageIO.getImageReadersByFormatName("JPEG");
        if (iterator.hasNext()) reader = iterator.next();

        //Чтение вложенного файла:
        InputStream inputStream = new FileInputStream(new File("D:zappy-768x768.png")); //1й способ
        ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream);
        //или 2й способ:
        ImageInputStream imageInputStream1 = ImageIO.createImageInputStream(new File("D:zappy-768x768.png"));
        reader.setInput(imageInputStream, true); //определение входного файла.
        BufferedImage image1 = reader.read(reader.getNumImages(true)); //чтение файла.

        //Чтение маленьких картинок (картинки возле активных приложений, например свернутых на панели):
        int count = reader.getNumThumbnails(0);
        BufferedImage image2 = reader.readThumbnail(0, count);
        System.out.println(reader.getHeight(0));
        reader.getWidth(0);

        //Сценарии:
        ImageWriter writer = null;
        Iterator<ImageWriter> iterator1 = ImageIO.getImageWritersByFormatName("JPEG");
        if (iterator1.hasNext()) writer = iterator1.next();

        //записываем сценарий в определенном формате:
        ImageOutputStream imageOutputStream = ImageIO.createImageOutputStream(new File("D:zappy-768x768.jpg"));
        writer.setOutput(imageInputStream);
    }
}
