import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestMap extends Application implements RootG
{
    private ThedTest thedTest = new ThedTest();

    @Override
    public void start(Stage primaryStage) throws Exception {

        root.getChildren().addAll(thedTest.getB1(), thedTest.getB2());

        Scene scene = new Scene(root, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}