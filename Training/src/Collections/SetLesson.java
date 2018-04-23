package Collections;/*Set*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetLesson {
    public static void main(String[] args) {
        /*Сэты как ранее говорилось уникальны:*/
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
//        hashSet.add("one");
//        hashSet.add("one");
//        hashSet.add("one");
//        System.out.println(hashSet.size());
        /*В результате вывода данного кода получим 1, т.к
        * наши объекты считаются одинаковыми и хранятся в одной
        * ячейке памяти.*/
        /*Также мы можем поместить null в наш объект:*/
//        hashSet.add(null);
//        System.out.println(hashSet.size());

        /*HashSet хранит значения в рандомном порядке, пример:*/
//        hashSet.add("One");
//        hashSet.add("Two");
//        hashSet.add("Three");
//        hashSet.add("Fou");
//        hashSet.add("Five");
//        for (String s : hashSet){
//            System.out.println(s);} //в результате получим все значения в разброс.

        /*LinkedHashSet выведет все значения по порядку:*/
//        linkedHashSet.add("One");
//        linkedHashSet.add("Two");
//        linkedHashSet.add("Three");
//        linkedHashSet.add("Fou");
//        linkedHashSet.add("Five");
//        for (String s : linkedHashSet){
//            System.out.println(s); }
        /*TreeSet автоматически отсортирует значения по алфавиту:*/
        treeSet.add("One");
        treeSet.add("Two");
        treeSet.add("Three");
        treeSet.add("Fou");
        treeSet.add("Five");
        for (String s : treeSet){ System.out.println(s); } }}