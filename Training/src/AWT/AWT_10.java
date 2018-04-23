package AWT;/*Работа с изображениями*/

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;

public class AWT_10 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:Картинка.jpg");
        BufferedImage image = ImageIO.read(file);

        WritableRaster raster = image.getRaster();
        //1й способ:
        for (int i = 0; i < image.getWidth(); i++) {
            int[] pixel = raster.getPixel(i, 0 , new int[4]);
            pixel[0] = 0;
            pixel[1] = 0;
            pixel[2] = 0;
            raster.setPixel(i, 0, pixel);
        }

        //2й способ:
//        raster.getPixels(0,0, image.getHeight(), image.getWidth(), new int[4*image.getHeight()*image.getWidth()]);
//        raster.setPixels(0,0, image.getHeight(), image.getWidth(), new int[4*image.getHeight()*image.getWidth()]);

        //3й способ:
//        Object data = raster.getDataElements(0,0, null);
//        ColorModel colorModel = image.getColorModel();
//        Color color = new Color(colorModel.getRed(data),true);
//        raster.setDataElements(0,0,data);

        //Вывод:
        image.setData(raster);
        ImageIO.write(image, "png", new File("D:music_lloyd.png"));
    }
}
