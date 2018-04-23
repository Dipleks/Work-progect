package FX;/*Работа с изображениями*/

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FX_10 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Добавим нашу картинку:
        Image image = new Image(new FileInputStream("Картинка.jpg"));
        ImageView imageView = new ImageView(image);
        //зададим размеры картинки (не обязательно):
        imageView.setFitHeight(250);
        imageView.setFitWidth(150);

        //Иногда нам может потребоваться менять пиксилы в изображениях:
        //Пробежимся по всем пикселам:
        PixelReader pixelReader = image.getPixelReader();
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                Color color = pixelReader.getColor(i, j);
            }
        }
        //Запишем информацию в пикселы:
        WritableImage wImage = new WritableImage((int)image.getWidth(), (int)image.getHeight());
        PixelWriter printWriter = wImage.getPixelWriter();
        //пробегаем по высоте и ширине и записываем информацию:
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                printWriter.setColor(i, j, Color.ALICEBLUE); //заменяем все пикселы светлоголубым цветом
            }
        }
        //Можем так же сохранить нашу картинку:
        //ImageIO.write(SwingFXUtils.fromFXImage(wImage, null), "png", new FileOutputStream("Картинка_2.png"));

        Group root = new Group();
        root.getChildren().add(imageView);
        //root.getChildren().add(new ImageView(wImage)); //получим светлоголубую картинку
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();
    }
}
