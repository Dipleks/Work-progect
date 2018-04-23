package Практические_занятия.December_29;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.FileReader;

public class WindowOne extends Application implements WindowTwo{


    @Override
    public void start(Stage primaryStage) throws Exception {

        FileReader fileReader = new FileReader("FileTest.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.read();

        str[0] = bufferedReader.readLine();
        str[1] = bufferedReader.readLine();
        str[2] = bufferedReader.readLine();
        str[3] = bufferedReader.readLine();
        str[4] = bufferedReader.readLine();
        str[5] = bufferedReader.readLine();

        l1.setText("задать выполнение");
        l1.setLayoutX(15);
        l1.setLayoutY(15);
        l2.setText("задать выполнение");
        l2.setLayoutX(15);
        l2.setLayoutY(45);
        l3.setText("задать выполнение");
        l3.setLayoutX(15);
        l3.setLayoutY(75);

        Button b1 = new Button();
        Button b2 = new Button();
        Button b3 = new Button();
        b1.setText("+");
        b1.setLayoutX(135);
        b1.setLayoutY(10);
        b2.setText("+");
        b2.setLayoutX(135);
        b2.setLayoutY(40);
        b3.setText("+");
        b3.setLayoutX(135);
        b3.setLayoutY(70);
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showTwo();
            }
        });

        Group root = new Group();
        Scene scene = new Scene(root, 700, 400);
        root.getChildren().addAll(l1, l2, l3, b1, b2, b3);

        primaryStage.setScene(scene);
        primaryStage.setTitle("WindowOne");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }}