package interfaceLesson;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ClassC implements TestInt
{
    private String[] strings = new String[4];



    @Override
    public String[] testStr() {
        for (int i = 0; i < 4; i++) {
            strings[i] = "TestSTR " +i;
        }
        return strings;
    }

    @Override
    public GridPane getGritPane() {
        return null;
    }
}
