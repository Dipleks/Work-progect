package Patterns.Patterns_1_15;/*Abstract Factory
это таже фабрика, только которая производит другие фабрики.*/

public class Patterns_3 {
    public static void main(String[] args) {
 /*Теперь применим нашу фабрику фабрик:*/
        Factoryy carFactoryy = new AbstractFactory().creatFactoryy("Car");
        Factoryy tankFactoryy = new AbstractFactory().creatFactoryy("Tank");
        Car1 toyota = carFactoryy.createCar("Toyota");
        Car1 audi = carFactoryy.createCar("Audi");
        Tank t51 = tankFactoryy.createTank("T51");
        Tank t52 = tankFactoryy.createTank("T52");
        toyota.drive();
        audi.drive();
        t51.drive();
        t52.drive(); }}

/*Допустим у нас есть две фабрики 1я производит машины, 2я танки:*/
interface Car1 {
    void drive();}
class Toyota1 implements Car1{
    @Override
    public void drive() {
        System.out.println("drive Toyota"); }}
class Audi1 implements Car1{
    @Override
    public void drive() {
        System.out.println("drive Audi"); }}
class CarFactory implements Factoryy{
    public Car1 createCar(String typeOfCar){
        switch (typeOfCar){
            case "Toyota": return new Toyota1();
            case "Audi": return new Audi1();
            default: return null; } }
    @Override
    public Tank createTank(String typeOfTank) {
        return null; }}

interface Tank {
    void drive();}
class T51 implements Tank{
    @Override
    public void drive() {
        System.out.println("drive T51"); }}
class T52 implements Tank{
    @Override
    public void drive() {
        System.out.println("drive T52"); }}
class TankFactory implements Factoryy{
    public Tank createTank(String typeOfCar){
        switch (typeOfCar){
            case "T51": return new T51();
            case "T52": return new T52();
            default: return null; } }
    @Override
    public Car1 createCar(String typeOfCar) {
        return null; }}

//Теперь создадим фабрику которая будет производить наши фабрики:
class AbstractFactory{
        Factoryy creatFactoryy (String typeOfFactoryy){
            //Теперь мы можем производить наши фабрики
            switch (typeOfFactoryy){
                case "Car": return new CarFactory();
                case "Tank": return new TankFactory();
                default: return null; } }}
//Создадим тип фабрик, от которого будут наследоваться все наши фабрики:
interface Factoryy {
        Car1 createCar (String typeOfCar);
        Tank createTank (String typeOfTank);}