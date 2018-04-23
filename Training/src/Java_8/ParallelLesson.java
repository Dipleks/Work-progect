package Java_8;/*ParallelLesson*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
public class ParallelLesson {
    public static void main(String[] args) {
        /*простой стрим можно сделать парралельным, т.е
        * такой стрим будет выполнятся сразу на нескольких ядрах нашего процессора!*/
//        Stream stream = Stream.of(1, 2).parallel();
        //так же его можно вызвать так:
//        List list = new ArrayList();
//        list.parallelStream();

        /*приведем пример:*/
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 4_000_000; i++) {list.add(i);
//            list.add(4_000_000 - i); }
//        System.out.println(new Date()); //время начала
//        list.stream().sorted().filter(x -> x%2 == 0).map(x -> new Double(x)).forEach(x -> x.toString()); //зададим много операций
//        System.out.println(new Date()); //врямя окончания
        /*В данном примере операция заняла 5 секунды, теперь применим парралели:*/
//        System.out.println(new Date());
//        list.parallelStream().sorted().filter(x -> x%2 == 0).map(x -> new Double(x)).forEach(x -> x.toString());
        //теперь ушло 3 секунды
//        System.out.println(new Date());

        /*с помощью паралелей мы можем также заполнять массивы:*/
        //без паралелей:
//        int size = 10;
//        double[] val = new double[size];
//        for (int i = 0; i < val.length; i++) {
//            val[i] = i;}
//        //с паралелями:
//        double[] val2 = new double[size];
//        Arrays.parallelSetAll(val2, i -> i);

        /*паралели не всегда удобно, напрмер, если мы выводим данные они будут в разброс:*/
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1_000; i++) { list.add(i); }
        list.parallelStream().forEach(x -> System.out.println(x));
        //а с обычным стримом все операции будут выполнятся друг за другом, и все значения выведутся по порядку:
        list.stream().forEach(x -> System.out.println(x)); }}
