package Практические_занятия.MyProg;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.InvalidObjectException;
import java.time.format.DateTimeFormatter;
import static javafx.scene.text.FontWeight.BOLD;

public class WorkWindow extends Application implements Parametrs, MenuDayAndNumber, LebelUpr, ButtonsUpr {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Text text = new Text();
        text.setLayoutX(900);
        text.setLayoutY(50);
        text.setText("Work Window");
        text.setFill(Color.GOLD);
        text.setFont(Font.font(null, BOLD, 40));
        Reflection reflection = new Reflection();
        reflection.setBottomOpacity(0.0);
        reflection.setTopOpacity(0.5);
        reflection.setFraction(0.7);
        text.setEffect(reflection);

//        DatePicker datePicker = new DatePicker();
//        datePicker.setLayoutX(20);
//        datePicker.setLayoutY(10);

        Label l1 = new Label();
        Label l2 = new Label();
        Label l3 = new Label();
        l1.setLayoutX(22);
        l1.setLayoutY(98);
        l1.setText("Выбор даты");
        l1.setTextFill(Color.BROWN);
        l1.setFont(Font.font("Time New Roman", FontWeight.BOLD, 15));
        l2.setLayoutX(22);
        l2.setLayoutY(318);
        l2.setText("Выбор даты");
        l2.setTextFill(Color.BROWN);
        l2.setFont(Font.font("Time New Roman", FontWeight.BOLD, 15));
        l3.setLayoutX(22);
        l3.setLayoutY(538);
        l3.setText("Выбор даты");
        l3.setTextFill(Color.BROWN);
        l3.setFont(Font.font("Time New Roman", FontWeight.BOLD, 15));

//        SaveWorkWindow saveWorkWindow = new SaveWorkWindow(l1.getText());
        String file = "D:\\SF.data";
        String file1 = "D:\\SF1.data";
        String file3 = "D:\\SF3.data";
        String file4 = "D:\\SF4.data";
        String file5 = "D:\\SF5.data";
        String file6 = "D:\\SF6.data";
        String file7 = "D:\\SF7.data";
        String file8 = "D:\\SF8.data";
        String file9 = "D:\\SF9.data";
        String file10 = "D:\\SF10.data";
        SerWork serWork = new SerWork();

        ColorAdjust colorAdjust = new ColorAdjust();
        ColorAdjust colorAdjust1 = new ColorAdjust();
        colorAdjust.setContrast(0.4);
        colorAdjust1.setContrast(5);

        Button openButt = new Button("Open");
        openButt.setLayoutX(20);
        openButt.setLayoutY(10);
        //читает с памяти:
        openButt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SaveL1 rez = null;
                SaveL2 rez1 = null;
                SaveL3 rez3 = null;
                SaveL4 rez4 = null;
                SaveL42 rez42 = null;
                SaveL4_3 rez4_3 = null;
                SaveL4_4 rez4_4 = null;
                SaveL4_5 rez4_5 = null;
                SaveL4_6 rez4_6 = null;
                SaveL4_7 rez4_7 = null;
                try {
                    rez = serWork.dser(file);
                    rez1 = serWork.dser1(file1);
                    rez3 = serWork.dser3(file3);
                    rez4 = serWork.dser4(file4);
                    rez42 = serWork.dser42(file5);
                    rez4_3 = serWork.dser4_3(file6);
                    rez4_4 = serWork.dser4_4(file7);
                    rez4_5 = serWork.dser4_5(file8);
                    rez4_6 = serWork.dser4_6(file9);
                    rez4_7 = serWork.dser4_7(file10);
                } catch (InvalidObjectException e) {
                    e.printStackTrace();
                }
                System.out.println(rez + "\n------" + rez1 + rez3 + rez4);
                l1.setText(String.valueOf(rez));
                l2.setText(String.valueOf(rez1));
                l3.setText(String.valueOf(rez3));
                getLu1().setText(String.valueOf(rez4));
                getLu2().setText(String.valueOf(rez42));
                getLu3().setText(String.valueOf(rez4_3));
                getLu4().setText(String.valueOf(rez4_4));
                getLu5().setText(String.valueOf(rez4_5));
                getLu6().setText(String.valueOf(rez4_6));
                getLu7().setText(String.valueOf(rez4_7));
            }
        });
        //записывает в память:
        Button saveButt = new Button("Save");
        saveButt.setLayoutX(70);
        saveButt.setLayoutY(10);
        saveButt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SaveL1 saveL1 = new SaveL1(l1.getText());
                SaveL2 saveL2 = new SaveL2(l2.getText());
                SaveL3 saveL3 = new SaveL3(l3.getText());
                SaveL4 saveL4 = new SaveL4(lu1.getText());
                SaveL42 saveL42 = new SaveL42(lu2.getText());
                SaveL4_3 saveL4_3 = new SaveL4_3(lu3.getText());
                SaveL4_4 saveL4_4 = new SaveL4_4(lu4.getText());
                SaveL4_5 saveL4_5 = new SaveL4_5(lu5.getText());
                SaveL4_6 saveL4_6 = new SaveL4_6(lu6.getText());
                SaveL4_7 saveL4_7 = new SaveL4_7(lu7.getText());
                boolean b = serWork.seri(saveL1, file);
                boolean b11 = serWork.seri1(saveL2, file1);
                boolean b13 = serWork.seri3(saveL3, file3);
                boolean b14 = serWork.seri4(saveL4, file4);
                boolean b15 = serWork.seri42(saveL42, file5);
                boolean b16 = serWork.seri4_3(saveL4_3, file6);
                boolean b17 = serWork.seri4_4(saveL4_4, file7);
                boolean b18 = serWork.seri4_5(saveL4_5, file8);
                boolean b19 = serWork.seri4_6(saveL4_6, file9);
                boolean b110 = serWork.seri4_7(saveL4_7, file10);
                System.out.println(b + "\n-------" + b11 + b13 + b14 + b15);
            }
        });

        DatePicker b1 = new DatePicker();
        b1.setLayoutX(20);
        b1.setLayoutY(108);
        b1.setManaged(false);
        b1.setEffect(colorAdjust);
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l1.setText(String.valueOf(b1.getValue().format(DateTimeFormatter.ofPattern("dd MMMM uuuu"))) + " года");
            }
        });
        DatePicker b2 = new DatePicker();
        b2.setLayoutX(20);
        b2.setLayoutY(328);
        b2.setManaged(false);
        b2.setEffect(colorAdjust);
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l2.setText(String.valueOf(b2.getValue().format(DateTimeFormatter.ofPattern("dd MMMM uuuu"))) + " года");
            }
        });
        DatePicker b3 = new DatePicker();
        b3.setLayoutX(20);
        b3.setLayoutY(548);
        b3.setManaged(false);
        b3.setEffect(colorAdjust);
        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                l3.setText(String.valueOf(b3.getValue().format(DateTimeFormatter.ofPattern("dd MMMM uuuu"))) + " года");
            }
        });

        Group root = new Group();
        root.getChildren().addAll(text, l1, l2, l3, b1, b2, b3, openButt, saveButt, getTextField(),
                getLu1(), getLu2(), getLu3(), getLu4(), getLu5(), getLu6(), getLu7(), getBu1(), getBu2(), getBu3(),
                getBu4(), getBu5(), getBu6(), getBu7());

        Scene scene = new Scene(root,1200,800, Color.DARKSEAGREEN);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Work Window");
        primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}
