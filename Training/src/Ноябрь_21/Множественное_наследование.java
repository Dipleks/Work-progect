package Ноябрь_21;
/*Множественное наследование классов в java не поддерживается,
* это связано с тем что, если в двух разных классах определен один
* и тот же метод и его вызвать в супер классе, то супер класс
* не будет понимать условие какого метода из 2х классов выполнить.
* Но у нас есть интерфейся позволяющие множественное наследование,
* т.к в них метод не определен (его необходимо переопределять
* в других классах). В JAVA8 в интерфейсах появился для методов
* параметр default, позволяющий определить метод в интерфейсе,
* и если этот метод не будет переопределен, то в супер классе
* он вызовется по умолчанию!
*
* Приведем пример:*/
public class Множественное_наследование {
    public static void main(String[] args) {
        MyNewCar myNewCar = new MyNewCar();
        myNewCar.drive(); //Вызовится метод MyNewCar drive
    }
}
interface Car{
    default void drive (){
        System.out.println("Car drive");
    }
}
class Toyta implements Car {
    public void drive (){
        System.out.println("Toyta drive");
    }
}
interface Motocicle{
    void drive();
}
class Yamaha implements Motocicle{
    public void drive(){
        System.out.println("Yamaha drive");
    }
}
class MyNewCar implements Car, Motocicle{
    public void drive(){
        System.out.println("MyNewCar drive");
    }
}