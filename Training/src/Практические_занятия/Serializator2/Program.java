package Практические_занятия.Serializator2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.InvalidObjectException;

public class Program extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        TextField textField = new TextField();
        textField.setLayoutX(10);
        textField.setLayoutY(120);

        Label label = new Label();
        label.setLayoutX(10);
        label.setLayoutY(50);
        label.setText("Не задано!");

        DBProg dbProg = new DBProg(label.getText());

        String file = "D:\\dbProg.data";
        SerProgram serProgram = new SerProgram();

        Button button = new Button("Записать новое значение");
        Button button2 = new Button("Получить значение из памяти");
        button.setLayoutX(10);
        button2.setLayoutX(10);
        button.setLayoutY(10);
        button2.setLayoutY(90);

        //записывает в память:
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBProg dbProg = new DBProg(textField.getText());
                boolean b = serProgram.seri(dbProg, file);
                System.out.println(b + "\n-------");
                label.setText(dbProg.toString());
            }
        });

        //читает с памяти:
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBProg rez = null;
                try {
                    rez = serProgram.dser(file);
                } catch (InvalidObjectException e) {
                    e.printStackTrace();
                }
                System.out.println(rez + "\n------");
                label.setText(String.valueOf(rez));
            }

        });


        Group root = new Group();
        root.getChildren().addAll(button, button2, label, textField);
        Scene scene = new Scene(root, 500, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
