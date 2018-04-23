package test;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Chok extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        ChoiceBox choiceBox = new ChoiceBox();
        choiceBox.setLayoutX(20);
        choiceBox.setLayoutY(20);

        List<String> list = new ArrayList<>();
        list.add("Упр.1");
        list.add("Упр.2");
        list.add("Упр.3");
        list.add("Упр.4");
        list.add("Упр.5");

        Group root = new Group();
        root.getChildren().addAll(choiceBox);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Test");
        primaryStage.show();







    }







    public static void main(String[] args) {
        launch(args);
    }
}
