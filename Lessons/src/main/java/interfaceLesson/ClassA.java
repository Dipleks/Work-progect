package interfaceLesson;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ClassA extends Application implements TestInt
{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        TestInt testInt = new ClassB();

        group.getChildren().addAll(testInt.getGritPane());

        Scene scene = new Scene(group, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public String[] testStr() {
        return new String[0];
    }

    @Override
    public GridPane getGritPane() {
        return null;
    }
}
