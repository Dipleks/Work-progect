package MyProgram.TrainingDiary;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public interface Buttons extends Effects, TextLable, Groups {
    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");
    Button b7 = new Button("7");
    Button b8 = new Button("1");
    Button b9 = new Button("2");
    Button b10 = new Button("3");
    Button b11 = new Button("4");
    Button b12 = new Button("5");
    Button b13 = new Button("6");
    Button b14 = new Button("7");
    Button b15 = new Button("1");
    Button b16 = new Button("2");
    Button b17 = new Button("3");
    Button b18 = new Button("4");
    Button b19 = new Button("5");
    Button b20 = new Button("6");
    Button b21 = new Button("7");

    default Button getB1() {
        b1.setLayoutX(10);
        b1.setLayoutY(70);
        b1.setEffect(getColorButton());
        b1.setShape(new Circle(0.5));
        b1.setFocusTraversable(false);
        b1.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l1.getText() == "-----------------") {
                    l1.setText(text.getText());
                    root.getChildren().addAll(getB2(), getL2());
                } else  {
                    l1.setText(text.getText());
                }
            }
        });
        return b1;
    }
    default Button getB2() {
        b2.setLayoutX(10);
        b2.setLayoutY(100);
        b2.setEffect(getColorButton());
        b2.setShape(new Circle(0.5));
        b2.setFocusTraversable(false);
        b2.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l2.getText() == "-----------------") {
                    l2.setText(text.getText());
                    root.getChildren().addAll(getB3(), getL3());
                } else  {
                    l2.setText(text.getText());
                }
            }
        });
        return b2;
    }
    default Button getB3() {
        b3.setLayoutX(10);
        b3.setLayoutY(130);
        b3.setEffect(getColorButton());
        b3.setShape(new Circle(0.5));
        b3.setFocusTraversable(false);
        b3.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l3.getText() == "-----------------") {
                    l3.setText(text.getText());
                    root.getChildren().addAll(getB4(), getL4());
                } else  {
                    l3.setText(text.getText());
                }
            }
        });
        return b3;
    }
    default Button getB4() {
        b4.setLayoutX(10);
        b4.setLayoutY(160);
        b4.setEffect(getColorButton());
        b4.setShape(new Circle(0.5));
        b4.setFocusTraversable(false);
        b4.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l4.getText() == "-----------------") {
                    l4.setText(text.getText());
                    root.getChildren().addAll(getB5(), getL5());
                } else  {
                    l4.setText(text.getText());
                }
            }
        });
        return b4;
    }
    default Button getB5() {
        b5.setLayoutX(10);
        b5.setLayoutY(190);
        b5.setEffect(getColorButton());
        b5.setShape(new Circle(0.5));
        b5.setFocusTraversable(false);
        b5.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l5.getText() == "-----------------") {
                    l5.setText(text.getText());
                    root.getChildren().addAll(getB6(), getL6());
                } else  {
                    l5.setText(text.getText());
                }
            }
        });
        return b5;
    }
    default Button getB6() {
        b6.setLayoutX(10);
        b6.setLayoutY(220);
        b6.setEffect(getColorButton());
        b6.setShape(new Circle(0.5));
        b6.setFocusTraversable(false);
        b6.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l6.getText() == "-----------------") {
                    l6.setText(text.getText());
                    root.getChildren().addAll(getB7(), getL7());
                } else  {
                    l6.setText(text.getText());
                }
            }
        });
        return b6;
    }
    default Button getB7() {
        b7.setLayoutX(10);
        b7.setLayoutY(250);
        b7.setEffect(getColorButton());
        b7.setShape(new Circle(0.5));
        b7.setFocusTraversable(false);
        b7.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    l7.setText(text.getText());
            }
        });
        return b7;
    }
    default Button getB8() {
        b8.setLayoutX(10);
        b8.setLayoutY(320);
        b8.setEffect(getColorButton());
        b8.setShape(new Circle(0.5));
        b8.setFocusTraversable(false);
        b8.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l8.getText() == "-----------------") {
                    l8.setText(text.getText());
                    root.getChildren().addAll(getB9(), getL9());
                } else  {
                    l8.setText(text.getText());
                }
            }
        });
        return b8;
    }
    default Button getB9() {
        b9.setLayoutX(10);
        b9.setLayoutY(350);
        b9.setEffect(getColorButton());
        b9.setShape(new Circle(0.5));
        b9.setFocusTraversable(false);
        b9.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l9.getText() == "-----------------") {
                    l9.setText(text.getText());
                    root.getChildren().addAll(getB10(), getL10());
                } else  {
                    l9.setText(text.getText());
                }
            }
        });
        return b9;
    }
    default Button getB10() {
        b10.setLayoutX(10);
        b10.setLayoutY(380);
        b10.setEffect(getColorButton());
        b10.setShape(new Circle(0.5));
        b10.setFocusTraversable(false);
        b10.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l10.getText() == "-----------------") {
                    l10.setText(text.getText());
                    root.getChildren().addAll(getB11(), getL11());
                } else  {
                    l10.setText(text.getText());
                }
            }
        });
        return b10;
    }
    default Button getB11() {
        b11.setLayoutX(10);
        b11.setLayoutY(410);
        b11.setEffect(getColorButton());
        b11.setShape(new Circle(0.5));
        b11.setFocusTraversable(false);
        b11.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l11.getText() == "-----------------") {
                    l11.setText(text.getText());
                    root.getChildren().addAll(getB12(), getL12());
                } else  {
                    l11.setText(text.getText());
                }
            }
        });
        return b11;
    }
    default Button getB12() {
        b12.setLayoutX(10);
        b12.setLayoutY(440);
        b12.setEffect(getColorButton());
        b12.setShape(new Circle(0.5));
        b12.setFocusTraversable(false);
        b12.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l12.getText() == "-----------------") {
                    l12.setText(text.getText());
                    root.getChildren().addAll(getB13(), getL13());
                } else  {
                    l12.setText(text.getText());
                }
            }
        });
        return b12;
    }
    default Button getB13() {
        b13.setLayoutX(10);
        b13.setLayoutY(470);
        b13.setEffect(getColorButton());
        b13.setShape(new Circle(0.5));
        b13.setFocusTraversable(false);
        b13.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l13.getText() == "-----------------") {
                    l13.setText(text.getText());
                    root.getChildren().addAll(getB14(), getL14());
                } else  {
                    l13.setText(text.getText());
                }
            }
        });
        return b13;
    }
    default Button getB14() {
        b14.setLayoutX(10);
        b14.setLayoutY(500);
        b14.setEffect(getColorButton());
        b14.setShape(new Circle(0.5));
        b14.setFocusTraversable(false);
        b14.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    l14.setText(text.getText());
            }
        });
        return b14;
    }
    default Button getB15() {
        b15.setLayoutX(10);
        b15.setLayoutY(570);
        b15.setEffect(getColorButton());
        b15.setShape(new Circle(0.5));
        b15.setFocusTraversable(false);
        b15.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l15.getText() == "-----------------") {
                    l15.setText(text.getText());
                    root.getChildren().addAll(getB16(), getL16());
                } else  {
                    l15.setText(text.getText());
                }
            }
        });
        return b15;
    }
    default Button getB16() {
        b16.setLayoutX(10);
        b16.setLayoutY(600);
        b16.setEffect(getColorButton());
        b16.setShape(new Circle(0.5));
        b16.setFocusTraversable(false);
        b16.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b16.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l16.getText() == "-----------------") {
                    l16.setText(text.getText());
                    root.getChildren().addAll(getB17(), getL17());
                } else  {
                    l16.setText(text.getText());
                }
            }
        });
        return b16;
    }
    default Button getB17() {
        b17.setLayoutX(10);
        b17.setLayoutY(630);
        b17.setEffect(getColorButton());
        b17.setShape(new Circle(0.5));
        b17.setFocusTraversable(false);
        b17.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b17.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l17.getText() == "-----------------") {
                    l17.setText(text.getText());
                    root.getChildren().addAll(getB18(), getL18());
                } else  {
                    l17.setText(text.getText());
                }
            }
        });
        return b17;
    }
    default Button getB18() {
        b18.setLayoutX(10);
        b18.setLayoutY(660);
        b18.setEffect(getColorButton());
        b18.setShape(new Circle(0.5));
        b18.setFocusTraversable(false);
        b18.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b18.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l18.getText() == "-----------------") {
                    l18.setText(text.getText());
                    root.getChildren().addAll(getB19(), getL19());
                } else  {
                    l18.setText(text.getText());
                }
            }
        });
        return b18;
    }
    default Button getB19() {
        b19.setLayoutX(10);
        b19.setLayoutY(690);
        b19.setEffect(getColorButton());
        b19.setShape(new Circle(0.5));
        b19.setFocusTraversable(false);
        b19.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b19.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l19.getText() == "-----------------") {
                    l19.setText(text.getText());
                    root.getChildren().addAll(getB20(), getL20());
                } else  {
                    l19.setText(text.getText());
                }
            }
        });
        return b19;
    }
    default Button getB20() {
        b20.setLayoutX(10);
        b20.setLayoutY(720);
        b20.setEffect(getColorButton());
        b20.setShape(new Circle(0.5));
        b20.setFocusTraversable(false);
        b20.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b20.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (l20.getText() == "-----------------") {
                    l20.setText(text.getText());
                    root.getChildren().addAll(getB21(), getL21());
                } else  {
                    l20.setText(text.getText());
                }
            }
        });
        return b20;
    }
    default Button getB21() {
        b21.setLayoutX(10);
        b21.setLayoutY(750);
        b21.setEffect(getColorButton());
        b21.setShape(new Circle(0.5));
        b21.setFocusTraversable(false);
        b21.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.REGULAR, 12));
        b21.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    l21.setText(text.getText());
            }
        });
        return b21;
    }
}
