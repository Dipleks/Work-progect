package testArryString;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClippedShadow extends Application {

    private static final int shadowSize = 50;

    @Override public void start(final Stage stage) throws FileNotFoundException {
        stage.initStyle(StageStyle.TRANSPARENT);

        StackPane stackPane = new StackPane(createShadowPane());
        stackPane.setStyle(
                "-fx-background-color: rgba(255, 255, 255, 0.5);" +
                        "-fx-background-insets: " + shadowSize + ";"
        );


//        button.setLayoutX(-100);
//        button.setLayoutY(-100);
//        stackPane.getChildren().addAll(button);

        Image image = new Image("unnamed.png");
        ImageView imageView = new ImageView(image);

        Button button = new Button();
        button.setGraphic(imageView);
        button.setStyle("-fx-background-color: transparent;");
//        button.setOpacity(0.5F);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("TEST");
                stage.close();
            }
        });

        stackPane.getChildren().addAll(button);
        Scene scene = new Scene(stackPane, 1400, 900);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
    }

    // Create a shadow effect as a halo around the pane and not within
    // the pane content area.
    private Pane createShadowPane() {
        Pane shadowPane = new Pane();
        // a "real" app would do this in a CSS stylesheet.
        shadowPane.setStyle(
                "-fx-background-color: white;" +
                        "-fx-effect: dropshadow(gaussian, red, " + shadowSize + ", 0, 0, 0);" +
                        "-fx-background-insets: " + shadowSize + ";"
        );

        Rectangle innerRect = new Rectangle();
        Rectangle outerRect = new Rectangle();
        shadowPane.layoutBoundsProperty().addListener(
                (observable, oldBounds, newBounds) -> {
                    innerRect.relocate(
                            newBounds.getMinX() + shadowSize,
                            newBounds.getMinY() + shadowSize
                    );
                    innerRect.setWidth(newBounds.getWidth() - shadowSize * 2);
                    innerRect.setHeight(newBounds.getHeight() - shadowSize * 2);

                    outerRect.setWidth(newBounds.getWidth());
                    outerRect.setHeight(newBounds.getHeight());

                    Shape clip = Shape.subtract(outerRect, innerRect);
                    shadowPane.setClip(clip);
                }
        );

        return shadowPane;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
