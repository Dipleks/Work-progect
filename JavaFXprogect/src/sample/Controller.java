package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Controller {

    public Pane rootPanel;
    public Button remove;
    private GridPane gridPane = new GridPane();
    private Stage stage = new Stage();
    private Label l1 = new Label("RRRRRRRRRR");
    private Label l2 = new Label("TTTTTTTT");
    private Parent parent;


    public void menuStrart()throws Exception{

        rootPanel.getChildren().remove(parent);
        parent = FXMLLoader.load(getClass().getResource("one.fxml"));

        l1.setLayoutX(100);
        l1.setLayoutY(20);
        l1.setTextFill(Color.DARKBLUE);
        rootPanel.getChildren().addAll(parent, l1);

    }
    public void setRemove()throws Exception{

        rootPanel.getChildren().remove(parent);
        parent = FXMLLoader.load(getClass().getResource("two.fxml"));

//        rootPanel.getChildren().remove(l1);
        System.out.println("test");
        l2.setLayoutX(100);
        l2.setLayoutY(20);
        l2.setTextFill(Color.DARKBLUE);
        rootPanel.getChildren().addAll(parent, l2);

    }

}
