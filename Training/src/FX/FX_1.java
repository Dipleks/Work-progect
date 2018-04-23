package FX;/*JavaFX — платформа на основе Java для создания
* приложений с насыщенным графическим интерфейсом.
* Может использоваться как для создания настольных приложений,
* запускаемых непосредственно из-под операционных систем, так
* и для интернет-приложений (RIA), работающих в браузерах, и
* для приложений на мобильных устройствах. JavaFX призвана
* заменить использовавшуюся ранее библиотеку Swing. Платформа
* JavaFX конкурирует с Microsoft Silverlight, Adobe Flash и
* аналогичными системами.*/
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*Для работы FX нам необходимо заэкстендить Application и переопределить
* метод start*/
public class FX_1 extends Application {
//У Application вызовем launch и передадим args:
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
//Все готово для начала создания приложения:
        Group group = new Group();
        Scene scene = new Scene(group, 300, 400); /*предадим группу (их может быть
                                                                 * несолько) и размеры окна*/
        primaryStage.setTitle("Hello World"); //задаем заголовок
        primaryStage.setScene(scene); //передаем параметры окна
        primaryStage.show(); //запускаем окно
    }
}/*Данный код можно написать в текстовом файле сохранить как java, скомпелировать
 * и запустить из командной строки! И все будет работать, т.к. FX использует исключительно
 * стандартные библиотеки JAVA!*/
