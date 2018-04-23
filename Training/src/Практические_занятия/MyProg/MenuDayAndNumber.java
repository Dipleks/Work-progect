package Практические_занятия.MyProg;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Separator;

public interface MenuDayAndNumber {
    String n1 = new String("1 позиция, 1 день");
    String n2 = new String("2 позиция, 1 день");
    String n3 = new String("3 позиция, 1 день");
    String n4 = new String("4 позиция, 1 день");
    String n5 = new String("5 позиция, 1 день");
    String n6 = new String("6 позиция, 1 день");
    String n7 = new String("7 позиция, 1 день");
    String n8 = new String("1 позиция, 2 день");
    String n9 = new String("2 позиция, 2 день");
    String n10 = new String("3 позиция, 2 день");
    String n11 = new String("4 позиция, 2 день");
    String n12 = new String("5 позиция, 2 день");
    String n13 = new String("6 позиция, 2 день");
    String n14 = new String("7 позиция, 2 день");
    String n15 = new String("1 позиция, 3 день");
    String n16 = new String("2 позиция, 3 день");
    String n17 = new String("3 позиция, 3 день");
    String n18 = new String("4 позиция, 3 день");
    String n19 = new String("5 позиция, 3 день");
    String n20 = new String("6 позиция, 3 день");
    String n21 = new String("7 позиция, 3 день");
    Separator sp = new Separator();
    ObservableList<?> position = FXCollections.observableArrayList(n1, n2, n3, n4, n5, n6, n7, sp, n8, n9,
            n10, n11, n12, n13, n14, sp, n15, n16, n17, n18, n19, n20, n21);
    ChoiceBox<?> listNumer = new ChoiceBox<>(position);

    default ChoiceBox<?> nuberParam () {
        listNumer.setLayoutX(180);
        listNumer.setLayoutY(40);

        return listNumer;
    }
}
