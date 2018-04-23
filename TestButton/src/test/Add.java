package test;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.event.EventHandler;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Add extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("Упр.2");
        button.setLayoutX(50);
        button.setLayoutY(20);
        Label label = new Label();
        label.setLayoutX(55);
        label.setLayoutY(50);

        List<String> list = new ArrayList<>();
        list.add("Упр.1");
        list.add("Упр.2");
        list.add("Упр.3");

        TextField textField = new TextField();
        textField.setLayoutX(20);
        textField.setLayoutY(100);
        textField.setText("vv");

        File file = new File("test.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(list.get(0));
        bufferedWriter.write("\n");
        bufferedWriter.write(list.get(1));
        bufferedWriter.write("\n");
        bufferedWriter.write(list.get(2));
        bufferedWriter.flush();
        bufferedWriter.close();

        FileReader fileReader = new FileReader("test.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //bufferedReader.read();
        label.setText("пусто");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage = new Stage();
                Group group = new Group();
                Scene scene = new Scene(group, 150, 150);
                stage.setScene(scene);
                stage.setResizable(false); //запрещает маштабирование окна
                stage.initModality(Modality.APPLICATION_MODAL); //запрещает работу с главным окном пока активно это окно.
                //stage.showAndWait(); //возращает окно в начально положение при закрытии
                stage.show();

                label.setText(list.get(2));

                System.out.println(textField.getText());
            }
        });

        ToggleGroup group = new ToggleGroup();
        RadioButton radioButton = new RadioButton();
        RadioButton radioButton1 = new RadioButton();
        radioButton.setLayoutX(170);
        radioButton.setLayoutY(10);
        radioButton1.setLayoutX(170);
        radioButton1.setLayoutY(40);
        radioButton.setToggleGroup(group);
        radioButton1.setToggleGroup(group);
        //radioButton.setSelected(true);
        radioButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                label.setText(list.get(1));
                System.out.println(textField.getText());
            }
        });
        radioButton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                label.setText(list.get(0));
                System.out.println(textField.getText());
            }
        });


        Group root = new Group();
        root.getChildren().addAll(button, label, textField, radioButton, radioButton1);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
