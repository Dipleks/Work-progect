package testArryString;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class TestStarter extends Application{

    public static void main(String[] args) {

        launch(args);
        System.out.println(LestTest.stringList().get(0));
        System.out.println(LestTest.stringList().get(1));
        System.out.println(LestTest.stringList().get(2));

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label label =new Label("RRRRRRRRR");
        label.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (label.getText().equals("RRRRRRRRR")) {
                    label.setText("TTTTTTTTT");
                } else {
                    label.setText("RRRRRRRRR");
                }
            }
        });


        Group root = new Group();
        root.setStyle("-fx-font-size: 28; ");

//        root.getChildren().addAll(LabelTest.getL1(), LabelTest.getL2(), LabelTest.getL3());
        root.getChildren().addAll(label);

        Scene scene = new Scene(root, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
