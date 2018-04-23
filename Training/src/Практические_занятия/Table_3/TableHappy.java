package Практические_занятия.Table_3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableHappy extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Window1 window1 = new Window1();
        Button b1 = new Button("1");
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                window1.getPrimaryStage1();
            }
        });
        Button b2 = new Button("2");


        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(b1, b2);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(hBox);

        Group group = new Group();

        group.getChildren().addAll(vBox);

        Scene scene1 = new Scene(group, 800, 500);
        primaryStage.setScene(scene1);
        primaryStage.show();

    }

    public static void main(String[] args) {
                launch(args);
    }
}
