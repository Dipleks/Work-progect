package AWT;
/*Image filter фильтры для изображений*/
import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.File;

public class AWT_11 {
    public static void main(String[] args) throws Exception{
        File file = new File("D:Картинка.jpg");
        BufferedImage image = ImageIO.read(file);

        //Создаем новый объект с оригинальными размерами и типом нашего файла:
        BufferedImage imageFiltered = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        //Задаем уголо поворота изображения и координаты поворота (у нас центр изображения):
        AffineTransform affineTransform = AffineTransform.getRotateInstance(45, image.getWidth()/2, image.getHeight()/2);
        //Передаем параметры для трансформации:
        BufferedImageOp op = new AffineTransformOp(affineTransform, AffineTransformOp.TYPE_BILINEAR);
        //Трансформируем:
        op.filter(image, imageFiltered);
        //Сохраняем наш объект:
        ImageIO.write(imageFiltered, "png", new File("D:music_lloyd.png"));
    }
}
