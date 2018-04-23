package Практические_занятия.December_29;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

interface WindowTwo {
    Label l1 = new Label();
    Label l2 = new Label();
    Label l3 = new Label();
    String[] str = new String[10];

    default void showTwo (){

        Button button = new Button("Упражнение 1");
        button.setLayoutX(10);
        button.setLayoutY(10);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l1.setText(str[1]);
            }
        });
        Button button1 = new Button("Упражнение 2");
        button1.setLayoutX(10);
        button1.setLayoutY(40);
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l1.setText(str[2]);
            }
        });
        Button button2 = new Button("Упражнение 3");
        button2.setLayoutX(10);
        button2.setLayoutY(70);
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l1.setText(str[3]);
            }
        });

        Button button3 = new Button("Упражнение 1");
        button3.setLayoutX(110);
        button3.setLayoutY(10);
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l2.setText(str[1]);
            }
        });
        Button button4 = new Button("Упражнение 2");
        button4.setLayoutX(110);
        button4.setLayoutY(40);
        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l2.setText(str[2]);
            }
        });
        Button button5 = new Button("Упражнение 3");
        button5.setLayoutX(110);
        button5.setLayoutY(70);
        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l2.setText(str[3]);
            }
        });

        Button button6 = new Button("Упражнение 1");
        button6.setLayoutX(210);
        button6.setLayoutY(10);
        button6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l3.setText(str[1]);
            }
        });
        Button button7 = new Button("Упражнение 2");
        button7.setLayoutX(210);
        button7.setLayoutY(40);
        button7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l3.setText(str[2]);
            }
        });
        Button button8 = new Button("Упражнение 3");
        button8.setLayoutX(210);
        button8.setLayoutY(70);
        button8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l3.setText(str[3]);
            }
        });

        Stage stage = new Stage();
        Group group = new Group();
        Scene scene = new Scene(group, 350, 250);

        group.getChildren().addAll(button, button1, button2, button3, button4, button5, button6, button7, button8);

        stage.setTitle("WindowTwo");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

}
