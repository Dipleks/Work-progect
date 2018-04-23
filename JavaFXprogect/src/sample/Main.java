package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private Parent parent;

    @Override
    public void start(Stage primaryStage) throws Exception{



        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(rootParent(), 740, 540));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    private Parent rootParent() throws Exception{

        parent = FXMLLoader.load(getClass().getResource("sml.fxml"));

        return parent;
    }
}
