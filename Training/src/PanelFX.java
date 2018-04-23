import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;

public class PanelFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 900, 700);

        Parent conteck = FXMLLoader.load(getClass().getResource("222.fxml"));
        BorderPane r = new BorderPane();
        r.setCenter(conteck);
        root.getChildren().add(r);

        primaryStage.setTitle("Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
