package Декабрь_19;/*Интерфейс Externalizer*/

import java.io.*;

public class ExternalizerLesson {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //при сериализации используем как обычно ObjectOutputStream
        House house = new House();
        house.rooms = 5;
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("FileTest.txt")));
        house.writeExternal(objectOutputStream); //запишем данные в наш фаил
        objectOutputStream.close();

        //прочитаем данные из файла:
        House house2 = new House();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("FileTest.txt")));
        house2.readExternal(objectInputStream);
        System.out.println(house2.rooms);
    }
    /*Создадим класс, и мы хотим получить его сериализацию (Serializable), но
    * не обычную, а контролируемую, для этого имплементим Externalizable*/
    static class House implements Externalizable {
        int rooms;

        @Override
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeInt(rooms);
        }

        @Override
        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            rooms = objectInput.readInt();
        }
    }
}
