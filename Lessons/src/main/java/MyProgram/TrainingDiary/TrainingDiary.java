package MyProgram.TrainingDiary;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TrainingDiary extends Application implements Effects, Buttons, TextLable, Groups, DateDay, Zagalovki,
                    VesPodPov {

    private Scene scene = new Scene(root, 1300, 800, Color.DARKSEAGREEN);

    @Override
    public void start(Stage primaryStage) throws Exception {

        root.getChildren().addAll(getText(), getB1(), getB8(), getB15(), getL1(), getL8(), getL15(), getLd1(), getD1(),
                getLd2(), getD2(), getLd3(), getD3(), getRt1(), getRt2(), getZ1(), getZ2(), getZ3(), getZ4(), getZ5(),
                getZ6(), getZ7(), getZ8(), getZ9(), getZ10(), getZ11(), getZ12(), getZ13(), getZ14(), getZ15(), getZ16(),
                getZ17(), getZ18(), getZ19(), getZ20(), getZ21(), getZ22(), getZ23(), getZ24(), getZ25(), getZ26(),
                getZ27(), getZ28(), getZ29(), getZ30(), getZ31(), getZ32(), getZ33(), getZ34(), getZ35(),
                getZ36(), getZ37(), getZ38(), getZ39(), getZ40(), getZ41(), getZ42(), getZ43(), getZ44(), getZ45(),
                getPr1u1(), getTonn1u1());

        root.setEffect(getEffectTeni());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Дневник тренировок");
        primaryStage.setResizable(false);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
