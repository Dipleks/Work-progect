package lessons.Lessons_1.l7_Серализация;

import java.io.*;

public class ClassSeriolaizebl {

    //создаем скриализацию, сохраняем состояние данных:
    public boolean serializable (ClassDB classDB, String znacheniya) throws IOException {
        boolean nachalnoeZnachenie = false;

        //создаем фаил принимающий наши значения:
        File file = new File(znacheniya);
        //создаем поток передающий фаил:
        FileOutputStream poluchaemDB = new FileOutputStream(file);
        //создаем объект передающий поток файлов:
        ObjectOutputStream objectIzFile = new ObjectOutputStream(poluchaemDB);
        //записывем наши данные в фаил:
        objectIzFile.writeObject(classDB);
        //возрашаем наше начальное значение:
        return nachalnoeZnachenie;
    }

    //создаем десиарилизацию, извлекаем данные:
    public ClassDB deserialization (String znacheniya) throws IOException, ClassNotFoundException {

        //Создаем фаил принимающий наши сериализованные значения:
        File file = new File(znacheniya);
        //создаем поток файлов принимающий фаил с сериализованными значениями:
        FileInputStream izvlekaemDB = new FileInputStream(file);
        //создаем объект принимающий поток файлов:
        ObjectInputStream izvlekaemInObject = new ObjectInputStream(izvlekaemDB);
        //создаем новый ClassDB в который записываем наши данные:
        ClassDB classDB = (ClassDB) izvlekaemInObject.readObject();
        //возвращаем наши сохраненные значения:
        return classDB;
    }
}
