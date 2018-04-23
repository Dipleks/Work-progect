import javafx.scene.control.TextField;

public class TextT {
    private TextField textField = new TextField();

    public TextField tf() {
        textField.setLayoutY(10);
        textField.setLayoutX(10);
        return textField;
    }

    public TextField getTextField() {
        if (textField.getText().length() > 0) {

        }
        return textField;
    }

    public void setTextField() {
        this.textField = textField;
    }
}
