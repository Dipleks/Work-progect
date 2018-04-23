package Java_8;/*Streams*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Streams_ {
    public static void main(String[] args) {
        //Допустим у нас есть лист:
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        //и мы выводим их:
//        for (String s : list){
//            System.out.println(s);
//        }
    /*В развернутом виде запись цикла фор выглядит так:*/
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
   //И этот код можно улучшить(Стрим привращает все значения в поток):
//        Stream<String> stream = list.stream();
//        stream.forEach(x -> System.out.println(x));
        //это мы можем сократить даже до одной строки:
//        list.stream().forEach(x -> System.out.println(x));
   /*Стримы каждый раз необходимо получать новый, 2 раза один и тотже стрим вызвать не получится!
   * к примеру:
   *          stream.forEach(x -> System.out.println(x));
   *          stream.forEach(x -> System.out.println(x));
   * В результате вылетит эсепшен!*/

        //можем использовать фильтры у стримов (все стримы принимают насебя методы функциональных интерфейсов):
//        list.stream().filter(x -> x.equals("one")); //не выполнится, т.к он lazy - ленивый
//        list.stream().filter(x -> {
//            System.out.println(x);
//             return x.equals("one"); }).count(); //теперь выполнится, count eager - жаждующий

        //можем поместить наш стринг в коллекцию:
//        list.stream().collect(Collectors.toSet());
        /*Стримы могут идти следом друг за другом через точку!*/
//        list.stream().map(x -> x.toUpperCase()); //превращает одни объекты в другие (квадраты в круги, инты в стринги и т.д)

        /*Можем здать листы массивами, и тумапом превращам их в последовательность:*/
        Stream.of(asList("one", "two"), asList("three", "four")).flatMap(x -> x.stream());
        /*Это примерно выглядит так {{1,2},{3,4},{5,6}} -> flatMap -> {1,2,3,4,5,6}*/

        /*Можем вернуть минимальное и максимальное значение:*/
        int value = Stream.of(1, 2).min(Comparator.comparing(x -> x)).get();
        int value1 = Stream.of(1, 2).max(Comparator.comparing(x -> x)).get();

        /*Пробегаем по всем значениям и делаем их сумму:*/
        int count = Stream.of(1, 2, 3).reduce(0, (acc, element) -> acc + element);

        Stream.of("one", "two").sorted().collect(Collectors.toList()); //сортирует
        Stream.of("one", "two").limit(1).collect(Collectors.toList()); //берем значение, в данном случае первое
        Stream.of("one", "one").distinct().collect(Collectors.toList()); //если не хотим повторения значений, то делаем их уникальными с помощью distinct.
        Stream.of("one", "two").skip(1).collect(Collectors.toList()); //говорит сколько значений пропустить
        Stream.of("one", "two").filter(x -> x.equals("one")).findAny().get();
        Stream.of("one", "two").filter(x -> x.equals("one")).findAny().isPresent();
        Stream.of(1, 2).mapToInt(x -> x).sum(); //превращаем все в интовые значения, смотреть пример с IntStream
        Stream.of(1, 2).count();
        Stream.of("one", "two").peek(x -> x.toUpperCase()).findFirst().get();

        /*пример*/
        IntStream intStream = Stream.of(1, 2).mapToInt(x -> x);
        intStream.summaryStatistics().getAverage();
    }
}
