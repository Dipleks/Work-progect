package Практические_занятия.CalendarTwo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestCalTwo extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        DateCell dateCell = new DateCell();
        dateCell.setLayoutX(20);
        dateCell.setLayoutY(20);
        dateCell.setMaxHeight(50);
        dateCell.setMaxWidth(50);
        dateCell.updateItem(LocalDate.now(), true);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("E, d");

        Label label = new Label();
        label.setText("wert");
        label.setLayoutX(20);
        label.setLayoutY(20);

        DatePicker datePicker = new DatePicker();
        datePicker.setLayoutX(150);
        datePicker.setLayoutY(20);
        datePicker.setShowWeekNumbers(true); //номер недели
//        datePicker.setDisable(true); //делает недоступным datepicker
        datePicker.setManaged(false); //убирает текстовое поле оставляя одну иконку
        datePicker.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(String.valueOf(datePicker.getValue().format(f)));
            }
        });

        Group root = new Group();
        root.getChildren().addAll(label, datePicker);
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("CalTest");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
