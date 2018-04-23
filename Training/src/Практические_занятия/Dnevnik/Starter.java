package Практические_занятия.Dnevnik;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Starter extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        DatePicker dP = new DatePicker();
        dP.setLayoutX(30);
        dP.setLayoutY(130);


        //Цветовые эффекты:
        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setContrast(0.4); //контраст кнопки
        colorAdjust.setHue(0.3); //цвет оконтовки
        colorAdjust.setBrightness(0.5); //прозрачность
        colorAdjust.setSaturation(0.3); //цвет кнопки

        //Эффект отражения:
        Text text = new Text();
        text.setLayoutX(165);
        text.setLayoutY(50);
        text.setText("Hello, Denis");
        text.setFill(Color.DARKSEAGREEN);
        text.setFont(Font.font(null, FontWeight.BOLD, 40));
        //создадим эффект:
        Reflection reflection = new Reflection();
        reflection.setBottomOpacity(0.0);
        reflection.setTopOpacity(0.5);
        reflection.setFraction(0.7);
        text.setEffect(reflection);

        Button button = new Button("Test");
        button.setLayoutX(10);
        button.setLayoutY(40);
        button.setEffect(colorAdjust);


        TextField textField = new TextField();
        textField.setLayoutX(10);
        textField.setLayoutY(70);

        LocalDate localDate = LocalDate.now();


        Label label = new Label();
        label.setLayoutX(10);
        label.setLayoutY(10);
        label.setText(String.valueOf(LocalDate.now().format(DateTimeFormatter.ofPattern("dd MMMM uuuu"))));

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
//                label.setText(String.valueOf(LocalDate.now().plusDays(Long.parseLong(textField.getText())).format(DateTimeFormatter.ofPattern("dd MMMM uuuu"))));
                label.setText(String.valueOf(dP.getValue().format(DateTimeFormatter.ofPattern("dd MMMM uuuu"))));
            }
        });

        if (localDate.getDayOfMonth() <= 31) {
            for (int i = 0; i < 3; i++) {
                //label.setText(String.valueOf(localDate.plusDays(i).getDayOfMonth()));
                System.out.println("Date: " + localDate.plusDays(i).getDayOfMonth());
            }
        }



        Group root = new Group();
//        root.setEffect(colorAdjust); //можно применить эффеткы ко всем объектам сразу
        root.getChildren().addAll(label, button, textField, text, dP);
        Scene scene = new Scene(root, 600, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Органайзер");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
