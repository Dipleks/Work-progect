package programReliz;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RunClass extends Application implements RootPanel
{


    private final double widthScene = screen.getBounds().getWidth()-100;
    private final double heightScene = screen.getBounds().getHeight()-100;
    private final Scene scene = new Scene(root, widthScene, heightScene);
    private final Button exit = new Button();

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Label[] labels = new Label[20];
        for (int i = 0; i < labels.length; i++) {
            labels[i] = new Label();
            labels[i].setText("Test program " + i);
            labels[i].setLayoutX(50);
            labels[i].setLayoutY(i*30+30);
            root.getChildren().add(labels[i]);
        }
        Label[] labels2 = new Label[20];
        for (int i = 0; i < labels2.length; i++) {
            labels2[i] = new Label();
            labels2[i].setText("Test program " + i);
            labels2[i].setLayoutX(widthScene - 150);
            labels2[i].setLayoutY(i*30+30);
            root.getChildren().add(labels2[i]);
        }
        Label[] labels3 = new Label[20];
        for (int i = 0; i < labels3.length; i++) {
            labels3[i] = new Label();
            labels3[i].setText("Test program " + i);
            labels3[i].setLayoutX(widthScene - widthScene/2);
            labels3[i].setLayoutY(i*30+30);
            root.getChildren().add(labels3[i]);
        }

        root.getChildren().addAll(getExit());

        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setScene(getScene());
        primaryStage.show();
    }

    private Scene getScene() {
//        scene.setFill(Color.TRANSPARENT);
        return scene;
    }
    private Button getExit() {
        Image image = new Image("close.png");
        ImageView imageView = new ImageView(image);
        exit.setLayoutX(widthScene-50);
        exit.setGraphic(imageView);
        exit.setStyle("-fx-background-color: transparent;");
        return exit;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
