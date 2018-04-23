package Практические_занятия.Table_3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Window2 extends Application {
    private Group group2;
    private Scene scene2;
    private Label l2;

    @Override
    public void start(Stage primaryStage) throws Exception {

        l2 = new Label("Window1");

        group2 = new Group();
        group2.getChildren().addAll(l2);
        scene2 = new Scene(group2, 400, 250);
        primaryStage.setScene(scene2);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
