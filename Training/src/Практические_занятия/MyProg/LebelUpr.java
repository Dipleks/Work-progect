package Практические_занятия.MyProg;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public interface LebelUpr {
    Label lu1 = new Label();
    Label lu2 = new Label();
    Label lu3 = new Label();
    Label lu4 = new Label();
    Label lu5 = new Label();
    Label lu6 = new Label();
    Label lu7 = new Label();
    TextField textField = new TextField();

    default TextField getTextField() {
        textField.setLayoutX(20);
        textField.setLayoutY(40);
        return textField;
    }

    default Label getLu1() {
        lu1.setText("введите упражнение");
        lu1.setLayoutX(30);
        lu1.setLayoutY(125);
        lu1.setFont(Font.font("Time New Roman", FontPosture.REGULAR, 15));
        return lu1;
    }
    default Label getLu2() {
        lu2.setText("введите упражнение");
        lu2.setLayoutX(30);
        lu2.setLayoutY(150);
        lu2.setFont(Font.font("Time New Roman", FontPosture.REGULAR, 15));
        return lu2;
    }
    default Label getLu3() {
        lu3.setText("введите упражнение");
        lu3.setLayoutX(30);
        lu3.setLayoutY(175);
        lu3.setFont(Font.font("Time New Roman", FontPosture.REGULAR, 15));
        return lu3;
    }
    default Label getLu4() {
        lu4.setText("введите упражнение");
        lu4.setLayoutX(30);
        lu4.setLayoutY(200);
        lu4.setFont(Font.font("Time New Roman", FontPosture.REGULAR, 15));
        return lu4;
    }
    default Label getLu5() {
        lu5.setText("введите упражнение");
        lu5.setLayoutX(30);
        lu5.setLayoutY(225);
        lu5.setFont(Font.font("Time New Roman", FontPosture.REGULAR, 15));
        return lu5;
    }
    default Label getLu6() {
        lu6.setText("введите упражнение");
        lu6.setLayoutX(30);
        lu6.setLayoutY(250);
        lu6.setFont(Font.font("Time New Roman", FontPosture.REGULAR, 15));
        return lu6;
    }
    default Label getLu7() {
        lu7.setText("введите упражнение");
        lu7.setLayoutX(30);
        lu7.setLayoutY(275);
        lu7.setFont(Font.font("Time New Roman", FontPosture.REGULAR, 15));
        return lu7;
    }
}

