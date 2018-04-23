package Collections;/*List*/

import java.util.*;

public class ListLesson {
    public static void main(String[] args) {
        /*Главное отличие листов отдр коллекций то, что
        * они индексируются, т.е имеют свой номер!
        * Самая распространеная имплементация это аррэйлист:*/
/*1*/   List<String> arrayList = new ArrayList<>();
    /*ArrayList создает дэфолтовое значение массива (10), но можно и указать
    * свой размер массива (ArrayList(20)). Когда массив заканчивается, ArrayList
    * расширяет его динамически!*/
/*2*/   List<String> linkedList = new LinkedList<>();
    /*LinkedList работает на основе нодов (Node) он указывает ссылку на первый
    * объект и на последний. Работает как список: первый указывает на второй,
    * второй на третий и т.д.*/
/*3*/   List<String> vector = new Vector<>();
    /*Vector это тоже самое что и LinkedList, с тем отличием, что у него все методы
    * синхронизированны и являются более безопасными.*/
/*4*/   List<String> stack = new Stack<>();
    /*Stack обладает тем же функционлало что и Vector, работает подобно очереди, но по
    * принципу "последний зашел первым вышел"!*/
/*5*/   List<String> synchList = Collections.synchronizedList(new ArrayList<>());
    /*Так же как и Vector потокобезопасен, с помощью synchronizedList делает обертки
    * листов и синхронизирует их методы. */

//        arrayList.add("A");
//        arrayList.add("C");
//        arrayList.add("B");
    /*используя новый for, который пробегает по списку спомощью итератора, мы не можем
    * добавить или удалить элемент, для этого нужно использовать старый for:*/
//    for (String s : arrayList){ //новый
//        System.out.println(s);
//        arrayList.add("D"); }
//    for (int i = 0; i < arrayList.size(); i++){ //старый, без итератора
//        System.out.println(arrayList.get(i));
//        arrayList.add("D"); }

     /*Если нам необходимо выполнить сортировку, то со стрингими никаких проблем не будет,
     * но если мы будем использовать другие значения, например из класса Студент int значения, то
     * получим эсепшен, для того чтоб этого не произошло необходимо зимплементить классом студент
     * интерфейс Comparable и переопределить его метод compareTo.*/
//     Collections.sort(arrayList);
//     for (String s : arrayList){
//         System.out.println(s); }

      /*Можно применить бинарный поиск который работает намного быстрей, если бы мы
      * проверяли каждый элемент по отдельности, но для его реализации элементы должны быть
      * отсортированы:*/
//        Collections.sort(arrayList);
//        System.out.println(arrayList.get(Collections.binarySearch(arrayList, "B")));

        /*Можно превращать наши листы в массив листов и на оборот:*/
//        String[] strings = new String[arrayList.size()];
//        strings = arrayList.toArray(strings);
//        List<String> stringList = Arrays.asList(strings);

        /*можем вывести toString*/
//        System.out.println(arrayList.toString());
        /*можем сравнить (equals) объекты:*/
//        System.out.println(arrayList.equals(stringList));

        /*Vector это самостоятельная коллекция и она будет копировать данные, а
        * synchronizedList делает обертку данных. При добавлении элементов Vector
        * работает быстрее. synchronizedList позволяет пробигать по коллекции быстрее.
        * Проверим на примере, что лучше synchronizedList или Vector:*/
        List<Integer> arrayList1 = new ArrayList<>();
        List<Integer> vector1 = new Vector<>();
        List<Integer> synchList1 = Collections.synchronizedList(new ArrayList<>());
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 10_000_000; i++) {
//            //arrayList1.add(i); //время 2388
//            //vector1.add(i); //время 2071
//            synchList1.add(i); //время 2497
//        }
//        System.out.println(System.currentTimeMillis() - start);
        /*Как видно из примера synchronizedList работает медленее, а
        * Vector быстрее! Работа вектора при итерации:*/
        for (int i = 0; i < 10_000_000; i++) {
            //arrayList1.add(i);
            vector1.add(i);
            //synchList1.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            //new Integer(arrayList1.get(i)); //время 3262
            new Integer(vector1.get(i)); //время 1242
            //new Integer(synchList1.get(i)); //время 3282
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
