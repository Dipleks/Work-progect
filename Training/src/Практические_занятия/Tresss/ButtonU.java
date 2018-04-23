package Практические_занятия.Tresss;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public interface ButtonU extends GroupRoot{
    TextField t1 = new TextField();
    Button b1 = new Button();
    Button b2 = new Button();
    Button b3 = new Button();
    Button b4 = new Button();
    Button b5 = new Button();
    Button b6 = new Button();
    Button b7 = new Button();
    Button b8 = new Button();
    Button b9 = new Button();
    Button b10 = new Button();
    Button b11 = new Button();
    Button b12 = new Button();
    Button b13 = new Button();
    Button b14 = new Button();
    Button b15 = new Button();
    Button b16 = new Button();
    Button b17 = new Button();
    Button b18 = new Button();
    Button b19 = new Button();
    Button b20 = new Button();
    Button b21 = new Button();
    Label l1 = new Label();
    Label l2 = new Label();
    Label l3 = new Label();
    Label l4 = new Label();
    Label l5 = new Label();
    Label l6 = new Label();
    Label l7 = new Label();
    Label l8 = new Label();
    Label l9 = new Label();
    Label l10 = new Label();
    Label l11 = new Label();
    Label l12 = new Label();
    Label l13 = new Label();
    Label l14 = new Label();
    Label l15 = new Label();
    Label l16 = new Label();
    Label l17 = new Label();
    Label l18 = new Label();
    Label l19 = new Label();
    Label l20 = new Label();
    Label l21 = new Label();
    ColorAdjust colorAdjust = new ColorAdjust();
    Color color = Color.GOLD;
    DropShadow dropShadow = new DropShadow();

    default TextField getT1 () {
        t1.setLayoutX(10);
        t1.setLayoutY(10);
        return t1;
    }
    default ColorAdjust getColorAdjust() {
        colorAdjust.setHue(0.8); //цвет оконтовки
        colorAdjust.setBrightness(0.0); //прозрачность
        colorAdjust.setSaturation(0.5); //цвет кнопки
        return colorAdjust;
    }
    default DropShadow getDropShadow (){
        dropShadow.setRadius(2.0);
        dropShadow.setOffsetX(6.0);
        dropShadow.setOffsetY(5.0);
        dropShadow.setColor(Color.color(0.4, 0.5, 0.5));
        return dropShadow;
    }

    default Button getB1 (){
        b1.setLayoutX(10);
        b1.setLayoutY(70);
        b1.setText("1");
//        b1.setTextFill(Color.GOLD); //цвет текста
        b1.setShape(new Circle(0.5));
        b1.setEffect(getColorAdjust());
        b1.setFocusTraversable(false); //снимает фокусировку кнопки
        b1.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l1.getText() == "--------------") {
                    getL1().setText(getT1().getText());
                    root.getChildren().addAll(getB2(), getL2());
                } else {
                    getL1().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b1;
    }
    default Label getL1() {
        l1.setLayoutX(40);
        l1.setLayoutY(70);
        l1.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l1.setText("--------------");
        return l1;
    }
    default Button getB2 (){
        b2.setLayoutX(10);
        b2.setLayoutY(100);
        b2.setText("2");
        b2.setShape(new Circle(0.5));
        b2.setEffect(getColorAdjust());
        b2.setFocusTraversable(false); //снимает фокусировку кнопки
        b2.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l2.getText() == "--------------") {
                    getL2().setText(getT1().getText());
                    root.getChildren().addAll(getB3(), getL3());
                } else {
                    getL2().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b2;
    }
    default Label getL2() {
        l2.setLayoutX(40);
        l2.setLayoutY(100);
        l2.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l2.setText("--------------");
        return l2;
    }
    default Button getB3 (){
        b3.setLayoutX(10);
        b3.setLayoutY(130);
        b3.setText("3");
        b3.setShape(new Circle(0.5));
        b3.setEffect(getColorAdjust());
        b3.setFocusTraversable(false); //снимает фокусировку кнопки
        b3.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l3.getText() == "--------------") {
                    getL3().setText(getT1().getText());
                    root.getChildren().addAll(getB4(), getL4());
                } else {
                    getL3().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b3;
    }
    default Label getL3() {
        l3.setLayoutX(40);
        l3.setLayoutY(130);
        l3.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l3.setText("--------------");
        return l3;
    }
    default Button getB4 (){
        b4.setLayoutX(10);
        b4.setLayoutY(160);
        b4.setText("4");
        b4.setShape(new Circle(0.5));
        b4.setEffect(getColorAdjust());
        b4.setFocusTraversable(false); //снимает фокусировку кнопки
        b4.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l4.getText() == "--------------") {
                    getL4().setText(getT1().getText());
                    root.getChildren().addAll(getB5(), getL5());
                } else {
                    getL4().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b4;
    }
    default Label getL4() {
        l4.setLayoutX(40);
        l4.setLayoutY(160);
        l4.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l4.setText("--------------");
        return l4;
    }
    default Button getB5 (){
        b5.setLayoutX(10);
        b5.setLayoutY(190);
        b5.setText("5");
        b5.setShape(new Circle(0.5));
        b5.setEffect(getColorAdjust());
        b5.setFocusTraversable(false); //снимает фокусировку кнопки
        b5.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l5.getText() == "--------------") {
                    getL5().setText(getT1().getText());
                    root.getChildren().addAll(getB6(), getL6());
                } else {
                    getL5().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b5;
    }
    default Label getL5() {
        l5.setLayoutX(40);
        l5.setLayoutY(190);
        l5.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l5.setText("--------------");
        return l5;
    }
    default Button getB6 (){
        b6.setLayoutX(10);
        b6.setLayoutY(220);
        b6.setText("6");
        b6.setShape(new Circle(0.5));
        b6.setEffect(getColorAdjust());
        b6.setFocusTraversable(false); //снимает фокусировку кнопки
        b6.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l6.getText() == "--------------") {
                    getL6().setText(getT1().getText());
                    root.getChildren().addAll(getB7(), getL7());
                } else {
                    getL6().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b6;
    }
    default Label getL6() {
        l6.setLayoutX(40);
        l6.setLayoutY(220);
        l6.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l6.setText("--------------");
        return l6;
    }
    default Button getB7 (){
        b7.setLayoutX(10);
        b7.setLayoutY(250);
        b7.setText("7");
        b7.setShape(new Circle(0.5));
        b7.setEffect(getColorAdjust());
        b7.setFocusTraversable(false); //снимает фокусировку кнопки
        b7.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getL7().setText(getT1().getText());
            }
        });
        return b7;
    }
    default Label getL7() {
        l7.setLayoutX(40);
        l7.setLayoutY(250);
        l7.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l7.setText("--------------");
        return l7;
    }
    //////////
    default Button getB8 (){
        b8.setLayoutX(10);
        b8.setLayoutY(320);
        b8.setText("1");
        b8.setShape(new Circle(0.5));
        b8.setEffect(getColorAdjust());
        b8.setFocusTraversable(false); //снимает фокусировку кнопки
        b8.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l8.getText() == "--------------" ) {
                    getL8().setText(getT1().getText());
                    root.getChildren().addAll(getB9(), getL9());
                } else {
                    getL8().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b8;
    }
    default Label getL8() {
        l8.setLayoutX(40);
        l8.setLayoutY(320);
        l8.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l8.setText("--------------");
        return l8;
    }
    default Button getB9 (){
        b9.setLayoutX(10);
        b9.setLayoutY(350);
        b9.setText("2");
        b9.setShape(new Circle(0.5));
        b9.setEffect(getColorAdjust());
        b9.setFocusTraversable(false); //снимает фокусировку кнопки
        b9.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l9.getText() == "--------------") {
                    getL9().setText(getT1().getText());
                    root.getChildren().addAll(getB10(), getL10());
                } else {
                    getL9().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b9;
    }
    default Label getL9() {
        l9.setLayoutX(40);
        l9.setLayoutY(350);
        l9.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l9.setText("--------------");
        return l9;
    }
    default Button getB10 (){
        b10.setLayoutX(10);
        b10.setLayoutY(380);
        b10.setText("3");
        b10.setShape(new Circle(0.5));
        b10.setEffect(getColorAdjust());
        b10.setFocusTraversable(false); //снимает фокусировку кнопки
        b10.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l10.getText() == "--------------") {
                    getL10().setText(getT1().getText());
                    root.getChildren().addAll(getB11(), getL11());
                } else {
                    getL10().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b10;
    }
    default Label getL10() {
        l10.setLayoutX(40);
        l10.setLayoutY(380);
        l10.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l10.setText("--------------");
        return l10;
    }
    default Button getB11 (){
        b11.setLayoutX(10);
        b11.setLayoutY(410);
        b11.setText("4");
        b11.setShape(new Circle(0.5));
        b11.setEffect(getColorAdjust());
        b11.setFocusTraversable(false); //снимает фокусировку кнопки
        b11.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l11.getText() == "--------------") {
                    getL11().setText(getT1().getText());
                    root.getChildren().addAll(getB12(), getL12());
                } else {
                    getL11().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b11;
    }
    default Label getL11() {
        l11.setLayoutX(40);
        l11.setLayoutY(410);
        l11.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l11.setText("--------------");
        return l11;
    }
    default Button getB12 (){
        b12.setLayoutX(10);
        b12.setLayoutY(440);
        b12.setText("5");
        b12.setShape(new Circle(0.5));
        b12.setEffect(getColorAdjust());
        b12.setFocusTraversable(false); //снимает фокусировку кнопки
        b12.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l12.getText() == "--------------") {
                    getL12().setText(getT1().getText());
                    root.getChildren().addAll(getB13(), getL13());
                } else {
                    getL12().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b12;
    }
    default Label getL12() {
        l12.setLayoutX(40);
        l12.setLayoutY(440);
        l12.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l12.setText("--------------");
        return l12;
    }
    default Button getB13 (){
        b13.setLayoutX(10);
        b13.setLayoutY(470);
        b13.setText("6");
        b13.setShape(new Circle(0.5));
        b13.setEffect(getColorAdjust());
        b13.setFocusTraversable(false); //снимает фокусировку кнопки
        b13.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l13.getText() == "--------------") {
                    getL13().setText(getT1().getText());
                    root.getChildren().addAll(getB14(), getL14());
                } else {
                    getL13().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b13;
    }
    default Label getL13() {
        l13.setLayoutX(40);
        l13.setLayoutY(470);
        l13.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l13.setText("--------------");
        return l13;
    }
    default Button getB14 (){
        b14.setLayoutX(10);
        b14.setLayoutY(500);
        b14.setText("7");
        b14.setShape(new Circle(0.5));
        b14.setEffect(getColorAdjust());
        b14.setFocusTraversable(false); //снимает фокусировку кнопки
        b14.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getL14().setText(getT1().getText());
            }
        });
        return b14;
    }
    default Label getL14() {
        l14.setLayoutX(40);
        l14.setLayoutY(500);
        l14.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l14.setText("--------------");
        return l14;
    }
    //////////
    default Button getB15 (){
        b15.setLayoutX(10);
        b15.setLayoutY(570);
        b15.setText("1");
        b15.setShape(new Circle(0.5));
        b15.setEffect(getColorAdjust());
        b15.setFocusTraversable(false); //снимает фокусировку кнопки
        b15.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l15.getText() == "--------------" ) {
                    getL15().setText(getT1().getText());
                    root.getChildren().addAll(getB16(), getL16());
                } else {
                    getL15().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b15;
    }
    default Label getL15() {
        l15.setLayoutX(40);
        l15.setLayoutY(570);
        l15.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l15.setText("--------------");
        return l15;
    }
    default Button getB16 (){
        b16.setLayoutX(10);
        b16.setLayoutY(600);
        b16.setText("2");
        b16.setShape(new Circle(0.5));
        b16.setEffect(getColorAdjust());
        b16.setFocusTraversable(false); //снимает фокусировку кнопки
        b16.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b16.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l16.getText() == "--------------") {
                    getL16().setText(getT1().getText());
                    root.getChildren().addAll(getB17(), getL17());
                } else {
                    getL16().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b16;
    }
    default Label getL16() {
        l16.setLayoutX(40);
        l16.setLayoutY(600);
        l16.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l16.setText("--------------");
        return l16;
    }
    default Button getB17 (){
        b17.setLayoutX(10);
        b17.setLayoutY(630);
        b17.setText("3");
        b17.setShape(new Circle(0.5));
        b17.setEffect(getColorAdjust());
        b17.setFocusTraversable(false); //снимает фокусировку кнопки
        b17.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b17.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l17.getText() == "--------------") {
                    getL17().setText(getT1().getText());
                    root.getChildren().addAll(getB18(), getL18());
                } else {
                    getL17().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b17;
    }
    default Label getL17() {
        l17.setLayoutX(40);
        l17.setLayoutY(630);
        l17.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l17.setText("--------------");
        return l17;
    }
    default Button getB18 (){
        b18.setLayoutX(10);
        b18.setLayoutY(660);
        b18.setText("4");
        b18.setShape(new Circle(0.5));
        b18.setEffect(getColorAdjust());
        b18.setFocusTraversable(false); //снимает фокусировку кнопки
        b18.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b18.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l18.getText() == "--------------") {
                    getL18().setText(getT1().getText());
                    root.getChildren().addAll(getB19(), getL19());
                } else {
                    getL18().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b18;
    }
    default Label getL18() {
        l18.setLayoutX(40);
        l18.setLayoutY(660);
        l18.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l18.setText("--------------");
        return l18;
    }
    default Button getB19 (){
        b19.setLayoutX(10);
        b19.setLayoutY(690);
        b19.setText("5");
        b19.setShape(new Circle(0.5));
        b19.setEffect(getColorAdjust());
        b19.setFocusTraversable(false); //снимает фокусировку кнопки
        b19.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b19.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l19.getText() == "--------------") {
                    getL19().setText(getT1().getText());
                    root.getChildren().addAll(getB20(), getL20());
                } else {
                    getL19().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b19;
    }
    default Label getL19() {
        l19.setLayoutX(40);
        l19.setLayoutY(690);
        l19.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l19.setText("--------------");
        return l19;
    }
    default Button getB20 (){
        b20.setLayoutX(10);
        b20.setLayoutY(720);
        b20.setText("6");
        b20.setShape(new Circle(0.5));
        b20.setEffect(getColorAdjust());
        b20.setFocusTraversable(false); //снимает фокусировку кнопки
        b20.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b20.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l20.getText() == "--------------") {
                    getL20().setText(getT1().getText());
                    root.getChildren().addAll(getB21(), getL21());
                } else {
                    getL20().setText(getT1().getText());
                    System.out.println("else");
                }
            }
        });
        return b20;
    }
    default Label getL20() {
        l20.setLayoutX(40);
        l20.setLayoutY(720);
        l20.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l20.setText("--------------");
        return l20;
    }
    default Button getB21 (){
        b21.setLayoutX(10);
        b21.setLayoutY(750);
        b21.setText("7");
        b21.setShape(new Circle(0.5));
        b21.setEffect(getColorAdjust());
        b21.setFocusTraversable(false); //снимает фокусировку кнопки
        b21.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b21.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getL21().setText(getT1().getText());
            }
        });
        return b21;
    }
    default Label getL21() {
        l21.setLayoutX(40);
        l21.setLayoutY(750);
        l21.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        l21.setText("--------------");
        return l21;
    }
}
