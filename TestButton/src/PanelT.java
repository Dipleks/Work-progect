import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PanelT extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ButtonT buttonT = new ButtonT();
//        TextT textT = new TextT();
        TextNT textNT = new TextNT();
//        TST tst = new TST();


        Group root = new Group();
        root.getChildren().addAll(buttonT.bt(), textNT.rext());
        Scene scene = new Scene(root, 800, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Panel");
        primaryStage.show();
    }
}
