package Практические_занятия.On;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;

public class TestFX extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button1 = new Button("OK");



        Group root = new Group();
        root.getChildren().addAll(button1);
        Scene scene = new Scene(root);
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
