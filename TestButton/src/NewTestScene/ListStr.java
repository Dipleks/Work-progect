package NewTestScene;

import javafx.scene.control.Label;

public class ListStr extends Scene_2{
    Label label1 = new Label("пусто");
    Label label2 = new Label("пусто");
    Label label3 = new Label("пусто");

    public Label getLabel1() {

        label1.getText();
        label1.setLayoutX(20);
        label1.setLayoutY(10);
        return label1;
    }

    public Label getLabel2() {
        label2.setLayoutX(20);
        label2.setLayoutY(30);
        return label2;
    }

    public Label getLabel3() {
        label3.setLayoutX(20);
        label3.setLayoutY(50);
        return label3;
    }


}
