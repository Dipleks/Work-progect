package Ноябрь_9;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*tryLock*/
/*boolean tryLock(): пытается получить блокировку,
если блокировка получена, то возвращает true.
Если блокировка не получена, то возвращает false.
В отличие от метода lock() не ожидает получения
блокировки, если она недоступна*/
public class Многопоточность_12 {
    static Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        new Potoc1().start();
        new Potoc2().start();
    }
    //создаем два потока (внутренние классы)
    static class Potoc1 extends Thread{
        @Override
        public void run() {
            lock.lock();
            System.out.println(getName()+" - запуск программы один!");
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+" - выполняем программу один!");
            lock.unlock();
            System.out.println(getName()+" - завершаем программу!");
        }
    }
    static class Potoc2 extends Thread{
        @Override
        public void run() {
            System.out.println(getName()+" - запуск второй программы!");
            while (true){
                if (lock.tryLock()){
                    System.out.println(getName()+ " - работа программы два!");
                    break;
                } else {
                    System.out.println(getName()+" - ожидание!");
                } } }}}
