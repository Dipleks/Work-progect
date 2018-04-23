package Ноябрь_27;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Сравнение_строк {
    public static void main(String[] args) {
        //Допустим у нас есть список листов:
        List<String> list = new ArrayList<>();
        list.add("bb");
        list.add("aa");
        list.add("cc");
        list.add("AA"); //русская А.
        list.add("bc");
        list.add("AA"); //английская А.
        //и нам их необходимо отсортеровать.
        //Для этого, создаем подборочную машину и сортируем по типу:
//        Collator collator = Collator.getInstance();
//        Collections.sort(list, collator);
//        for (String s : list){
//            System.out.println(s);
//        }

        Collator collator = Collator.getInstance();
        //Но допустим у нас присутствую иностранные
        //символы, для этого добавляем один из методов:
        collator.setStrength(Collator.PRIMARY); //A=A, A=a
        collator.setStrength(Collator.SECONDARY); //A!=A, A=a
        collator.setStrength(Collator.TERTIARY); //A!=A, A!=a
        Collections.sort(list, collator);
        for (String s : list){
            System.out.println(s);
        }
    }
}
