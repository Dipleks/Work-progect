package Практические_занятия.Table_2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableRun extends Application implements TableData{


    @Override
    public void start(Stage primaryStage) throws Exception {
        textFio.setPromptText("ФИО");
        textDateR.setPromptText("Дата рождения");

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(textFio, textDateR);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(getTable(),hBox);

        Group root = new Group();

        root.getChildren().addAll(vBox);

        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
