package StringEnglish;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Test2 extends Application implements LabelTest2{
    Group gr = new Group();
    EnRu2 enRu21 = new EnRu2();

    private final Button b = new Button("perevod");
    private final Button b2 = new Button("perevod");

    @Override
    public void start(Stage primaryStage) throws Exception {

        getLabel().setText(enRu21.getStr1());
        getLabel().setTextFill(color2);
        butCh();


        gr.getChildren().addAll(b, b2, getLabel());
        Scene scene = new Scene(gr, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void butCh(){

        b.setLayoutX(80);
        b.setLayoutY(20);
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (getLabel().getText().equals("1")){
                    getLabel().setText(enRu21.getStr2());
                    getLabel().setTextFill(color1);
                    System.out.println("отобразит 2");
                } else {
                    getLabel().setText(enRu21.getStr1());
                    getLabel().setTextFill(color2);
                    System.out.println("отобразит 1");
                }
            }
        });
        b2.setLayoutX(80);
        b2.setLayoutY(50);
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (getLabel().getText().equals("3")){
                    getLabel().setText(enRu21.getStr4());
                    getLabel().setTextFill(color1);
                    System.out.println("отобразит 4");
                } else {
                    getLabel().setText(enRu21.getStr3());
                    getLabel().setTextFill(color2);
                    System.out.println("отобразит 3");
                }
            }
        });

    }

    public static void main(String[] args) {
        launch(args);
    }
}
