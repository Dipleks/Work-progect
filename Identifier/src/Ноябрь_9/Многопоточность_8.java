package Ноябрь_9;
/*Расмотрим DeadLock. Дэдлок это когда 2 потока пытыются
* получить значения друг друга. Т.е. у нас есть поток "А"
* он ссылается на значение потока "В", в это же время поток
* "В" хочет получить значение потока "А", но пока поток
* "А" не закончит работу поток "В" не может получить его значение
* в свою очередь поток "А" не может завершить выполнение,т.к.
* не может получить значение потока "В" пока он не закончит работу!
* Итогом становится зависание программы! Вот пример deadlock:*/
public class Многопоточность_8 {
    public static void main(String[] args) {
        //Так как объекты ссылаются друг на друга
        //есть вероятность что они попадут в deadlock!
        ResourseA resourseA = new ResourseA();
        ResourseB resourseB = new ResourseB();
        resourseA.resourseB = resourseB;
        resourseB.resourseA = resourseA;
        MyThaerd1 myThaerd1 = new MyThaerd1();
        MyThaerd2 myThaerd2 = new MyThaerd2();
        myThaerd1.resourseA = resourseA;
        myThaerd2.resourseB = resourseB;
        myThaerd1.start();
        myThaerd2.start(); }}
class MyThaerd1 extends Thread {
    ResourseA resourseA;
    @Override
    public void run(){
        System.out.println(resourseA.getI());
    }}
class MyThaerd2 extends Thread {
    ResourseB resourseB;
    @Override
    public void run(){
        System.out.println(resourseB.getI());
    }}
class ResourseA {
    ResourseB resourseB;
    public synchronized int getI() {
        return resourseB.returnI();
    }
    public synchronized int returnI(){
        return 1;
    }}
class ResourseB {
    ResourseA resourseA;
    public synchronized int getI() {
        return resourseA.returnI();
    }
    public synchronized int returnI(){ return 2; }}