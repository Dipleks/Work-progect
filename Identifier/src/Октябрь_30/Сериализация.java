package Октябрь_30;
import java.io.*;
public class Сериализация {
    /*Сериализация представляет процесс записи состояния объекта
    * в поток, соответственно процесс извлечения или восстановления
    * состояния объекта из потока называется десериализацией.
    * Сериализация очень удобна, когда идет работа со сложными объектами.*/
    public static void main(String[] args) throws Exception {
        /*Создадим класс User, в который запишем,
        * какие-либо характреристики героя.*/
        //Создаем нашего героя:
        User user = new User();
        user.xp = 55;
        user.b = 45; //не сеарилизуемое статическое значение!
        //делаем импорт import java.io.*; и создаем исключение Exception.
        /*Создадим еще класс, например Sord, которые будет иметь 5 уровень:*/
        Sord sord = new Sord();
        sord.lvl = 5;
        user.sord = sord;

        FileOutputStream fileOutputStream = new FileOutputStream("userFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); //сохраняем наш объект.
        objectOutputStream.writeObject(user); //создаем объект который хотим сохранить!
        objectOutputStream.close(); //закрываем запись!

        user.b = 35; //В FileOutputStream мы сохранили наше значение, после его переназначили,
        //но при компиляции выведется не сохраненное значение, а переназначеное, т.к. b статична!

        /*Далее извлекаем наш фаил:*/
        FileInputStream fileInputStream = new FileInputStream("userFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream); //создаем извлекаемый объект.
        User newUser = (User) objectInputStream.readObject(); //создаем новый объект.
        objectInputStream.close(); //закрываем программу.
        System.out.println(newUser.xp); //выводим данные нашего объекта.
        System.out.println(newUser.b);  //скомпилировалось 35.
        //System.out.println(newUser.sord.lvl); //компилируем на sord. Ответ: 5
        System.out.println(newUser.sord); //выведем несериализуемое значение. Ответ: null
    }}
    /*Что будет если мы не сериализуем класс Sord, программа выдаст ошибку!
    * Мы можем заэкстендить наш класс и все будет работать, но это
    * не правельно,т.к. например мы не можем изменять код Sord, в
    * таком случем мы используем transient (т.е. несериализуемое значение)!*/
