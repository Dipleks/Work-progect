package Ноябрь_9;
import java.util.concurrent.atomic.AtomicInteger;
/*Атомарные переменные!*/
/*Есть у нас например, некая переменная int i или обертка Integer i
* при создании нескольких потоков, которые будут работать с нашей переменной
* например в диапозоне 10000, могут возникнуть по итогу не верные ответы.
* Допустим наша i должна увеличиваться с каждым новым циклом на 1, то
* в ответе мы должны получить 10000, но вероятность получения правильного
* ответа весьма мала,т.к. паралельные потоки могут как бы накладываться
* друг на друга, что приведет к ответу 9999 или 9993 или др. цифре!
* Что бы этого избежать существует есть такая функция как атомарность!
* Рассмотрим пример.*/
//Без использования атомарности:
/*public class Многопоточность_6 {
    static int i;
    public static void main(String[] args) throws Exception {
        for (int j = 0; j < 10_000; j++)
        {new Atom().start(); }
        Thread.sleep(100);
        System.out.println(i);
    }
    static class Atom extends Thread {
        @Override
        public void run(){
            i++;
        }}}*/
//C использованием атомарности:
public class Многопоточность_6 {
    static AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) throws Exception {
        for (int j = 0; j < 10_000; j++)
        {new Atom().start(); }
        Thread.sleep(100);
        System.out.println(atomicInteger.get());
    }
    static class Atom extends Thread {
        @Override
        public void run(){
            atomicInteger.incrementAndGet();
        }}}
