import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.EventHandler;

import java.io.*;

public class TestVes extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("Press");
        button.setLayoutX(50);
        button.setLayoutY(20);
        Label label = new Label();
        label.setLayoutX(20);
        label.setLayoutY(50);

        TextField textField = new TextField();
        textField.setLayoutX(20);
        textField.setLayoutY(70);
        textField.setText("vv");

        File file = new File("test.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        FileReader fileReader = new FileReader("test.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        label.setText("fgh");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (textField.getText() != "vv") {

                    try {
                        bufferedWriter.write(textField.getText());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        bufferedWriter.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                    try {
                        label.setText(bufferedReader.readLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });


        Group root = new Group();
        root.getChildren().addAll(button, label, textField);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
