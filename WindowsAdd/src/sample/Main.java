package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    private Scene scene = new Scene(root, 700, 600);


    public Main() throws IOException {
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Hello World");


        Root.stage1 = primaryStage;




        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
