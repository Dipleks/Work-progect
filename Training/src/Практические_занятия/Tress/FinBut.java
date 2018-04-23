package Практические_занятия.Tress;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FinBut extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        TextField t1 = new TextField();
        t1.setLayoutX(200);
        t1.setLayoutY(20);

        Label l1 = new Label("--------");
        Label l2 = new Label("--------");
        Label l3 = new Label("--------");
        Label l4 = new Label("--------");
        l1.setLayoutX(30);
        l1.setLayoutY(20);
        l2.setLayoutX(30);
        l2.setLayoutY(50);
        l3.setLayoutX(30);
        l3.setLayoutY(80);
        l4.setLayoutX(30);
        l4.setLayoutY(110);

        Button b1 = new Button("Press");
        Button b2 = new Button("Press");
        Button b3 = new Button("Press");
        Button b4 = new Button("Press");
        b1.setLayoutX(150);
        b1.setLayoutY(20);
        b2.setLayoutX(150);
        b2.setLayoutY(50);
        b3.setLayoutX(150);
        b3.setLayoutY(80);
        b4.setLayoutX(150);
        b4.setLayoutY(110);




        Group root = new Group();

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l1.setText(t1.getText());
                root.getChildren().addAll(b2, l2);
            }
        });
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l2.setText(t1.getText());
                root.getChildren().addAll(b3, l3);
            }
        });
        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l3.setText(t1.getText());
                root.getChildren().addAll(b4, l4);
            }
        });
        b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l4.setText(t1.getText());
            }
        });

        root.getChildren().addAll(b1, l1, t1);

        Scene scene = new Scene(root, 700, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
