package Октябрь_30;

import java.io.*;

public class Сериализация_наследуемых_объектов {
    public static void main(String[] args) throws Exception {
        UserNewNew userNew = new UserNewNew();
        userNew.xp = 1200;
        userNew.hilvl = 150;

        FileOutputStream fileOutputStream = new FileOutputStream("userNew");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(userNew);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("userNew");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        UserNewNew newUser = (UserNewNew) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(newUser.hilvl);
        System.out.println(newUser.xp); //Ответ выведется 0., т.к. класс UserNew не является
           //сериализируемым и значение выводится по умолчанию!
    }}
/*Для того чтобы вывести значения класса UserNew нам необходимо объявить его Serializable
* после чего при компиляции мы получим наше значение!*/
