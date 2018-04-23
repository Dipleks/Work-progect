package sample;

import javafx.scene.control.ComboBox;

import java.util.List;

public class Controller {
    public void dl(){
        System.out.println("test");
    }
    public void box(){
        ComboBox<String> comboBox1 = new ComboBox<>();
        comboBox1.getItems().add("testing");
    }
}
