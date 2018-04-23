package Ноябрь_08;


/*Класс Thread содержит несколько методов для управления потоками.
    getName() - получить имя потока
    getPriority() - получить приоритет потока
    isAlive() - определить, выполняется ли поток
    join() - ожидать завершение потока
    run() - запуск потока. В нём пишите свой код
    sleep() - приостановить поток на заданное время
    start() - запустить поток
*/
//Учимся создавать потоки!
/*Есть 2 метода создания многопоточности:
* 1й эстендит класс Thread;
* 2й имплементим класс Runnable.*/
/*public class Многопоточность_1 {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
        //Так же у потоков (Thread) есть имена:
        System.out.println(Thread.currentThread().getName()); //вызовем имя потока
    }
}
class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Создадим новый поток!");
        someMethod(); //тут же можно вызвать someMethod
    }
    private void someMethod (){
        throw new RuntimeException();
    }}*/
/*Для всего этого появляется новый стэк, т.е:
* для System.out.println(Thread.currentThread().getName());
* выведется стек (ответ): main;
* для System.out.println(Thread.currentThread().getName());
* выведется стек Thread-0;
* для System.out.println("Создадим новый поток!");
* выведется стек Создадим новый поток!
* для someMethod(); выведется стек: at Ноябрь_08.MyThread.someMethod(Многопоточность_1.java:33)
	at Ноябрь_08.MyThread.run(Многопоточность_1.java:30)*/

import com.sun.org.apache.xml.internal.utils.ThreadControllerWrapper;

//2й метод:
/*public class Многопоточность_1 {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("1й стэк");
        *//*C Runnable не получится как с Thread,
        * его необходимо передеать в конструкторе:*//*
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("2й стэк");
    }
   }
class MyRunnable implements Runnable {
    @Override
    public void run(){
        System.out.println("3й стэк");
    }
}*/
/*Так как у нас одновременно работают несколько потоков,
* то они выполняются не последовательно а хаотично:*/
public class Многопоточность_1 {
    public static void main(String[] args) throws Exception {
        //потоки запускаются только при start!
        //так же мы не можем вызвать повторно поток!
        //Для создания нового потока нам нужно создать новый поток!
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }
}
class MyThread extends Thread {
    @Override
    public void run(){
        for (int i = 0; i<400; i++) {
            System.out.println("Работа потока "+ Thread.currentThread().getName() + " i= " + i);
        }
    }
}
