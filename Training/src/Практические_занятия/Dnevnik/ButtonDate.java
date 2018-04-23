package Практические_занятия.Dnevnik;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;

public class ButtonDate extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        LocalDate localDate = LocalDate.now();

        if (localDate.getDayOfMonth() <= 31) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Date: " + localDate.plusDays(i).getDayOfMonth());
            }
        }

        int a = 10;
        int b = 10;

        Button button = new Button();
        button.setLayoutX(a);
        button.setLayoutY(b);
        button.setText(String.valueOf(localDate.getDayOfMonth()));

        Group root = new Group();
        root.getChildren().addAll(button);
        Scene scene = new Scene(root, 1200, 700);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Органайзер");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
