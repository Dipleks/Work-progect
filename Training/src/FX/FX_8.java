package FX;/*Custom Control - создается самостоятельно.*/

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/*Есть два способа: 1й мы эстендим классы которые экстендят контрол
* или 2й через fxml.*/
//Рассмортим 1й вариант.
//Создадим класс котороый будет контролировать ввод цифр и запрещать ввод текста
//в поле:
class NumberTextField extends TextField {
    String numberRegEx = "[0-9]*";
//Переопределим метод TextField:
    @Override
    public void replaceText(int start, int end, String text) {
        String oldValue = getText();
        if ((validate(text))){
            super.replaceText(start,end,text);
            String newText  = super.getText();
            if (!validate(newText)){
                super.setText(oldValue);
            }
        }
    }
    private boolean validate(String text){
        return ("".equals(text)||text.matches(numberRegEx));
    }
}
//Добавляем контроллер:
public class FX_8 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        NumberTextField numberTextField = new NumberTextField();

        Group root = new Group();
        root.getChildren().add(numberTextField);
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }
}/*После компиляции получим поле в которое можно вводить только цифры.*/
