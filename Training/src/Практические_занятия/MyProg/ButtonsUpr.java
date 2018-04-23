package Практические_занятия.MyProg;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public interface ButtonsUpr extends LebelUpr {
    Button bu1 = new Button();
    Button bu2 = new Button();
    Button bu3 = new Button();
    Button bu4 = new Button();
    Button bu5 = new Button();
    Button bu6 = new Button();
    Button bu7 = new Button();
    ColorAdjust colorAdjust = new ColorAdjust();

    default Button getBu1() {
        bu1.setText("1");
        bu1.setLayoutX(5);
        bu1.setLayoutY(123);
        bu1.setMaxHeight(15);
        bu1.setMaxWidth(15);
        bu1.setMinHeight(25);
        bu1.setMinWidth(25);
//        colorAdjust.setContrast(0.0); //контраст кнопки
        colorAdjust.setHue(0.8); //цвет оконтовки
        colorAdjust.setBrightness(0.0); //прозрачность
        colorAdjust.setSaturation(0.6); //цвет кнопки
        bu1.setEffect(colorAdjust);
        bu1.setShape(new Circle(0.5)); //форма кнопки
        bu1.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        bu1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getLu1().setText(textField.getText());
            }
        });
        return bu1;
    }
    default Button getBu2() {
        bu2.setText("2");
        bu2.setLayoutX(5);
        bu2.setLayoutY(148);
        bu2.setMaxHeight(15);
        bu2.setMaxWidth(15);
        bu2.setMinHeight(25);
        bu2.setMinWidth(25);
//        colorAdjust.setContrast(0.0); //контраст кнопки
        colorAdjust.setHue(0.8); //цвет оконтовки
        colorAdjust.setBrightness(0.0); //прозрачность
        colorAdjust.setSaturation(0.6); //цвет кнопки
        bu2.setEffect(colorAdjust);
        bu2.setShape(new Circle(0.5)); //форма кнопки
        bu2.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        bu2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getLu2().setText(textField.getText());
            }
        });
        return bu2;
    }
    default Button getBu3() {
        bu3.setText("3");
        bu3.setLayoutX(5);
        bu3.setLayoutY(173);
        bu3.setMaxHeight(15);
        bu3.setMaxWidth(15);
        bu3.setMinHeight(25);
        bu3.setMinWidth(25);
//        colorAdjust.setContrast(0.0); //контраст кнопки
        colorAdjust.setHue(0.8); //цвет оконтовки
        colorAdjust.setBrightness(0.0); //прозрачность
        colorAdjust.setSaturation(0.6); //цвет кнопки
        bu3.setEffect(colorAdjust);
        bu3.setShape(new Circle(0.5)); //форма кнопки
        bu3.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        bu3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getLu3().setText(textField.getText());
            }
        });
        return bu3;
    }
    default Button getBu4() {
        bu4.setText("4");
        bu4.setLayoutX(5);
        bu4.setLayoutY(198);
        bu4.setMaxHeight(15);
        bu4.setMaxWidth(15);
        bu4.setMinHeight(25);
        bu4.setMinWidth(25);
//        colorAdjust.setContrast(0.0); //контраст кнопки
        colorAdjust.setHue(0.8); //цвет оконтовки
        colorAdjust.setBrightness(0.0); //прозрачность
        colorAdjust.setSaturation(0.6); //цвет кнопки
        bu4.setEffect(colorAdjust);
        bu4.setShape(new Circle(0.5)); //форма кнопки
        bu4.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        bu4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getLu4().setText(textField.getText());
            }
        });
        return bu4;
    }
    default Button getBu5() {
        bu5.setText("5");
        bu5.setLayoutX(5);
        bu5.setLayoutY(223);
        bu5.setMaxHeight(15);
        bu5.setMaxWidth(15);
        bu5.setMinHeight(25);
        bu5.setMinWidth(25);
//        colorAdjust.setContrast(0.0); //контраст кнопки
        colorAdjust.setHue(0.8); //цвет оконтовки
        colorAdjust.setBrightness(0.0); //прозрачность
        colorAdjust.setSaturation(0.6); //цвет кнопки
        bu5.setEffect(colorAdjust);
        bu5.setShape(new Circle(0.5)); //форма кнопки
        bu5.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        bu5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getLu5().setText(textField.getText());
            }
        });
        return bu5;
    }
    default Button getBu6() {
        bu6.setText("6");
        bu6.setLayoutX(5);
        bu6.setLayoutY(248);
        bu6.setMaxHeight(15);
        bu6.setMaxWidth(15);
        bu6.setMinHeight(25);
        bu6.setMinWidth(25);
//        colorAdjust.setContrast(0.0); //контраст кнопки
        colorAdjust.setHue(0.8); //цвет оконтовки
        colorAdjust.setBrightness(0.0); //прозрачность
        colorAdjust.setSaturation(0.6); //цвет кнопки
        bu6.setEffect(colorAdjust);
        bu6.setShape(new Circle(0.5)); //форма кнопки
        bu6.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        bu6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getLu6().setText(textField.getText());
            }
        });
        return bu6;
    }
    default Button getBu7() {
        bu7.setText("7");
        bu7.setLayoutX(5);
        bu7.setLayoutY(273);
        bu7.setMaxHeight(15);
        bu7.setMaxWidth(15);
        bu7.setMinHeight(25);
        bu7.setMinWidth(25);
//        colorAdjust.setContrast(0.0); //контраст кнопки
        colorAdjust.setHue(0.8); //цвет оконтовки
        colorAdjust.setBrightness(0.0); //прозрачность
        colorAdjust.setSaturation(0.6); //цвет кнопки
        bu7.setEffect(colorAdjust);
        bu7.setShape(new Circle(0.5)); //форма кнопки
        bu7.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        bu7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getLu7().setText(textField.getText());
            }
        });
        return bu7;
    }
}
