package root;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

class LabelText extends StringText implements Root, IsetText
{
    private Label[] eng = new Label[5];

    //    public void setEng() {
//    }

    @Override
    public void getEngI() {
        for (int i = 0; i < 5; i++) {
            eng[i] = new Label();
            textField[i] = new TextField();
            eng[i].setText(getStringEn()[i]);
            eng[i].setLayoutX(20);
            eng[i].setLayoutY(i*a);

            textField[i].setLayoutX(150);
            textField[i].setLayoutY(i*a);

            root.getChildren().addAll(eng[i], textField[i]);
        }
    }
}
