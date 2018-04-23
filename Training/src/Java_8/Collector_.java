package Java_8;/*Collector_*/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Collector_ {
    public static void main(String[] args) {
        /*У нас есть значения и спомощью колекций мы их можем передать
        * в лист, например, аррэйлист:*/
        Stream.of("One", "Two").collect(toCollection(ArrayList::new));
        //или трисет
        Stream.of("One", "Two").collect(toCollection(TreeSet::new));

        //мы можем коллекцию разделить на 2 части, например числа >2 и числа <2:
        Map<Boolean, List<Integer>> map = Stream.of(1, 2, 3, 4).collect(partitioningBy(x -> x > 2));
        //можем групировать:
        Map<Integer, List<Integer>> map2 = Stream.of(1, 2, 1, 4).collect(groupingBy(x -> x));

        /*Данный стрим позволяет объденить/обромить значения с помощью,
        например фигурных скобок и разделить значения запятой:*/
        String resul = Stream.of("one", "two", "three").collect(joining(",", "{","}"));
        System.out.println(resul); // {one,two,three}

        //можем посчитать кол-во вхождений:
        Map<Integer, Long> map3 = Stream.of(1, 2, 1, 4).collect(groupingBy(x -> x, counting()));
        System.out.println(map3.get(1)); //ответ: 2, т.е в еденицу было два вхождения
    }
}
