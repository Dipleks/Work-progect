package FX;/*Учимся рисовать фигуры в JavaFX*/

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FX_3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Нарисуем линию:
        Line line = new Line(0,0,100,100);
        line.setStroke(Color.GREEN); //зададим цвет
        //Нарисуем элипс:
        Ellipse ellipse = new Ellipse(150,50,60,30);
        ellipse.setFill(Color.RED);

        Rectangle rectangle = new Rectangle(230, 10, 50,50);
        rectangle.setFill(Color.BLUE);
//setStroke - линия обводки, setFill - заполнение.
        //Текс тоже считается рисованием:
        Text text = new Text(30, 150, "Hello, is TEXT!!!");
        text.setFill(Color.GOLD);//можно таже изменить цвет текста
        text.setFont(Font.font(30));//можно задать размер шрифта

        Group root = new Group();
        Scene scene = new Scene(root, 400, 500);

        root.getChildren().add(line); //добавим нашу линию
        root.getChildren().add(ellipse); //добавим элипс
        root.getChildren().add(rectangle);
        root.getChildren().add(text);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
