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

import java.io.InvalidObjectException;

public class TestDouble extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        int a = 20;
        final int[] b = {20};
        final int[] i = {0};

        TextField tf = new TextField();
        tf.setLayoutX(100);
        tf.setLayoutY(20);

        Button button = new Button("Next");
        button.setLayoutX(a);
        button.setLayoutY(b[0]);
        button.setPrefSize(50, 20);


        Group root = new Group();

        String file = "D:\\db.data";
        DoublSer doublSer = new DoublSer();

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (b[0] >= 20) {
                    b[0] = 40 + b[0];
                    i[0] = 1 + i[0];
                    Button b2 = new Button();
                    b2.setText(String.valueOf(i[0]));
                    Label l2 = new Label("-----");
                    l2.setLayoutX(a+25);
                    l2.setLayoutY(b[0]);
                    b2.setLayoutX(a);
                    b2.setLayoutY(b[0]);
                    b2.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            l2.setText(tf.getText());
                        }
                    });
                    root.getChildren().add(b2);
                    root.getChildren().add(l2);
                    System.out.println("if" );
                }
            }
        });


        root.getChildren().addAll(button, tf);

        ScrollPane sp = new ScrollPane();
        sp.setContent(root);
        Scene scene = new Scene(sp, 700, 500);
        primaryStage.setTitle("TestDouble");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
