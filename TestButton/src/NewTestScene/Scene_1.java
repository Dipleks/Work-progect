package NewTestScene;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Scene_1 extends Application {
    ListStr listStr = new ListStr();

    @Override
    public void start(Stage primaryStage) throws Exception {

//        Label label1 = new Label("пусто");
//        label1.setLayoutX(20);
//        label1.setLayoutY(10);
//        Label label2 = new Label("пусто");
//        label2.setLayoutX(20);
//        label2.setLayoutY(30);
//        Label label3 = new Label("пусто");
//        label3.setLayoutX(20);
//        label3.setLayoutY(50);

        Scene_2 scene2 = new Scene_2();
        scene2.label1.setLayoutX(20);
        scene2.label1.setLayoutY(10);
        scene2.label2.setLayoutX(20);
        scene2.label2.setLayoutY(30);
        scene2.label3.setLayoutX(20);
        scene2.label3.setLayoutY(50);

        listStr.getLabel1().getText();

        Group root = new Group();
        root.getChildren().addAll(listStr.getLabel1(), scene2.label1, scene2.label2, scene2.label3, scene2.getButtonS2());
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("New");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
