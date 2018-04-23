package FX;/*Collections*/

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class FX_19 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        ObservableList<String> observableList = FXCollections.observableList(list);
        observableList.addListener(new ListChangeListener<String>() {
            @Override
            public void onChanged(Change<? extends String> c) {
                System.out.println("list was changed");
            }
        });
        observableList.add("one"); //добавим 1й элемент запустится код "list was changed"
        list.add("two"); //добавим 2й код уже не запустится
        System.out.println(list.size()); //получим размеры листов
        System.out.println(observableList.size()); //получим размеры листов
        //В итоге в каждом элементе будет по 2 листа.
    }
}
