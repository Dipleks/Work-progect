package MyProgram.TrainingDiary;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public interface VesPodPov extends Zagalovki, DateVes{
    Label v1u1 = new Label();
    Label pod1u1 = new Label();
    Label pov1u1 = new Label();
    Label pr1u1 = new Label();
    Label pm1u1 = new Label();
    Label tonn1u1 = new Label();
    Label kpsh1u1 = new Label();

    default Label getPr1u1() {
        pr1u1.setLayoutX(230);
        pr1u1.setLayoutY(70);
        pr1u1.setText(String.valueOf(a));
        pr1u1.setTextFill(Color.color(0.2, 0.3, 0.8));
        pr1u1.setFont(f);

        return pr1u1;
    }
    default Label getTonn1u1() {
        tonn1u1.setLayoutX(930);
        tonn1u1.setLayoutY(70);
        tonn1u1.setText(String.valueOf(a+b));
        tonn1u1.setTextFill(Color.color(0.2, 0.3, 0.8));
        tonn1u1.setFont(f);

        return tonn1u1;
    }

}
