import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Root extends Application implements IRoot
{
    private double a = 100.0;
//    Color color = Color.rgb(255, 100, 250);
    Scene scene = new Scene(ROOT, 800, 800);

    @Override
    public void start(Stage primaryStage) throws Exception {

//        scene.setFill(color);

        StackPane stackPane = new StackPane();
        stackPane.setPrefSize(200, 200);
        stackPane.setLayoutX(100);
        stackPane.setLayoutY(200);
        stackPane.setStyle("-fx-background-color: rgb(255, 100, 250);");
//        Background background = new Background(Color.rgb(255,100,250));
//        stackPane.setBackground( new Color(255, 106, 250) );
//        stackPane.;

        stackPane.setOpacity(a);


        Slider slider = new Slider();
        slider.setLayoutX(30);
        slider.setLayoutY(30);
        slider.setMin(0.0);
        slider.setMax(100.0);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setValue(100.0);
        slider.valueProperty().addListener(new ChangeListener<Number>()
        {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                oldValue = 100;
                stackPane.setOpacity((Double) newValue);

//                stackPane.setStyle("-fx-background-color: rgb(255,100,250);");
            }
        });

        ROOT.getChildren().addAll(slider, stackPane);


        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
