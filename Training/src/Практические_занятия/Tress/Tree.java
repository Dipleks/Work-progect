package Практические_занятия.Tress;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Tree extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        int x = 20;
        int y = 20;

        Label l1 = new Label("l1");
        l1.setLayoutX(x);
        l1.setLayoutY(y);

        Button b1 = new Button("next");
        b1.setLayoutX(x+40);
        b1.setLayoutY(y);
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l1.setLayoutX(x);
                l1.setLayoutY(y+x);
                b1.setLayoutX(x+40);
                b1.setLayoutY(y+x);
            }
        });







        Group root = new Group();

        Button b2 = new Button("scr");
        b2.setPrefSize(100, 30);
        TextField textField = new TextField();
        textField.setPrefSize(500, 300);
        textField.setLayoutX(100);
        textField.setLayoutY(100);
        ScrollPane scrollPane = new ScrollPane();


        root.getChildren().addAll(l1, b1, b2, textField);
        scrollPane.setContent(root);

        Scene scene = new Scene(scrollPane, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello Test");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
