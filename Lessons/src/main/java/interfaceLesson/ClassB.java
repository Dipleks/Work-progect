package interfaceLesson;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ClassB implements TestInt
{
    private Label[] label = new Label[4];
    private GridPane gridPane = new GridPane();


    private Label[] testI() {
        for (int i = 0; i < 4; i++) {
            TestInt testInt = new ClassC();
            label[i] = new Label();
            label[i].setLayoutX(i*60);
            label[i].setText(testInt.testStr()[i]);
        }
        return label;
    }

    @Override
    public String[] testStr() {
        return new String[0];
    }

    @Override
    public GridPane getGritPane() {
        for (int i = 0; i < 4; i++) {
            gridPane.add(testI()[i], 1, i);
        }
        return gridPane;
    }
}
