package Практические_занятия.Calendar;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dni extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Label l1 = new Label("test");
        l1.setLayoutX(20);
        l1.setLayoutY(20);

        int i = -2;
        int mout = 1;
        int day = 1;

//        LocalDate ld = LocalDate.now();
        LocalDate ld = LocalDate.of(2018, mout, day);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("E, d");
//        System.out.println(ld.format(f));
//        System.out.println(ld.plusDays(i).format(f));
//        System.out.println(ld);
        l1.setText(ld.format(f));

        for (int j = 0; j < 7; j++) {
            if (day-1 <= j) {
                System.out.print(ld.plusDays(j).format(f) + " ");
//                System.out.println(LocalDate.of(2018, mout, day+j));
            }
        }
        System.out.println();
        System.out.println(ld.getDayOfMonth());
        for (int j = 0; j < 7; j++) {
            if (day-1 <= j) {
                System.out.print(ld.plusDays(j).getDayOfMonth() + " ");
            }
        }


        Group root = new Group();

        root.getChildren().addAll(l1);

        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
