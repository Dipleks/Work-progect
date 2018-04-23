package Solid;/*Interface Sugregation
Принцип разделения интерфейса (англ. Interface Segregation Principle, ISP)
один из пяти принципов проектирования классов в объектно-ориентированном
программировании. Следование этому принципу помогает системе оставаться
гибкой при внесении изменений в логику работы и пригодной для рефакторинга.
Принцип разделения интерфейсов говорит о том, что слишком «толстые»
интерфейсы необходимо разделять на более маленькие и специфические,
чтобы клиенты маленьких интерфейсов знали только о методах, которые
необходимы им в работе. В итоге, при изменении метода интерфейса не
должны меняться клиенты, которые этот метод не используют.*/

public class Solid_5 {
    public static void main(String[] args) {
        IWorker iWorker = new CooK();
        iWorker.work();
        iWorker.eat();
        iWorker.work(); }}
//есть рабочий, у него есть работа и обеденный перерыв:
//interface IWorker{
//    void work();
//    void eat();}
////есть у нас кук:
//class CooK implements IWorker{
//    @Override
//    public void work() { System.out.println("work"); }
//    @Override
//    public void eat() { System.out.println("eat"); }}
///*Допустип наняли еще сотрудника, но который работает полдня:*/
////он не обедает, но переопределить метод придется!
//class Waiter implements IWorker{
//    @Override
//    public void work() { System.out.println("deliver food"); }
//    @Override
//    public void eat() { }}

/*Но согласно 4 принципу это неправельный подход, т.к у нас недолжно
* возникать ситуаций как с официантом. А правильно, так:
* мы разбиваем "жирный" интерфейс на два и экстендим их в один!*/
interface Worker{ void work();}

interface Eater { void eat();}

interface IWorker extends Worker, Eater{ }

class CooK implements IWorker{
    @Override
    public void work() { System.out.println("work"); }
    @Override
    public void eat() { System.out.println("eat"); }}

class Waiter implements Worker{
    @Override
    public void work() { System.out.println("deliver food"); }}