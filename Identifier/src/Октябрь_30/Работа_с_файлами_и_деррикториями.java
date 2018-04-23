package Октябрь_30;
import java.io.*;
public class Работа_с_файлами_и_деррикториями {
    /*В JAVA есть 6 классов для работы с файлами.
    * Самый простой это File*/
  /*  public static void main(String[] args) throws IOException {
        File file = new File("temp.txt");
        *//*Объект File работает как с дерректориями, так и с файлами!
        * Мы можем проверить циклом является наш temp деррикторией или файлом.*//*
        if (!file.exists()){
            //file.mkdir(); //задаем для файла temp дирректорию
            file.createNewFile(); //задаем для файла temp фаил, при этом создаем
                                  //исключение для нашего метода  throws IOException.
            System.out.println("exists");
        }
        if (file.isDirectory()){
            System.out.println("dir");
        }
        if (file.isFile()){
            System.out.println("file");
        }
    }*/
    /*Есть 2 метода передачи файла
    * Первый более длинный:*/
    /*public static void main(String[] args) throws Exception {
        File file = new File("temp1.txt"); //если не создать фаил с таким именем
                                              //в этом классе, то при компиляции будет
                                              //сообщение отказано в доступе!
        if (!file.exists()){
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file); //в метод можно передать значение или сам фаил.
        fileWriter.write("str1\n"); //1е значение файла (1я сторка)
        fileWriter.write("str2\n"); //2e
        fileWriter.flush(); //этой строкой мы выводим фаил.
        fileWriter.close(); //этой строкой мы закрываем фаил.
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[20]; //читать будем массив
        fileReader.read(chars);
        System.out.println(chars);
    }*/
    /*Есть более короткий метод:*/
    public static void main(String[] args) throws Exception {
        File file = new File("temp1.txt");
        FileWriter fileWriter = new FileWriter(file); //FileWriter позволяет записывать файлы.
        FileReader fileReader = new FileReader(file); //FileReader позволяет читать фалы.
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); //BufferedWriter позволяет записывать файлы.
        bufferedWriter.write("str3");
        bufferedWriter.newLine(); //для перевода строчки пишем метод newLine(), в отличии от прошлого метода \n.
        bufferedWriter.write("str4");
        bufferedWriter.flush();
        bufferedWriter.close();
        BufferedReader bufferedReader = new BufferedReader(fileReader); //BufferedReader позволяет читать фалы.
        while (bufferedReader.ready()){ //создаем цикл для вывода значений, без этого цикла компелятор выведет только
                                        //1е значение str3
            System.out.println(bufferedReader.readLine());
        }
    }
}
