package timerTest;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimerTest extends Application {
    Label label = new Label();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        final Date date = new Date();
                        final SimpleDateFormat formatForTimeNow = new SimpleDateFormat("E hh:mm:ss");
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                label.setText(formatForTimeNow.format(date));
                                label.setTextFill(Color.RED);
                                label.setStyle("-fx-font-size: 24pt;");
                            }
                        });
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.setDaemon(true);
        thread.start();

        group.getChildren().addAll(label);



        Scene scene = new Scene(group, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
