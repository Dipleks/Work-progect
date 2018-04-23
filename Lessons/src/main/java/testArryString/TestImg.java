package testArryString;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.effect.ColorInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.FileInputStream;
import java.io.InputStream;

import static javafx.scene.paint.Color.*;

public class TestImg extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();

//        InputStream img = getClass().getResourceAsStream("unnamed.png");
        Image image = new Image("unnamed.png");
        ImageView imageView = new ImageView(image);

        Button button = new Button();
        button.setGraphic(imageView);
        button.setStyle("-fx-background-color: transparent;");
        button.setLayoutX(550);
//        button.setTranslateX(400);
//        button.setOpacity(0.5F);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("TEST");
            }
        });

        //Создаем меню:
        MenuBar menuBar = new MenuBar();
        menuBar.setStyle("-fx-background-color: red;");
        Menu menu = new Menu("File");
        MenuItem menuItem = new MenuItem("Close");
        MenuItem menuItem2 = new MenuItem("Deference");
//        menu.setStyle("-fx-background-color: red;");
        menuItem.setStyle("-fx-background-color: red;");
        menuItem2.setStyle("-fx-background-color: red;");
        menuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });
        menu.getItems().addAll(menuItem, menuItem2);
        menuBar.getMenus().addAll(menu);

        //Создаем панель:
        FlowPane flowPane = new FlowPane();
        flowPane.setPrefSize(600, 600);
        flowPane.setLayoutX(50);
        flowPane.setLayoutY(50);
        flowPane.getChildren().addAll();
        flowPane.setStyle("-fx-background-color: red;"); //выставляем цвет
        flowPane.setOpacity(0.5); //выставляем прозрачность
        flowPane.getChildren().addAll();

        group.getChildren().addAll(flowPane, menuBar, button);


        Scene scene = new Scene(group, 700, 700);
//        scene.setFill(Color.rgb(255,100,0,0.5)); //делаем полупрозрачность
        scene.setFill(Color.TRANSPARENT); //полнностью прозрачная сцена
        primaryStage.initStyle(StageStyle.TRANSPARENT); //убираем кнопки свернуть/развернуть/закрыть
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
