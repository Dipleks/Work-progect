package Практические_занятия.TestChoiBox;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PanelSc extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        ChoiceBox choiceBox = new ChoiceBox();
        choiceBox.setItems(FXCollections.observableArrayList("One", "Two", "Three"));

        Color[] colors = new Color[]{Color.BROWN, Color.GOLD, Color.GREEN};

        Rectangle rectangle = new Rectangle(200, 200, Color.WHEAT);
        rectangle.setLayoutX(70);
        rectangle.setLayoutY(70);

        choiceBox.getSelectionModel().selectedIndexProperty().addListener(
                (ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
                    rectangle.setFill(colors[new_val.intValue()]);
                }
        );


        Group root = new Group();
        root.getChildren().addAll(choiceBox, rectangle);
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
