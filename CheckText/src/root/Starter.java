package root;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application implements Root
{
    private IsetText isetText = new LabelText();
    private IsetText isetText2 = new BattonCheck();
    @Override
    public void start(Stage primaryStage) throws Exception {

        isetText.getEngI();
        isetText2.getButton();
        root.getChildren().addAll();

        Scene scene = new Scene(root, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
