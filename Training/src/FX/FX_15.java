package FX;/*Media*/

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class FX_15 extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        /*В javaFX мы можем воспроизвести медиа фалы:*/
        Media media = new Media("file:///D:/1.mp3");
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        //MediaView mediaView = new MediaView(mediaPlayer); //эта дополнительная команда
                                                            //нужна для воспроизведения видео.

        Group root = new Group();
        //root.getChildren().add(mediaView); //для видео.
        Scene scene = new Scene(root, 700, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
