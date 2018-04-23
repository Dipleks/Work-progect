package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class Controller {

    public Button set;

    public Button getSet() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample1.fxml"));
        set.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) {
//                Root.stage1 = Root.stage2;
                Root.stage2.setScene(new Scene(root, 400, 600));
                Root.stage2.show();
            }
        });
        System.out.println("rrrrrrrrr");
       return set;
    }

}
