package FX;/*Concurrency*/

import javafx.application.Application;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*Многопоточность в javaFX*/
public class FX_20 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        MyService myService = new MyService();
        //добавим воркейдстейд, чтобы убедиться что у нас возвращается hello
        myService.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent t) {
                System.out.println("done: " + t.getSource().getValue());
            }
        });
        myService.start();

        Group root = new Group();
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();
    }
    //Создадим класс и заэкстендим класс сервис:
    static class MyService extends Service<String> {
        @Override
        protected Task<String> createTask() {
            return new Task<String>() {
                @Override
                protected String call() throws Exception {
                    return "Hello"; //создадим майсервайз и запустим!
                }
            };
        }
    }
}
