package Patterns.Patterns_1_15;/*Factory перевод фабрика*/

public class Patterns_2 {
    public static void main(String[] args) {
//Теперь можем вызвать наши машины:
        Factory factory = new Factory();
        Car toyota = factory.create("Toyota");
        Car audi = factory.create("Audi");
        toyota.drive();
        audi.drive(); }}
//Создадим машину:
interface Car {
    void drive();}
//Мы должны ввыпускать какие-то конкретные машины:
class Toyota implements Car{
    @Override
    public void drive() {
        System.out.println("drive Toyota"); }}
class Audi implements Car{
    @Override
    public void drive() {
        System.out.println("drive Audi"); }}

/*У нас есть фабрика которая что-то производит:*/
class Factory {
    //Car - это то что мы будем производить:
    //Но мы пока не знаем какую машину мы будем производить
    //тайоту или ауди, поэтому добавим параметр String typeOfCar
    public Car create(String typeOfCar){
        switch (typeOfCar){
            case "Toyota": return new Toyota(); //если заказали тоёту
            case "Audi": return new Audi(); //если заказали ауди
            default: return null; //если ничего не заказали
        } }}