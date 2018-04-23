import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ButtonT extends Obed{
    private final Button button = new Button("Press");
    public Button bt(){

        button.setLayoutX(50);
        button.setLayoutY(50);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                setArrS(arrS[0] = "asfg");
                System.out.println("test");

            }

            private void setArrS(String s) {

            }
        });
        return button;
    }


}
