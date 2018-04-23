package test;

import java.util.ArrayList;
import java.util.List;

public class Jed {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        String s = "1";
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
        for (int i = 0; i < 5; i++) {

            list.add(0, s);

        }
        System.out.println(list);

    }
}
