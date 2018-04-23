package Практические_занятия.Tresss;

import java.io.*;

public class SerializableMyPro {
    //создаем скриализацию, сохраняем состояние данных:
    public boolean serializable (TableBasik tableBasik, String znacheniya) throws IOException {
        boolean nachalnoeZnachenie = false;

        //создаем фаил принимающий наши значения:
        File file = new File(znacheniya);
        //создаем поток передающий фаил:
        FileOutputStream poluchaemDB = new FileOutputStream(file);
        //создаем объект передающий поток файлов:
        ObjectOutputStream objectIzFile = new ObjectOutputStream(poluchaemDB);
        //записывем наши данные в фаил:
        objectIzFile.writeObject(tableBasik);
        //возрашаем наше начальное значение:
        return nachalnoeZnachenie;
    }

    //создаем десиарилизацию, извлекаем данные:
    public TableBasik deserialization (String znacheniya) throws IOException, ClassNotFoundException {

        //Создаем фаил принимающий наши сериализованные значения:
        File file = new File(znacheniya);
        //создаем поток файлов принимающий фаил с сериализованными значениями:
        FileInputStream izvlekaem = new FileInputStream(file);
        //создаем объект принимающий поток файлов:
        ObjectInputStream izvlekaemInObject = new ObjectInputStream(izvlekaem);
        //создаем новый ClassDB в который записываем наши данные:
        TableBasik tableBasik = (TableBasik) izvlekaemInObject.readObject();
        //возвращаем наши сохраненные значения:
        return tableBasik;
    }
}
