package Ноябрь_07;
/*Класс Object в Java содержит стандартный метод clone(),
который возвращает копию существующего объекта. Для
использования клонирования в Java вам нужно реализовать
интерфейс java.lang.Cloneable, иначе будет брошено
исключение CloneNotSupportedException.*/
/*Есть два вида клонирования поверхностное и глубокое!
* Расмотрим поверхностное клонирование,
* Представим у нас есть класс MyObject:*/
/*
public class Клонирование_объектов {
    public static void main(String[] args) throws Exception {
        MyObject myObject = new MyObject();
        myObject.i = 1;
        MyObject myObject1 = myObject;
        myObject1.i = 2;
        System.out.println(myObject.i);
        */
/*В данном случае выведется "2", т.к мы создали память один раз (new MyObject)
        * и в данном случае мы просто в myObject поместили myObject1, когда поменяли
        * myObject1 на "2".*//*

    }}
class MyObject {
    int i;}*/
/*Для того чтоб такого не было создаем клон:*/
/*public class Клонирование_объектов {
    public static void main(String[] args) throws Exception {
        MyObject myObject = new MyObject();
        myObject.i = 1;
        MyObject myObject1 = myObject.clone();
        myObject1.i = 2;
        System.out.println(myObject.i);
    }}
    *//*Для того чтоб у нас код выполнился мы должны
    * заимплементить наш класс:*//*
class MyObject implements Cloneable {
    int i;
//Alt+Insert - Overr... - clone...
    @Override
    protected MyObject clone() throws CloneNotSupportedException {
        return (MyObject) super.clone();
    }
}*/ /*Теперь мы получим "1", т.к наш myObject склонировался в myObject1*/

/*Так же мы можем клонировать объекты с др.классов:*/
/*public class Клонирование_объектов {
    public static void main(String[] args) throws Exception {
        MyObject myObject = new MyObject();
        myObject.i = 1;
        NewObject newObject = new NewObject(); //создали объект
        newObject.j = 3; //присвоили "3"
        myObject.newObject = newObject; //поместили в myObject newObject
        MyObject myObject1 = myObject.clone();
        myObject1.i = 2;
        System.out.println(myObject.i);
        myObject1.newObject.j = 4; //присвоили myObject1 "4"
        System.out.println(myObject.newObject.j);

    }}
class MyObject implements Cloneable {
    int i;
    //Создадим наш объект:
    NewObject newObject;

    @Override
    protected MyObject clone() throws CloneNotSupportedException {
        return (MyObject) super.clone();
    }
}
class NewObject{
    int j;
}*/
//Если мы хотим сделать глубокое клонирование
//нам необходимо склонировать все ссылочные обекты:
public class Клонирование_объектов {
    public static void main(String[] args) throws Exception {
        MyObject myObject = new MyObject();
        myObject.i = 1;
        NewObject newObject = new NewObject();
        newObject.j = 3;
        myObject.newObject = newObject;
        MyObject myObject1 = myObject.clone();
        myObject1.i = 2;
        System.out.println(myObject.i);
        myObject1.newObject.j = 4;
        System.out.println(myObject.newObject.j);

    }}
class MyObject implements Cloneable {
    int i;
    NewObject newObject;

    @Override
    protected MyObject clone() throws CloneNotSupportedException {
        MyObject myObject = (MyObject) super.clone();
        myObject.newObject = newObject.clone(); //клонируем наш ссылочный объект
        return myObject; //возвращаем наш объект
    }
}
class NewObject implements Cloneable{
    int j;
    //переопределяем класс
    @Override
    protected NewObject clone() throws CloneNotSupportedException {
        return (NewObject) super.clone();
    } //Теперь произойдет глубокое клонирование и мы получим "3"!
}