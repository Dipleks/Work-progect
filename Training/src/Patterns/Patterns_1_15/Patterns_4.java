package Patterns.Patterns_1_15;/*Factory Method
- передоставляет интерфейс для создания самого себя*/

public class Patterns_4 {
    public static void main(String[] args) {
  /*Теперь мы можем воспользоваться нашим персоном:*/
        Person person = Person.create();
 /*Тепрь наш персон вызвал метод сам у себя.*/
    }
}

//У нас есть класс персон и у него есть приватный конструктор персон:
class Person {
/*Конструктор создается приватным для того что бы мы не могли
* его пересоздать.*/
    private Person(){}
    //Теперь у нас должен быть метод персон который вернет самого себя:
    public static Person create(){
        return new Person();
    }
}
