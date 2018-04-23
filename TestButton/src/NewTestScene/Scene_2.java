package NewTestScene;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


public class Scene_2 {
    Button buttonS2 = new Button("Press 2");
    Label label1 = new Label("ww");
    Label label2 = new Label("ww");
    Label label3 = new Label("ww");

    public Button getButtonS2() {
        buttonS2.setLayoutX(20);
        buttonS2.setLayoutY(100);

        buttonS2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                List<String> list = new ArrayList<>();
                list.add("Упр.1");
                list.add("Упр.2");
                list.add("Упр.3");


                label1.setText(list.get(0));
                label1.setLayoutX(10);
                label1.setLayoutY(10);

                label2.setText(list.get(1));
                label2.setLayoutX(10);
                label2.setLayoutY(30);

                label3.setText(list.get(2));
                label3.setLayoutX(10);
                label3.setLayoutY(50);

                ToggleGroup tg = new ToggleGroup();
                RadioButton r1 = new RadioButton();
                RadioButton r2 = new RadioButton();
                RadioButton r3 = new RadioButton();
                r1.setToggleGroup(tg);
                r1.setLayoutX(50);
                r1.setLayoutY(10);
                r2.setToggleGroup(tg);
                r2.setLayoutX(50);
                r2.setLayoutY(30);
                r3.setToggleGroup(tg);
                r3.setLayoutX(50);
                r3.setLayoutY(50);

                r1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {


                        //listStr.getLabel1().setText(list.get(2));
                        //label1.setText(list.get(2));
                        System.out.println("dsfg");
                    }
                });

                Stage stage = new Stage();
                Group group = new Group();
                group.getChildren().addAll(label1, label2, label3, r1, r2, r3);
                Scene scene = new Scene(group, 350, 250);
                stage.setTitle("Scene 2");
                stage.setScene(scene);
                stage.setResizable(false); //запрещает маштабирование окна
                stage.initModality(Modality.APPLICATION_MODAL); //запрещает работу с главным окном пока активно это окно.
                //stage.showAndWait(); //возращает окно в начально положение при закрытии
                stage.show();
            }
        });

        return buttonS2;
    }
}
