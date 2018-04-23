package FX;/*Swing и Fx, научимся добавлять в swing javafx.*/

import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javax.swing.*;

public class FX_21 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Swing and javaFX");
        //Добавим FX панель:
        JFXPanel jfxPanel = new JFXPanel();
        //Добавим панель, тепрь мы можем использовать javaFX в нашей программе:
        jFrame.add(jfxPanel);

        jFrame.setSize(500, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Теперь добавим группу и сцену и положим ее в панель:
        Group root = new Group();
        Scene scene = new Scene(root, Color.GOLDENROD);
        root.getChildren().add(new Button("press"));
        jfxPanel.setScene(scene);
        /*Таким образом мы можем использовать javaFX в Swing!*/
    }
}
