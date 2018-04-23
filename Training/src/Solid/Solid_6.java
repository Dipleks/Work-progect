package Solid;/*Dependency Inversion
Принцип инверсии зависимостей (англ. dependency inversion principle, DIP) —
важный принцип объектно-ориентированного программирования, используемый
для уменьшения зацепления в компьютерных программах. Входит в пятёрку
принципов SOLID.
Формулировка:
  - Модули верхних уровней не должны зависеть от модулей нижних уровней.
Оба типа модулей должны зависеть от абстракций.
  - Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.
*/
public class Solid_6 {
    public static void main(String[] args) {

    }
}
/*Пролема ниженаписанного кода что Client знает о DataAccess!
* А представим что у нас эта цепочка намного длинней, это создает слишком много зависимостей!
* Помимо этого, например наш DataAccess может использоваться еще где-то, что при изменении
* может затронуть другие программы.*/
//class DataAccess {
//    void execute(){ System.out.println("execute"); }}
//class Client {
//    DataAccess dataAccess = new DataAccess();
//    void doJob(){ dataAccess.execute(); }}
/*Правильно будет разбить код на слои, чтоб классы ничего не знали друг о друге
* и не могли контролировать друг друга:*/
//Создадим промежуточный интерфейс (он не знает о классах, а классы знают! о нем!)
interface DAO{
    void execute();
}
class DataAccess implements DAO{
    @Override
    public void execute(){
        System.out.println("execute");
    }
}
class Client {
    DAO dao = new DataAccess();
    void doJob(){
        dao.execute();
    }
}