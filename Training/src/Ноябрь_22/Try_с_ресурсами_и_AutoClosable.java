package Ноябрь_22;/*Try с ресурсами и AutoClosable*/

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Try_с_ресурсами_и_AutoClosable {
    //public static void main(String[] args) {
 /*Допустим у нас есть необходимо прочесть какой-нибудь
 * ридер, но проблем будет заключаться в том что он нам
 * выдаст ошибку и это еще не все... Наш ридер имплементит
 * Closeable, а это значит что его еще необходимо закрыть
 * (close), таким образом мы получим очень длинный код:*/
//        Reader reader = null;
//        try {
//            reader = new FileReader(new File("someFailName"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }}
 /*А теперь предсавим что у нас таких строчек будет множество,
 * в этом случае код будет очень длинным. Для решения этой проблемы
 * в JAVA 7 появился AutoClosable, позволяющий закрывать наш try автоматически:*/
    //теперь наш try будет как трай ресурс try():
//    public static void main(String[] args) {
//        try(Reader reader = new FileReader(new File("someFailName"))) {
//        } catch (IOException e) {
//            e.printStackTrace();
//        } //В try() ресурс мы можем поместить несколько объектов!
//    }
    //Так же мы можем схитрить, создав класс котороый будет имплементить наш AutoClosable:
    static class MyClass implements AutoCloseable{
        @Override
        public void close() throws Exception {
            Reader reader = new FileReader(new File("someFailName"));
        }
    }
    public static void main(String[] args) {
        try(MyClass myClass = new MyClass()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Список основных классов которые имплементят Closeable:
//stream, которые используются чтения и записи файлов:
    Reader reader;
    Writer writer;
    InputStream inputStream;
    OutputStream outputStream;
//gdbc, классы использующиеся при работе с базой данных:
    Connection connection;
    Statement statement;
    ResultSet resultSet;
}

