import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TST {
    Button b = new Button("PressT");
    TextField t = new TextField();
    Label saveL = new Label();

    public Label sv(){
        b.setLayoutX(50);
        b.setLayoutY(120);
        t.setLayoutX(10);
        t.setLayoutY(100);
        saveL.setLayoutX(55);
        saveL.setLayoutY(140);

        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (t.getText().length() > 0){
                    saveL.setText(t.getText());}
            }
        });





        return saveL;
    }
}
