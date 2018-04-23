package Patterns.Patterns_1_15;/*Bridge - помогает избежать эффекта
бесконечной пирамиды! К примеру у нас есть квадрат и овал,
квадрат делится на две ветки красный и зеленый, и овал делится на две
ветки фиолетовый и голубой, они в свою очередь могут делится еще на маленькие
и большие; к квадрату и овалу могут добавится еще цвета, к маленьким и большим
могут прибавится еще ветки с др. параметрами и так может быть
до бесконечности по принципу пирамиды!

Bridge позволит нам не создавать множество веток, а помещать все параметры
в одну.*/

//Пример использованя моста (Bridge):
public class Patterns_10 {
    public static void main(String[] args) {
        ICar iCar = new ToyotaICar(new CarBridge());
        iCar.drive();
        ITreak treak = new ToyotaITreak(new TreakBridge());
        treak.drive();
    }
}
//Есть у нас машина и она может ехать:
//interface ICar { void drive();}
////И еще машина которая тоже может ехать:
//interface ITreak { void drive();}
//И есть у нас марки машин имплементящие методы машин:
//class ToyotaICar implements ICar{}
//class AudiICar implements ICar{}
//class ToyotaITreak implements ITreak{}
//class AudiITreak implements ITreak{}
//А теперь представим что этих марок будет 1000, что создаст очень длинный код!
/*Для избежания этого мы должны сделать так:*/
//интерфейс вридж и добавим в абстрактные классы
interface IBridge { void drive();}
abstract class ICar {
    IBridge iBridge;
    public ICar(IBridge iBridge) { this.iBridge = iBridge; }
    public abstract void drive();}

abstract class ITreak {
    IBridge iBridge;
    public ITreak(IBridge iBridge) { this.iBridge = iBridge; }
    public abstract void drive();}

class ToyotaICar extends ICar{
    public ToyotaICar(IBridge iBridge) { super(iBridge); }
    @Override
    public void drive() {
        System.out.println("drive Toyota"); }}
class AudiICar extends ICar{
    public AudiICar(IBridge iBridge) { super(iBridge); }
    @Override
    public void drive() { System.out.println("drive Audi"); }}

class ToyotaITreak extends ITreak{
    public ToyotaITreak(IBridge iBridge) { super(iBridge); }
    @Override
    public void drive() { System.out.println("drive Toyota"); }}
class AudiITreak extends ITreak{
    public AudiITreak(IBridge iBridge) { super(iBridge); }
    @Override
    public void drive() { System.out.println("drive Audi"); }}

//Добавим имплементации к бридж:
class CarBridge implements IBridge{
    @Override
    public void drive() { System.out.println("drive Car"); }}
class TreakBridge implements IBridge{
    @Override
    public void drive() { System.out.println("drive Treak");}}