package FX;/*Scene Builder с JAVA он не идет,
* поэтому его нужно скачать и уствновить.
* Ссылка: http://www.oracle.com/technetwork/java/javase/downloads/javafxscenebuilder-1x-archive-2199384.html
* Далее устанавливаем программу, запускаем ее, работаем в ней, после
* создания своего приложения сохраняем фаил по пути нашего пректа.
* Тепрь мы можем подключить сохраненный fxml к нашему проекту.*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FX_12 extends Application{
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Подключим наш fxml к проекту:
        Group root = new Group();

        Parent conect = FXMLLoader.load(getClass().getResource("FX_12.fxml"));
        BorderPane bp = new BorderPane();
        bp.setCenter(conect);
        root.getChildren().add(bp);

        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();
    } /*После компиляции получим окно с созданным ранее нашим фалом fxml.*/
}
