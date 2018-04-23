package Ноябрь_9;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*ReentrantLock*/
/*Для управления доступом к общему ресурсу в качестве
альтернативы оператору synchronized мы можем использовать
блокировки. Функциональность блокировок заключена в
пакете java.util.concurrent.locks.
Вначале поток пытается получить доступ к общему
ресурсу. Если он свободен, то на поток на него накладывает
блокировку. После завершения работы блокировка с общего
ресурса снимается. Если же ресурс не свободен и на него
уже наложена блокировка, то поток ожидает, пока эта
блокировка не будет снята.
Организация блокировки в общем случае довольно проста:
для получения блокировки вызывается метод lock(), а после
окончания работы с общими ресурсами вызывается
метод unlock(), который снимает блокировку.
Как правило, для работы с блокировками используется
класс ReentrantLock из пакета java.util.concurrent.locks.
Данный класс реализует интерфейс Lock.*/
/*Рассмотрим пример:*/
public class Многопоточность_11 {
    public static void main(String[] args) throws Exception{
        Potok2 potok2 = new Potok2();
        potok2.i = 5;
        potok2.j = 5;
        Potok3 potok3 = new Potok3();
        Potok3 potok31 = new Potok3();
        potok3.potok2 = potok2;
        potok31.potok2 = potok2;
        potok3.start();
        potok31.start();
        potok3.join();
        potok31.join();
        System.out.println(potok2.i);
        System.out.println(potok2.j);
    }
    static class Potok3 extends Thread {
        Potok2 potok2;
        @Override
        public void run(){
            potok2.znachenieI();
            potok2.znachenieJ();
        }
    }
}
class Potok2{
    int i;
    int j;
    Lock lock = new ReentrantLock();
    void znachenieI(){
        lock.lock(); //начало.помещаем объект в ReentrantLock
        int i = this.i;
        if (Thread.currentThread().getName().equals("1е значение!")){
            Thread.yield();
        }
        i++;
        this.i = i;
    }
    void znachenieJ(){
        int j = this.j;
        if (Thread.currentThread().getName().equals("2е значение!")){
            Thread.yield();
        }
        j++;
        this.j = j;
        lock.unlock(); //конец.помещаем объект в ReentrantLock
    }
}
