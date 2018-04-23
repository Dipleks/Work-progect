package Декабрь_18;/*Immutable коллекции*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableLesson {
    public static void main(String[] args) {
        //создадим Immutable коллекции:
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        List<String> arrayList = Collections.unmodifiableList(list); //Immutable
        for (String s : arrayList){
            System.out.println(s);
        }
        /*По подобному листу (arrayList) мы можем пробежать, но поместить в него ничего нельзя.
        * По аналогии мы можем получать сеты, мапы.*/
    }
}
