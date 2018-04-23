package Повторение;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Magazin {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    static int tovar = 3;
    static int kol = 0;
    public static void main(String[] args) {
        new Proizvodstvo().start();
        new Sklad().start();
        new Pokupatel().start();
        new Proizvodstvo().start();

    }

    static class Pokupatel extends Thread{
        @Override
        public void run() {
            lock.lock();
            while (tovar > 0){
            tovar -= 1;
            kol += 1;
                System.out.println("Колличество купленного товара: "+ kol);
                condition.signal();
            }
            System.out.println("Товар распродан!");
            lock.unlock();

        }
    }

    static class Sklad extends Thread{
        @Override
        public void run() {
            lock.lock();
            while (tovar >= 3){
                System.out.println("На складе 3 товара!");
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.unlock();
        }
    }

    static class Proizvodstvo extends Thread{
        @Override
        public void run() {
            lock.lock();
            if (tovar < 3){
                tovar += 1;
                System.out.println("Завоз товара!");
                condition.signal();
            } else {
                System.out.println("Товар есть на складе!");
            }
            lock.unlock();
        }
    }
}
