package FX;/*Анимация*/

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DataFormat;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.FileInputStream;

public class FX_11 extends Application{
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Создадим ранктангл:
        Rectangle rectangle = new Rectangle(0,0,50,50);
        //Для того чтобы получить анимацию необходимо менять значения (у ранктангла это пропертя):
        KeyValue xValue = new KeyValue(rectangle.xProperty(), 200);
        KeyValue yValue = new KeyValue(rectangle.yProperty(), 200);
        //далее значения необходимо поместить в кейрейн, он будет их менять:
        KeyFrame keyFrame = new KeyFrame(Duration.millis(2000), xValue, yValue);
        //Далее создаем таймлайн:
        Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);//установим кол-во раз бесконечное
        timeline.setAutoReverse(true);//установим автовозрат
        timeline.getKeyFrames().add(keyFrame); //добавляем значения.
        timeline.play(); //запускаем анимацию

        /*В JAVA есть стандартные анимации, называемые Transition!*/
        //Заставим картинку исчезать, создадим картинку:
        Image image = new Image(new FileInputStream("Картинка.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(250);
        imageView.setFitWidth(150);
        //создадим анимацию к картинке:
        FadeTransition fadeTransition = new FadeTransition(Duration.millis(2000), imageView);
        fadeTransition.setFromValue(1.0); //задаем начальное значение
        fadeTransition.setToValue(0.0); //задаем конечное значение
        fadeTransition.setCycleCount(Timeline.INDEFINITE);
        fadeTransition.setAutoReverse(true);
        fadeTransition.play();

        //Заставим перемещаться фигуру по заданному пути:
        Rectangle rectPath = new Rectangle(0, 0, 40, 40);
        rectPath.setFill(Color.GOLD);
        //создаем путь:
        Path path = new Path();
        //создадим не ленейную прямую:
//        path.getElements().add(new MoveTo(20,20));
//        path.getElements().add(new CubicCurveTo(380, 0, 380, 120, 200, 120));
//        path.getElements().add(new CubicCurveTo(0, 120, 0, 240, 380, 240));
//        //создаем анимацию:
//        PathTransition pathTransition = new PathTransition();
//        pathTransition.setDuration(Duration.millis(3000));
//        pathTransition.setPath(path);
//        pathTransition.setNode(rectPath);
//        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
//        pathTransition.setCycleCount(Timeline.INDEFINITE);
//        pathTransition.setAutoReverse(true);
//        pathTransition.play();

        //запустим несколько Transition(ParallelTransition):
        FadeTransition fadeTransition1 = new FadeTransition(Duration.millis(3000), rectPath);
        fadeTransition1.setFromValue(1.0f);
        fadeTransition1.setToValue(0.3f);
        fadeTransition1.setCycleCount(2);
        fadeTransition1.setAutoReverse(true);
        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(2000), rectPath);
        translateTransition.setFromX(50);
        translateTransition.setToX(350);
        translateTransition.setCycleCount(2);
        translateTransition.setAutoReverse(true);
        RotateTransition rotateTransition = new RotateTransition(Duration.millis(3000), rectPath);
        rotateTransition.setByAngle(180f);
        rotateTransition.setCycleCount(4);
        rotateTransition.setAutoReverse(true);
        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(2000), rectPath);
        scaleTransition.setToX(2f);
        scaleTransition.setToX(2f);
        scaleTransition.setCycleCount(2);
        scaleTransition.setAutoReverse(true);
        //запустим несколько Transition для одной фигуры:
//        ParallelTransition parallelTransition = new ParallelTransition();
//        parallelTransition.getChildren().addAll(fadeTransition1,translateTransition,rotateTransition,scaleTransition);
//        parallelTransition.setCycleCount(Timeline.INDEFINITE);
//        parallelTransition.setAutoReverse(true);
//        parallelTransition.play();

        //Теперь сделаем выполнение всех выше написаных анимаций не одновременно, а по порядку:
        SequentialTransition sequentialTransition = new SequentialTransition();
        sequentialTransition.getChildren().addAll(fadeTransition1,translateTransition,rotateTransition,scaleTransition);
        sequentialTransition.setCycleCount(Timeline.INDEFINITE);
        sequentialTransition.setAutoReverse(true);
        sequentialTransition.play();

        Group root = new Group();
        //root.getChildren().add(rectangle);
        //root.getChildren().add(imageView);
        root.getChildren().add(rectPath);
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();
    }
}
