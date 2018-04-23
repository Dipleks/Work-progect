package Декабрь_12;/*Binary Search - поиск*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Binary_Search {
    public static void main(String[] args) {
/*Допустим у нас есть лист и мы добавляем в него элементы:*/
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }

        //Для поиска у нас есть:
        Collections.sort(list); //сортируем коллекцию
        int index = Collections.binarySearch(list, 5); //он возращает индекс
        System.out.println(index); //индекс
        System.out.println(list.get(index)); //значение
    }
}
