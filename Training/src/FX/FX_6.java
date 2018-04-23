package FX;/*Layout - это принцип размещения элементов.
* Что бы не происходило проблем с накладыванием кнопок,
* полей и т.д друг на друга используют layout.*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FX_6 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Создадим границу в которой будет находится наша кнопка:
        BorderPane borderPane = new BorderPane();
        //Задаем расположение кнопки и создаем кнопку:
        borderPane.setBottom(new Button("press")); //setBottom - нижнее расположение
        //Задаем размеры границы:
        borderPane.setMinWidth(250);
        borderPane.setMinHeight(150);

        /*Кроме BorderPane есть и другие layout-ы:*/
        //Принцип работы HBox в том, что он распологает все элементы друг за другом:
        HBox hBox = new HBox();
        hBox.getChildren().addAll(new Button("one"), new Button("two"));
        hBox.setSpacing(10); //можем задать растояние между кнопками
        hBox.setPadding(new Insets(5)); //зададим расстояние от краев окна

        /*Есть еще VBox, только в нем элементы идут в столбик.
        *
        * Есть StackPane - элементы накладываются друг на друга, например,
        * можно нарисовать вопрос на кнопке!
        *
        * GridPane - разбивает рабочею область на невидимые клетки, и мы указываем сколько клеток
        * занимает елемент!
        *
        * FlowPane - похож на HBox, разница в том что элементы, как заканчивается поле, перекидываются
        * на новую строчку! Элементы желательно должны быть одного размера!
        *
        * TilePane - тоже что и FlowPane, только объекты помещаются строго в свой квадрат, типа как
        * в GridPane!
        *
        * AnchorPane - закрепляет элементы строго в определенной областе окна.*/

        Group root = new Group();
        Scene scene = new Scene(root, 500, 300);
        root.getChildren().add(borderPane); //поместим в окно нашу кнопку.
        root.getChildren().add(hBox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
