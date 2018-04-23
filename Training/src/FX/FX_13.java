package FX;/*CSS*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
public class FX_13 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        /*Мы можем настроить внешний вид приложения
        * всего их 2 стандартных:*/
        //Application.setUserAgentStylesheet(STYLESHEET_CASPIAN);
        //Application.setUserAgentStylesheet(STYLESHEET_MODENA); //идет по умолчанию
        /*Есть сайт http://aquafx-project.com/project.html, с него мы можем скачать
        * jar добавить его в проект и можем получить вид как в MacOS.
        * Тепрь мы можем вывать его:*/
        //AquaFx.style();

        /*Создадим свой CSS фаил!*/

        //Application.setUserAgentStylesheet(getClass().getResource("FX_13.css").toExternalForm());
        /*При подключении СSS файла все остальные стили пропадают.
        * Поэтому мы изменим не всё приложение а только определенные элементы,
        * например, кнопку:*/

        Button button = new Button("press");
        //можно изменить по ID:
        //button.setId("mybutton");
        //можно добавить свой стиль и вызвать из css:
       button.getStyleClass().add("mystyle");
        //можно изменить непосредственно в стиле:
       //button.setStyle("-fx-font-size: 20;");

        Group root = new Group();
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("FX_13.css").toExternalForm());
        root.getChildren().addAll (button);
        primaryStage.setScene(scene);
        primaryStage.show(); }}