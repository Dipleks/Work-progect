package Ноябрь_9;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*Применение условий в блокировках позволяет добиться
контроля над управлением доступа к потокам. Условие
блокировки представлет собой объект интерфейса Condition
из пакета java.util.concurrent.locks.
Применение объектов Condition во многом аналогично
использованию методов wait/notify/notifyAll класса Object,
которые были рассмотрены в одной из прошлых тем. В частности,
мы можем использовать следующие методы интерфейса Condition:
   - await: поток ожидает, пока не будет выполнено некоторое условие
и пока другой поток не вызовет методы signal/signalAll.
Во многом аналогичен методу wait класса Object;
   - signal: сигнализирует, что поток, у которого ранее был вызван
метод await(), может продолжить работу. Применение аналогично
использованию методу notify класса Object;
   - signalAll: сигнализирует всем потокам, у которых
ранее был вызван метод await(), что они могут продолжить
работу. Аналогичен методу notifyAll() класса Object.
Эти методы вызываются из блока кода, который попадает под
действие блокировки ReentrantLock.*/
public class Многопоточность_13 {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    static int i = 0;
    public static void main(String[] args) {
        new BalanceMinus().start();
        new BalancePlus().start();
    }
    static class BalancePlus extends Thread {
        @Override
        public void run() {
            lock.lock();
            i += 20;
            condition.signal();
            lock.unlock();
        }
    }
    static class BalanceMinus extends Thread{
        @Override
        public void run() {
            if (i<10){
                lock.lock();
                System.out.println("Баланс начальный - "+i);
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Баланс после увеличения - "+i);
                lock.unlock();
            }
            i -= 10;
            System.out.println("Баланс после всех операций "+ i);
        }
    }
}
