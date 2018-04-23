package Ноябрь_9;
/*Расмотрим, для чего нужен Wait и Notify!*/
/*У нас есть класс Object, у которого есть два
* метода wait и notify!*/
/*Иногда при взаимодействии потоков встает вопрос о
извещении одних потоков о действиях других. Например,
действия одного потока зависят от результата действий
другого потока, и надо как-то известить один поток,
что второй поток произвел некую работу. И для подобных
ситуаций у класса Object определено ряд методов:
  *wait(): освобождает монитор и переводит вызывающий
    поток в состояние ожидания до тех пор, пока другой
    поток не вызовет метод notify();
  *notify(): продолжает работу потока, у которого
    ранее был вызван метод wait().*/
public class Многопоточность_9 {
    public static void main(String[] args) throws InterruptedException {
        ThaedB thaedB = new ThaedB();
        thaedB.start();
        synchronized (thaedB){
            thaedB.wait(); //этот поток ждёт пока выполнятеся 2й поток.
        }
        System.out.println(thaedB.total);
    }
    static class ThaedB extends Thread {
        int total;
        @Override
        public void run() {
            synchronized (this){
                for (int i = 0; i<5; i++){
                    total += i;
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                notify(); //после того как поток завершит свою работу,
                   //как бы сообщает о его завершении и разрешает работу 1му потоку.
            } }}}
/*wait и notify должны быть оба синхронизированы.
* Синхронизация должна происходить на одном объекте(thaedB).*/