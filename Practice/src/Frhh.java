import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Frhh extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GregorianCalendar calendar = new GregorianCalendar();
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);


        Group root = new Group();
        root.getChildren().addAll(Calendar.MONTH);
        Scene scene = new Scene(root, 700, 500);

        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
