package Patterns.Patterns_16_30;/*Proxy - это промежуточное звено между двумя
классами*/

public class Patterns_16 {
    public static void main(String[] args) {
        CarI carI = new CarProxy();
        carI.drive();
    }
}
//параметры машины
interface CarI{
    void drive();
}
//промежуточный прокси
class CarProxy implements CarI{
    CarI carI = new Reno();

    @Override
    public void drive() {
        carI.drive();
  //так же мы можем добавить свои настройки
        System.out.println("proxy code");
    }
}
//марка машинв
class Reno implements CarI{
    @Override
    public void drive() {
        System.out.println("drive reno");
    }
}