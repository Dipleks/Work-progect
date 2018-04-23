package FX;/*Обработчик событий*/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FX_9 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Создадим кнопку и добавим к ней обработчик ее нажатия:
        Button button = new Button("press");
        //setOn и после него выбираем надчем работаем:
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("action");
            }
        });
        //Или можно делать не посредственно через EventHandler (любой из способов приемлем):
        //вместо ActionEvent может быть уточнение для мышки, клавиш и т.д (MouseEvent...):
        button.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("event handler");
            }
        });

        Group root = new Group();
        root.getChildren().add(button);
        Scene scene = new Scene(root, 700, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
