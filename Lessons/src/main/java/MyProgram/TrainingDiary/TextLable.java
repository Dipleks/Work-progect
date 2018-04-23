package MyProgram.TrainingDiary;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public interface TextLable extends Effects{
    TextField text = new TextField();

    Label l1 = new Label("-----------------");
    Label l2 = new Label("-----------------");
    Label l3 = new Label("-----------------");
    Label l4 = new Label("-----------------");
    Label l5 = new Label("-----------------");
    Label l6 = new Label("-----------------");
    Label l7 = new Label("-----------------");
    Label l8 = new Label("-----------------");
    Label l9 = new Label("-----------------");
    Label l10 = new Label("-----------------");
    Label l11 = new Label("-----------------");
    Label l12 = new Label("-----------------");
    Label l13 = new Label("-----------------");
    Label l14 = new Label("-----------------");
    Label l15 = new Label("-----------------");
    Label l16 = new Label("-----------------");
    Label l17 = new Label("-----------------");
    Label l18 = new Label("-----------------");
    Label l19 = new Label("-----------------");
    Label l20 = new Label("-----------------");
    Label l21 = new Label("-----------------");

    default TextField getText(){
        text.setLayoutX(10);
        text.setLayoutY(10);
        return text;
    }
    default Label getL1() {
        l1.setLayoutX(40);
        l1.setLayoutY(70);
        l1.setTextFill(Color.color(0.2, 0.3, 0.8));
        l1.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l1;
    }
    default Label getL2() {
        l2.setLayoutX(40);
        l2.setLayoutY(100);
        l2.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l2;
    }
    default Label getL3() {
        l3.setLayoutX(40);
        l3.setLayoutY(130);
        l3.setTextFill(Color.color(0.2, 0.3, 0.8));
        l3.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l3;
    }
    default Label getL4() {
        l4.setLayoutX(40);
        l4.setLayoutY(160);
        l4.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l4;
    }
    default Label getL5() {
        l5.setLayoutX(40);
        l5.setLayoutY(190);
        l5.setTextFill(Color.color(0.2, 0.3, 0.8));
        l5.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l5;
    }
    default Label getL6() {
        l6.setLayoutX(40);
        l6.setLayoutY(220);
        l6.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l6;
    }
    default Label getL7() {
        l7.setLayoutX(40);
        l7.setLayoutY(250);
        l7.setTextFill(Color.color(0.2, 0.3, 0.8));
        l7.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l7;
    }
    default Label getL8() {
        l8.setLayoutX(40);
        l8.setLayoutY(320);
        l8.setTextFill(Color.color(0.2, 0.3, 0.8));
        l8.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l8;
    }
    default Label getL9() {
        l9.setLayoutX(40);
        l9.setLayoutY(350);
        l9.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l9;
    }
    default Label getL10() {
        l10.setLayoutX(40);
        l10.setLayoutY(380);
        l10.setTextFill(Color.color(0.2, 0.3, 0.8));
        l10.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l10;
    }
    default Label getL11() {
        l11.setLayoutX(40);
        l11.setLayoutY(410);
        l11.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l11;
    }
    default Label getL12() {
        l12.setLayoutX(40);
        l12.setLayoutY(440);
        l12.setTextFill(Color.color(0.2, 0.3, 0.8));
        l12.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l12;
    }
    default Label getL13() {
        l13.setLayoutX(40);
        l13.setLayoutY(470);
        l13.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l13;
    }
    default Label getL14() {
        l14.setLayoutX(40);
        l14.setLayoutY(500);
        l14.setTextFill(Color.color(0.2, 0.3, 0.8));
        l14.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l14;
    }
    default Label getL15() {
        l15.setLayoutX(40);
        l15.setLayoutY(570);
        l15.setTextFill(Color.color(0.2, 0.3, 0.8));
        l15.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l15;
    }
    default Label getL16() {
        l16.setLayoutX(40);
        l16.setLayoutY(600);
        l16.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l16;
    }
    default Label getL17() {
        l17.setLayoutX(40);
        l17.setLayoutY(630);
        l17.setTextFill(Color.color(0.2, 0.3, 0.8));
        l17.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l17;
    }
    default Label getL18() {
        l18.setLayoutX(40);
        l18.setLayoutY(660);
        l18.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l18;
    }
    default Label getL19() {
        l19.setLayoutX(40);
        l19.setLayoutY(690);
        l19.setTextFill(Color.color(0.2, 0.3, 0.8));
        l19.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l19;
    }
    default Label getL20() {
        l20.setLayoutX(40);
        l20.setLayoutY(720);
        l20.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l20;
    }
    default Label getL21() {
        l21.setLayoutX(40);
        l21.setLayoutY(750);
        l21.setTextFill(Color.color(0.2, 0.3, 0.8));
        l21.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 14));
        return  l21;
    }
}
