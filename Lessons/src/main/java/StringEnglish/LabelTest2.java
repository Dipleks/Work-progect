package StringEnglish;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;

interface LabelTest2 {
    Label label = new Label();
    Color color1 = Color.GREEN;
    Color color2 = Color.BLUE;

    default Label getLabel() {
        label.setLayoutX(20);
        label.setLayoutY(20);
        return label;
    }
}
