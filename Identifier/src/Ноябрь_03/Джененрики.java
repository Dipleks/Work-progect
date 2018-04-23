package Ноябрь_03;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//public class Джененрики {
/*Дженненрики (Generic) или обобщения это параметризованные типы.
* С их помощью можно объявлять классы, интерфейсы и методы,
* где тип данных указан в виде параметра. Обобщения добавили в
* язык безопасность типов.*/
/*public static void main(String[] args) throws Exception{
    Джененрики джененрики =new Джененрики();
    //джененрики.<String>method("123");
    //джененрики.<Integer>method(1); //Типы в <> можно неписать, т.е:
    джененрики.method("123"); //без <> все так же работает.
    //Можем передать даже new Джененрики():
    джененрики.method(new Джененрики());
}
//Для примера напишем обобщенный метод:
    <T> T method(T type){
        System.out.println(type);
    return type; //Главным отличием от обычного метода
        //заключается в его универсальности, т.е. допустим
        //мы не знаем заранее с каким типом мы будем работать,
        //а джененрик нам позволяет работать с любым типом.
        //К примеру передадим нашему методу  main стринговое
        //значение 123 или интеджер 1.
    }*/
/*Перейдем к синтаксису, т.е разберем наш джененрик: */
/*<T> T method(T type){
    System.out.println(type);
    return type;}*/
    //<T> - имя параметра типа, имен может быть несколько <T, U,...>
    //T type передоваемый тип, если имен несколько, то и типов несколько!
    //Типы могут быть как возращаемые так и не возращаемые, т.е.:
    //<T> T method(T type) - возращаемый, тут возращется Т;
    //<T> void method(T type) - не возращаемый метод.

    /*Также джененриком у нас может и класс:
    * public class Джененрики <T>, в этом случае
    * весь наш класс становится обобщенным:*/
//}
/*public class Джененрики <T>{
    T var; //можем передавать значения Т.
        public static void main(String[] args) {
            Джененрики<String> джененрики =new Джененрики<>(); //тут можем задать значение которое передаем
            джененрики.var = "sdf";
            System.out.println(джененрики.var); //Ответ: sdf
        }
    }*/
    //Можно задать так же класс:
   /* public class Джененрики <T>{
        T var; //можем передавать значения Т.
        public static void main(String[] args) {
            Джененрики<Car> джененрики =new Джененрики<>(); //тут можем задать значение которое передаем
            джененрики.var = new Car();
            System.out.println(джененрики.var);}}

class Car {}*/

   /*Проблема дженнериков в том что мы с ним сделать ничего не можем,
   * у него ограниченое число действий (классов), нет не гетеров, не сетеров...
   * После точки в
   * */
       /*T method(T type){
           type.
           System.out.println(type);
           return type;}*/
   /* type. он нам выдас методы Object*/
/*Решить эту проблему можно наприер, наследованием:*/

/*class Car extends Джененрики implements Comparable, Serializable{ //при этом класс Car тоже имплементим Comparable
    @Override    //Переопределяем Comparable
    public int compareTo(Object o) {
        return 0;
    }}
//public class Джененрики <T extends Comparable> { //наследуем, например Comparable
public class Джененрики <T extends Джененрики & Comparable & Serializable> {  //так же мы можем добавить и другие
                                               // методы и расширить (extends) класс, при этом необходимо
                                               // расширить и класс Car!
    T var;
    public static void main(String[] args) {
        Джененрики<Car> джененрики =new Джененрики<>();
        джененрики.var = new Car();
        джененрики.method(new Car());
        //System.out.println(джененрики.var);
    }
    T method(T type){
        type.someДжененрики();
        //type.compareTo(new Object()); //теперь помимо класса обджек у нас добавились методы класса Comparable
        //System.out.println(type);
        return type;}

     void someДжененрики (){
         System.out.println("bla"); }}*/

/*Джененрики очень ограничены по классам, их чаще всего
* применяют в Коллекциях, в них удобно хранить информацию.
* Приведем пример с List.*/

