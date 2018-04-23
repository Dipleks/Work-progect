package Практические_занятия.Calendar;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.text.DateFormatSymbols;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarP extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


//        DatePicker datePicker = new DatePicker();
//        datePicker.setLayoutX(10);
//        datePicker.setLayoutY(40);
//        System.out.println(datePicker.getUserData());

//        GridPane gridPane = new GridPane();
//        gridPane.setGridLinesVisible(true);
//        gridPane.add(new Label("0x0"), 0, 0);
//        gridPane.add(new Label("0x1"), 0, 1);
//        gridPane.add(new Label("1x1"), 1, 1);
//        gridPane.add(new Label("1x2"), 1, 2);
//        gridPane.add(new Label("5x5"), 5, 5);
//        gridPane.setLayoutX(250);
//        gridPane.setLayoutY(20);
//        ColumnConstraints columnConstraints = new ColumnConstraints();
//        columnConstraints.setPrefWidth(150.0);
//        ColumnConstraints columnConstraints1 = new ColumnConstraints();
//        ColumnConstraints columnConstraints2 = new ColumnConstraints();
//        columnConstraints1.setPercentWidth(20);
//        columnConstraints2.setPrefWidth(150.0);
//        gridPane.getColumnConstraints().addAll(columnConstraints, columnConstraints1, columnConstraints2);

//        GridPane gridPane = new GridPane();
//        gridPane.setGridLinesVisible(true);
//        gridPane.setHgap(20);
//        gridPane.setVgap(10);
//        Button b1 = new Button("1");
//        b1.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                b1.setText(String.valueOf(datePicker.getValue().format(DateTimeFormatter.ofPattern("dd"))));
//            }
//        });
//        gridPane.add(b1, 0, 0);
//        gridPane.add(new Button("2"), 1, 0);
//        gridPane.add(new Button("3"), 2, 0);
//        gridPane.add(new Button("4"), 3, 0);
//        gridPane.add(new Button("5"), 4, 0);
//        gridPane.add(new Button("6"), 5, 0);
//        gridPane.add(new Button("7"), 6, 0);
//        gridPane.add(new Button("8"), 0, 1);
//        gridPane.add(new Button("9"), 1, 1);
//        gridPane.add(new Button("10"), 2, 1);
//        gridPane.add(new Button("11"), 3, 1);
//        gridPane.add(new Button("12"), 4, 1);
//        gridPane.add(new Button("13"), 5, 1);
//        gridPane.add(new Button("14"), 6, 1);
//        gridPane.setLayoutX(250);
//        gridPane.setLayoutY(20);



        Date date = new Date();
//        System.out.println("date: " + date); //выводит сегодняшнию дату

        GregorianCalendar gC = new GregorianCalendar();
        int today = gC.get(Calendar.DAY_OF_MONTH); //сегодняшний день
        int month = gC.get(Calendar.MONTH); //месяц
        gC.set(Calendar.DAY_OF_MONTH, 1); //задаем первый день месяца, т.е DAY_OF_MONTH - число (день), 1 - день недели (Пн)
        int weekday = gC.get(Calendar.DAY_OF_WEEK); //следующий день
        int FirstDayOfWeek = gC.getFirstDayOfWeek(); //первый день недели
//        int in = 0;

//        System.out.println("сегодняшний день: " + today);
//        System.out.println("месяц: " + month);
//        System.out.println("следующий день: " + weekday);
//        System.out.println("первый день недели: " + FirstDayOfWeek);

//        while (weekday != FirstDayOfWeek){
//            in++; //счетчик
//            gC.add(Calendar.DAY_OF_MONTH, -1);
//            weekday = gC.get(Calendar.DAY_OF_WEEK);
//        }

        String[] WeekDayNames = new DateFormatSymbols().getShortWeekdays(); //получаем массив Пн, Вт...
        GridPane gridPanes = new GridPane();

        //Выводим ПН, ВТ...:
        do{

            System.out.printf("%4s", WeekDayNames[weekday]); //%4s -  пробелы между Пн, Вт... (т.е означет, что
            // Пн знимает 4 символа, Вт знамает 4 символа и т.д.)
            gC.add(Calendar.DAY_OF_MONTH, 1); //получаем формат: Пн, Вт, Ср: 1 - Пн, Вт...; 2 - Пн, Ср...
            weekday = gC.get(Calendar.DAY_OF_WEEK); //выводим Пн, Вт...
        } while(weekday != FirstDayOfWeek); //повторяет цикл до тех пор пока weekday не равен FirstDayOfWeek,
        //т.е пн,вт,ср,чт,пт,сб,вс и как только пн повторится цикл остановится!
        System.out.println();

//        for(int i = 1; i<=in; i++)
//            System.out.print("  ");//тут выводит пробелы на первой неделе месяця

        //выводим дни:
        gC.set(Calendar.DAY_OF_MONTH, 1); //день с которого начнется месяц
        do{
            int day = gC.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day); //"%3d" - пробелы между датами

            if(day == today) {
                System.out.print("*"); //Если сегодняшний день равен day то ставим *, в остальных случаях пробел
            } else {
                System.out.print(" ");}
//
            gC.add(Calendar.DAY_OF_MONTH, 1); //выводим дни (1 - каждый день, 2 - каждый 2 день и т.д.)

            //задаем условие, чтобы даты не вывелись в столбик:
            weekday = gC.get(Calendar.DAY_OF_WEEK);
            if (weekday == FirstDayOfWeek)
                System.out.println();
        }
        while(gC.get(Calendar.MONTH) == month);
        //проверяет когда закончится месяц:
        if(weekday != FirstDayOfWeek)
            System.out.println();


        Group group = new Group();
        Scene scene = new Scene(group, 800, 600);

        group.getChildren().addAll();

        primaryStage.setTitle("Calendar");
        primaryStage.setScene(scene);
        primaryStage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }
}
