package Декабрь_12;/*ReadWrite Lock*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWrite {
    public static void main(String[] args) {

    }
}
class Book{
    String name;
    int buyTime;
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    Lock readLock = readWriteLock.readLock();
    Lock writeLock = readWriteLock.writeLock();
    public void addBuy(){
        writeLock.lock();
        buyTime++;
        writeLock.lock();
    }
    //что бы значения не были разными этот метод должен быть тоже залочен:
    public void howManyBooksWereSale(){
        readLock.lock();
        System.out.println("Books were sale" + buyTime);
        sendReport(buyTime);
        readLock.unlock();
    }
    private void sendReport(int books){

    }
}
