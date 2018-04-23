package Практические_занятия.Table_3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Window1 {
    private Group group1;
    private Scene scene1;
    private Label l1;
    Stage primaryStage;

    public Stage getPrimaryStage1 () {

            l1 = new Label("Window1");

            group1 = new Group();
            group1.getChildren().addAll(l1);
            scene1 = new Scene(group1, 400, 250);
            primaryStage.setScene(scene1);
            primaryStage.show();

            return primaryStage;
    }
}
