package Patterns.Patterns_31_36;/*DAO*/

public class Patterns_32 {
 /*Теперь если придет клинет и захочет хранить информацию
 * еще в каком-либо месте, нам достаточно будет написать
 * лишь код для нового места, а способ предачи/получения
 * информации остается тотже. Т.е. мы к новому коду подключаем
 * наш паттерн (DataI) и все!*/
    static DataI dataI = new FileSystem(); //подключаем тут новый код и все!
                         //static DataI dataI = new Db();
    public static void main(String[] args) {
        System.out.println(dataI.getData());
    }
}
//класс который получает информацию с БД и возвращает ее:
class Db implements DataI{
    String getFromTable(){
        return "data from table"; }

    @Override
    public String getData() {
        return getFromTable();
    }
}
/*и пришел клиент и говорит, "давайте хранить все в фаловой системе",
* нам придется писать новый класс и менять данные в дргом классе
* (в нашем случае Patterns_32):*/
class FileSystem implements DataI{
    String getDataFromFs(){
        return "data from fs";
    }
    @Override
    public String getData() {
        return getDataFromFs(); }
}
/*А прдставим что у нас таких классов 50, то это уйма времени на
переделку кода и это изначальная ошибка при написании кода!
DAO патерн нас выручает он, позволяет делать классы взаимо заменяемыми:*/
//создадим интерфейс и имплементим наши информационные классы:
interface DataI{
    String getData();}




