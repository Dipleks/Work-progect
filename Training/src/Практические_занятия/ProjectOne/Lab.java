package Практические_занятия.ProjectOne;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;

public class Lab extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        TextField tf = new TextField();
        tf.setLayoutX(150);
        tf.setLayoutY(20);

        Label l1 = new Label("test");
        l1.setLayoutX(150);
        l1.setLayoutY(60);

        String saveLabFile = "C:\\Lab.data";
        Ser serializableLab = new Ser();

        Button open = new Button("Open");
        open.setLayoutX(40);
        open.setLayoutY(10);
        //читает с памяти:
        open.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                S s = null;
                try {
                    s = serializableLab.diserializabl(saveLabFile);
                } catch (InvalidObjectException e) {
                    e.printStackTrace();
                }
                System.out.println(s + "\n------");
                l1.setText(String.valueOf(s));
            }
        });
        //записывает в память:
        Button save = new Button("Save");
        save.setLayoutX(40);
        save.setLayoutY(50);
        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                S s = new S(l1.getText());
                boolean b = serializableLab.serializabl(s, saveLabFile);
                System.out.println(b + "\n-------");
            }
        });
        Button b1 = new Button("++");
        b1.setLayoutX(40);
        b1.setLayoutY(90);
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l1.setText(tf.getText());
            }
        });


        Group root = new Group();
        root.getChildren().addAll(tf, l1, open, save, b1);

        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

