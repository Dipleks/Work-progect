package Ноябрь_01;

import java.util.*;

/*
public class Сортировка_коллекций_и_интерфесы {
    //Отсортируем коллекцию Set:
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add("4");
        set.add("3");
        set.add("1");
        set.add("2");
        for (Object o : set){
            System.out.println(o); //Ответ: 1,2,3,4
        } }}
*/
/*Но допустим у нас есть какой-нибудь класс Person,
* со значением age, как будет вести себя Set:*/
/*class Person {
    int age; //генерируем конструктор Alt+Insert

    public Person(int age) {
        this.age = age;
    }
}
public class Сортировка_коллекций_и_интерфесы {
    //Отсортируем коллекцию Set:
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(new Person(4));
        set.add(new Person(3));
        set.add(new Person(1));
        set.add(new Person(2));
        for (Object o : set){
            System.out.println(o); // Получим ошибку!
        }}}*/
/*В этом случае создаем интерфейс Comparable для нашего класса:*/
/*class Person implements Comparable <Person>{
    int age;

    public Person(int age) {
        this.age = age;
    }
    //Переопределяем класс интерфейс:
    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    } //После этого произойдет сортировка с
      //таким ответом: Ноябрь_01.Person@154617c
      //               Ноябрь_01.Person@a14482
      //               Ноябрь_01.Person@140e19d
      //               Ноябрь_01.Person@17327b6
    //добавим еще переопределение toString Alt+Insert:

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    } //Теперь получим такой ответ: Person{age=1}
      //                            Person{age=2}
      //                            Person{age=3}
      //                            Person{age=4}
}
public class Сортировка_коллекций_и_интерфесы {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(new Person(4));
        set.add(new Person(3));
        set.add(new Person(1));
        set.add(new Person(2));
        for (Object o : set){
            System.out.println(o);
        }}}*/

/*Но допустим мы не можем переопределить Person,
* тогда нам на помощь придет интерфейс Comparator:*/
/*
class Person {
    int age;

    public Person(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
//Создаем класс:
class ComperPerson implements Comparator<Person>{
    @Override
    public int compare (Person o1, Person o2){
        return o1.age - o2.age;
    } //Теперь получим такой ответ: Person{age=1}
      //                            Person{age=2}
      //                            Person{age=3}
      //                            Person{age=4}
}

public class Сортировка_коллекций_и_интерфесы {
    public static void main(String[] args) {
        ComperPerson comperPerson = new ComperPerson();
        Set set = new TreeSet(comperPerson);
        set.add(new Person(4));
        set.add(new Person(3));
        set.add(new Person(1));
        set.add(new Person(2));
        for (Object o : set){
            System.out.println(o);
        }}}*/
/*Допустим шаше интовое значение приватное
* тогда создаем геторы:*/
class Person {
    private int age; //делаем приватным и создаем get.

    public int getAge() {
        return age;
    }

    public Person(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
//Создаем класс:
class ComperPerson implements Comparator<Person>{
    @Override
    public int compare (Person o1, Person o2){
        return o1.getAge() - o2.getAge();
    } //Теперь получим такой ответ: Person{age=1}
    //                            Person{age=2}
    //                            Person{age=3}
    //                            Person{age=4}
}

public class Сортировка_коллекций_и_интерфесы {
    public static void main(String[] args) {
        ComperPerson comperPerson = new ComperPerson();
        Set set = new TreeSet(comperPerson);
        set.add(new Person(4));
        set.add(new Person(3));
        set.add(new Person(1));
        set.add(new Person(2));
        for (Object o : set){
            System.out.println(o);
        }}}