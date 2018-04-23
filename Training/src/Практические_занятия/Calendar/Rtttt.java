package Практические_занятия.Calendar;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Rtttt extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(Calendar.DAY_OF_MONTH, 1);
        int today = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
        int month = gregorianCalendar.get(Calendar.MONTH);
        int weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
        int fDay = gregorianCalendar.getFirstDayOfWeek();

        int a = 0;
        int b = 0;

        String[] weekdayName = new DateFormatSymbols().getShortWeekdays();
//        for (String o : weekdayName) {
//            System.out.println(o);
//            System.out.println(weekdayName[1]);
//        }
//        System.out.println(weekdayName[1]);
//        for (int i = 1; i < 9; i++) {
//            System.out.println(weekdayName[i]);
//        }

        int addB = 7;
        int addB1 = 33;
        int X = 10;
        int X1 = 10;
        int Y = 10;
        Button[] buttons = new Button[addB];
        Button[] buttons1 = new Button[addB1];

        for (int i = 0; i < 7; i++) {
                X = 40 + X;
                buttons[i] = new Button();
                buttons[i].setLayoutX(X);
                buttons[i].setLayoutY(Y);
                weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
                gregorianCalendar.add(Calendar.DAY_OF_MONTH, 1);
                buttons[i].setText(String.valueOf(weekdayName[weekday]));

        }

        gregorianCalendar.set(Calendar.DAY_OF_MONTH, 1);
        gregorianCalendar.set(Calendar.DATE, 1);
        int date = gregorianCalendar.get(Calendar.DATE);
        int daynedeli = 3;

        for (int i = 0; i < 33; i++) {
            int r = date + i;
            if (r >= daynedeli && r < 8 ) {
                X1 = X1 + 40;
                buttons1[i] = new Button();
                buttons1[i].setLayoutX(X1);
                buttons1[i].setLayoutY(Y);
                buttons1[i].setText(String.valueOf(date + r - daynedeli));
            } else if (r > 7 && r < 15){
                X1 = X1 + 40;
                Y = 40;
                buttons1[i] = new Button();
                buttons1[i].setLayoutX(X1-280);
                buttons1[i].setLayoutY(Y);
                buttons1[i].setText(String.valueOf(date + r - daynedeli));
            } else if (r > 14 && r < 22){
                X1 = X1 + 40;
                Y = 70;
                buttons1[i] = new Button();
                buttons1[i].setLayoutX(X1 - 560);
                buttons1[i].setLayoutY(Y);
                buttons1[i].setText(String.valueOf(date + r - daynedeli));
            } else if (r > 21 && r < 29){
                X1 = X1 + 40;
                Y = 100;
                buttons1[i] = new Button();
                buttons1[i].setLayoutX(X1 - 840);
                buttons1[i].setLayoutY(Y);
                buttons1[i].setText(String.valueOf(date + r - daynedeli));
            } else if (r > 28 && r < 34){
                X1 = X1 + 40;
                Y = 130;
                buttons1[i] = new Button();
                buttons1[i].setLayoutX(X1 - 1120);
                buttons1[i].setLayoutY(Y);
                buttons1[i].setText(String.valueOf(date + r - daynedeli));
            }
            else {
                X1 = X1 + 40;
                Y = 10;
                buttons1[i] = new Button();
                buttons1[i].setLayoutX(X1);
                buttons1[i].setLayoutY(Y);
                buttons1[i].setText(" ");
            }
        }

        ColorAdjust color = new ColorAdjust();
        color.setContrast(1);

        Pane pane = new Pane();
        pane.setLayoutX(10);
        pane.setLayoutY(20);
        pane.getChildren().addAll(buttons);
        pane.setEffect(color);

        Pane pane1 = new Pane();
        pane1.setLayoutX(10);
        pane1.setLayoutY(50);
        pane1.getChildren().addAll(buttons1);
        pane1.setEffect(color);

        Label label = new Label();
        label.setText("Test");
        label.setLayoutX(10);
        label.setLayoutY(20);

        Group root = new Group();

        root.getChildren().addAll(label, pane, pane1);

        Scene scene = new Scene(root, 800, 500, Color.DARKSEAGREEN);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
