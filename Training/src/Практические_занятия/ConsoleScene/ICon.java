package Практические_занятия.ConsoleScene;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public interface ICon {

    default void save () throws IOException {

        String[] str = new String[10];

        FileReader fileReader = new FileReader("FileTest.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.read();

        str[0] = bufferedReader.readLine();
        str[1] = bufferedReader.readLine();
        str[2] = bufferedReader.readLine();
        str[3] = bufferedReader.readLine();
        str[4] = bufferedReader.readLine();
        str[5] = bufferedReader.readLine();

        System.out.println(str[3]/* +" "+ str[1]*/);

        Label l1 = new Label();
        Label l2 = new Label();
        Label l3 = new Label();
        l1.setText("задать упражнение");
        l1.setLayoutX(15);
        l1.setLayoutY(15);
        l2.setText("задать упражнение");
        l2.setLayoutX(15);
        l2.setLayoutY(45);
        l3.setText("задать упражнение");
        l3.setLayoutX(15);
        l3.setLayoutY(75);

        Button b1 = new Button();
        Button b2 = new Button();
        Button b3 = new Button();
        b1.setText("+");
        b1.setLayoutX(135);
        b1.setLayoutY(10);
        b2.setText("+");
        b2.setLayoutX(135);
        b2.setLayoutY(40);
        b3.setText("+");
        b3.setLayoutX(135);
        b3.setLayoutY(70);
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l1.setText(str[1]);
            }
        });
    }
}
