package test;

import java.awt.*;

public class TextOpen {
    static TextField textField = new TextField();

    public static TextField getTextField() {
        return textField;
    }

    public static void setTextField(TextField textField) {
        TextOpen.textField = textField;
    }
}
