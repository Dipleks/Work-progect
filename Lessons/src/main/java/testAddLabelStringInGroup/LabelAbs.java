package testAddLabelStringInGroup;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class LabelAbs extends StringAbs implements Root
{
    private Label[] label = new Label[4];

    private void labelAdd(){
        for (int i = 0; i < label.length; i++) {
            label[i] = new Label();
            label[i].setLayoutX(20);
            label[i].setLayoutY(i * 20);
            label[i].setTextFill(Color.RED);
            final int finalI = i;
            label[i].setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    label[finalI].setText(getStrRu()[finalI]);
                }
            });
            label[i].setText(getStrEn()[i]);
            root.getChildren().add(label[i]);
        }
    }
    void getLabelAdd() {
        labelAdd();
    }
}
