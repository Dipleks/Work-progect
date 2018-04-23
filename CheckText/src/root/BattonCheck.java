package root;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class BattonCheck implements Root, IsetText
{
    private Button[] buttons = new Button[5];
    private Label[] labels = new Label[5];
    private StringText stringText = new StringText();

    @Override
    public void getButton() {
        for (int i = 0; i < 5; i++) {
            buttons[i] = new Button();
            buttons[i].setText("+");
            buttons[i].setLayoutX(350);
            buttons[i].setLayoutY(i*a);
            labels[i] = new Label();
            labels[i].setLayoutX(450);
            labels[i].setLayoutY(i*30);
            labels[i].setText("ooooo");
            int finalI = i;
            buttons[i].setOnAction(new EventHandler<ActionEvent>()
            {
                @Override
                public void handle(ActionEvent event) {
                    if ((textField[finalI].getText().equalsIgnoreCase(stringText.getStringRu()[finalI]))) {
                        labels[finalI].setText("правильно");
                        System.out.println(textField[finalI].getText());
                    } else {
                        labels[finalI].setText("неправильно");
                        System.out.println(textField[finalI].getText());
                    }

                }
            });
            root.getChildren().addAll(buttons[i], labels[i]);
        }
    }

    @Override
    public void getEngI() {

    }
}
