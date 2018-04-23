package FX;/*Отображение HTML и JavaScript в WebView*/

import javafx.application.Application;
import javafx.concurrent.Worker;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;
import static javafx.concurrent.Worker.State.SUCCEEDED;

public class FX_16 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Для отображения html нам необходим:
        WebView webView = new WebView();
        //теперь поместим в него html:
        WebEngine webEngine = webView.getEngine();
        //укажим url или фаил html:
        //webEngine.load("file://");
        //или напишем свой html:
        webEngine.loadContent("" +
                "<div id='div'>hello world</div>" +
                "<script>document.getElementById('div').style.color='blue';" +
                "function changeColor() {" +
                "  document.getElementById('div').style.color='green';" +
                "  document.getElementById('div').innerHTML=MyClass.getHello('Dennis')" /*в результате текст
                                                      * поменяется на Hello Dennis*/+
                "}</script>" +
                                "");
        //Для смены надписи вызовим наш класс:
        JSObject jsObject = (JSObject)webEngine.executeScript("window");
        jsObject.setMember("MyClass", new MyClass());
        //Написанную дополнительно функцию (function) мы можем применять:
        //webEngine.executeScript("changeColor();");
        //Но такая запись не даст завершится предыдущему коду, это исправим так:
        webEngine.getLoadWorker()
                .stateProperty()
                .addListener((observable, oldValue, newValue) -> {
                    if (newValue == SUCCEEDED){
                        webEngine.executeScript("changeColor();");
                    }
                });


        Group root = new Group();
        root.getChildren().add(webView);
        Scene scene = new Scene(root, 700, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    //Мы можем создать класс в нем метод и запустить его не посредственно с под JavaScript:
    public class MyClass {
        public String getHello(String name) {
            return "Hello " + name;
        }
    }
}