/*public class Джененрики <T extends Джененрики & Comparable & Serializable> {
    public static void main(String[] args) {
     *//*1*//*   List<File> list = new ArrayList<>();
     *//*2*//*   List list1 = new ArrayList();
     *//*Разница между 1 и 2, в том что в 1й мы можем запихнуть только наш класс Джененрики:*//*
     //list.add("ывап"); для 1-го случая компилятор будет подчеркивать ошибку в коде,
     //list1.add("ывап"); для 2-го случая компилятор ни как не отреагирует (все хорошо),
        //в него мы можем добавить все что угодно, и это не очень хорошо, потому что
        //у нас может быть, например, for который префодит тип File к
        //какому-либо значению, тем самым ломая наш код:
        list1.add("");
        list1.add(new Джененрики());
        list1.add(new File(""));
        for (Object o:list1){File f = (File)o;}

        list.add(new File(""));
        for (File o1 :list){File f1 = o1;}
    }
    *//*Такого с первым list никогда не призойдет, т.к джинерики в данном
    * случае будут работать только с файлами!*//*
}*/

/*Но джененрики не всегда бывают безопасными,
* например как с void method:*/
/*public class Джененрики <T extends Джененрики & Comparable & Serializable> {
    public static void main(String[] args) {
        List<File> list = new ArrayList<>();
       Джененрики джененрики = new Джененрики();
       джененрики.method(list);
       //Вроде выглядит все замечательно, но проблема старого  метода (void method)
        //в том, что он может залить что-либо в наш дженерик. И если мы
        //попытаемся это вывести получим ошибку:
        for(File file : list){
            System.out.println(file.getAbsoluteFile());
        }
    }
    *//*void method (List list){
        list.add(new Джененрики()); //Ответ: ошибка!
    }*//*
    //Лучше использовать новые дженерик методы:
    void method (List<File> list){} //метод отработает!
}*/

/*Все Джененрики, Comparable, Serializable и т.д. можно использовать и в методах!
* Джененрики не могут быть статическими!*/
/*Например у нас есть класс Parent и Child и мы хотим использовать
* наш List полиморфически:*/

/*class Parent{}

class Child extends Parent{} //экстендим парент

public class Джененрики {
    public static void main(String[] args) {
        List<Parent> list = new ArrayList<Parent>();
        list.add(new Parent());
        list.add(new Child());
        Джененрики джененрики = new Джененрики();
        джененрики.method(list);

        for(Parent parent : list){
            System.out.println(parent); //у нас все отработает!
        }
    }
    void method (List<Parent> list){}
}*/
/*Но если мы хотим использовать Child, тогда метод
* записывем такой строкой: "? extends Parent", тем
* самым сообщая что мы можем передать лист любго класса
* Т.е все что наследуется от Parent мы можем передать:*/
/*
class Parent{}

class Child extends Parent{}

public class Джененрики {
    public static void main(String[] args) {
        List<Child> list = new ArrayList<>();
        list.add(new Child());
        Джененрики джененрики = new Джененрики();
        джененрики.method(list);
    }
    */
/*Но есть одно ограничение, если мы пишем "? extends Parent",
    * то мы не можем добавлять новые значения. Если мы запишем
    * "Parent", то сможем добавить, например, list.add(new Parent()).*//*

    */
/*void method (List<? extends Parent> list){
        for(Parent parent : list){
            System.out.println(parent);
        }}*//*

*/
/*Допустим мы запишем просто List<Parent> list и у нас будет
* еще один класс class Son extends Parent, то при добавлении
* в void method нового значения list.add(new Son()) Child который
* не имеет никакого отношения к Son, будет получать значения класса
* Son, а "? extends Parent" это ограничевает, тем самым делает
* выполнение программы более правельным!
*
* Есть еще сингнетура "?", из нее мы можем получить только объекты:*//*

void method (List<?> list){
    for(Object o : list){
        System.out.println(o);
    }}}*/

/*Если мы все же хотим поменять значения, то для этого есть super:*/
class Parent{
    void a() {
        System.out.println("b");
    }
}
class Child extends Parent{}

public class Джененрики {
    public static void main(String[] args) {
        List<Parent> list = new ArrayList<>();
        list.add(new Parent());
        list.add(new Child());
        Джененрики джененрики = new Джененрики();
        джененрики.method(list);
    }
    void method (List<? super Child> list){
        for(Object o : list){
            //System.out.println(o); //пробегаемся по всем классам
      //Можно применить касты и вызывать ими методы класса, например:
            Parent p = (Parent)o;
            p.a();
        }}}
 /*В нашем методе super говорит о том, что мы можем передать
 * список любых объектов не ниже нашего класса, в данном случае
 * не ниже Child, т.е мы можем передать Child, Parent и Object (т.к
 * все классы наследуются от объектов).
 * В методе super мы можем добавить значения, но только по иерархии
 * ниже нашего super, в нашем случае мы можем
 * добавить list.add(new Son());*/