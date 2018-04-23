package StringEnglish;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Test extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        Group gr = new Group();
        Label label = new Label();
        label.setLayoutX(20);
        label.setLayoutY(20);
        label.setText("Test");

        EngRus er = new EngRus();
//        er.getLabel();

//        label.setText(er.getLabel());

        gr.getChildren().addAll(label);
        Scene scene = new Scene(gr, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
