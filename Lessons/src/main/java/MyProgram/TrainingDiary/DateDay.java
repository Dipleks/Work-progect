package MyProgram.TrainingDiary;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import java.time.format.DateTimeFormatter;

public interface DateDay {
    Label ld1 = new Label("ДД.ММ.ГГГГ");
    Label ld2 = new Label("ДД.ММ.ГГГГ");
    Label ld3 = new Label("ДД.ММ.ГГГГ");
    DatePicker d1 = new DatePicker();
    DatePicker d2 = new DatePicker();
    DatePicker d3 = new DatePicker();

    default Label getLd1() {
        ld1.setLayoutX(50);
        ld1.setLayoutY(46);
        ld1.setTextFill(Color.color(0.5, 0.3, 0.6));
        ld1.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return ld1;
    }
    default DatePicker getD1(){
        d1.setLayoutX(40);
        d1.setLayoutY(55);
        d1.setManaged(false);
        d1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ld1.setText(d1.getValue().format(DateTimeFormatter.ofPattern("EE, dd MMMM uuuu")) + " года");
            }
        });
        return d1;
    }
    default Label getLd2() {
        ld2.setLayoutX(50);
        ld2.setLayoutY(296);
        ld2.setTextFill(Color.color(0.5, 0.3, 0.6));
        ld2.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return ld2;
    }
    default DatePicker getD2(){
        d2.setLayoutX(40);
        d2.setLayoutY(305);
        d2.setManaged(false);
        d2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ld2.setText(d2.getValue().format(DateTimeFormatter.ofPattern("EE, dd MMMM uuuu")) + " года");
            }
        });
        return d2;
    }
    default Label getLd3() {
        ld3.setLayoutX(50);
        ld3.setLayoutY(546);
        ld3.setTextFill(Color.color(0.5, 0.3, 0.6));
        ld3.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return ld3;
    }
    default DatePicker getD3(){
        d3.setLayoutX(40);
        d3.setLayoutY(555);
        d3.setManaged(false);
        d3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ld3.setText(d3.getValue().format(DateTimeFormatter.ofPattern("EE, dd MMMM uuuu")) + " года");
            }
        });
        return d3;
    }
}
