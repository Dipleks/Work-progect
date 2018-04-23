package testAddLabelStringInGroup;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Strarter extends Application implements Root
{
    private Scene scene = new Scene(root, 500, 500);

    @Override
    public void start(Stage primaryStage) throws Exception {

        LabelAbs labelAbs = new LabelAbs();
        labelAbs.getLabelAdd();

        root.getChildren().addAll();

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
