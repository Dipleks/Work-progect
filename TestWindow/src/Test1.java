import javafx.application.Application;
import javafx.stage.Stage;

public class Test1 extends Application implements Root
{

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage = s1;

        b1.setOnAction(e -> {
                s1.close();
                s2.setScene(scene2);
                s2.show();
            });
        b2.setOnAction(e -> {
                s2.close();
                s1.setScene(scene);
                s1.show();
            });

        group2.getChildren().addAll(b2);
        group.getChildren().addAll(b1);
        s1.setScene(scene);
        s1.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
