package FX;/*FXML - очень похож на код джава, но написанный
* как xml.
* Для того что бы в него добавить обработчик событий нам нужно
* создать класс:*/

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class FX_14 implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    //добавим свой метод с пометкой fxml:
    @FXML
    public void print(){
        System.out.println("hello world");
    }
}
/*Теперь допишем в файле fxml: fx:controller="FX.FX_14" (пакет.класс).
* Теперь я могу использовать свой класс, например, в строку
* <Button mnemonicParsing="false" text="Button" допишем onAction="#print"/>
* и теперь при нажатии на кнопку в консоле будет выводится мое сообщение.*/