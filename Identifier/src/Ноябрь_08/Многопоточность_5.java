package Ноябрь_08;
/*Ключевое слово volatile применяется только к переменным
и имеет следующие эффекты в многопоточном программировании:
    1. переменная всегда считывается из основной памяти,
и никогда не кэшируется в память потока, а значит всегда
доступна любому потоку;
    2. при запросах на чтение и запись от нескольких потоков,
системой гарантируется выполнение вначале запросов на запись;
    3. гарантируется атомарность операций чтения/записи,
правда это актуально для переменных только типа long и double,
для остальных типов эти действия и так атомарны. Для всех прочих
операций, как ++, синхронизация делается внешним образом, либо
используются атомарные типы как AtomicInteger из пакета
java.util.concurrent.atomic;
    4. в результе предыдущих пунктов, потоки не блокируются
в ожидании освобождения монитора;
Объектная переменная может равняться null.*/
//Пример:
public class Многопоточность_5 {
    volatile static int i = 0;
    public static void main(String[] args) {
        new MyRead().start();
        new MyWrite().start(); }
    static class MyWrite extends Thread {
        @Override
        public void run(){
            while (i<5) {
                System.out.println("Записываем в память - " + (++i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace(); }}}}
    static class MyRead extends Thread {
        @Override
        public void run(){
            int a = i;
            while (a < 5){
                if (a != i){
                System.out.println("Читаем из памяти - " + i);
                a = i;}}}}}
/*volatile проще, нежели синхронизация и подходит только
для контроля доступа к одиночному экземпляру или переменной
примитивного типа: int, boolean... Когда переменная
объявлена как volatile, любая запись её будет осуществляться
прямо в память, минуя кеш. Также как и считываться будет
прямо из памяти, а не из всевозможного кеша. Это значит,
что все потоки будут "видеть" одно и то же значение
переменной одновременно.*/