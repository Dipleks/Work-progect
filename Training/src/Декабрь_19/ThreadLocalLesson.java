package Декабрь_19;/*ThreadLocal. Мы можем создать локальные
объекты для потока, которые не будут видны другим потокам!*/

public class ThreadLocalLesson {
    //Пример:
    static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    public static void main(String[] args) throws InterruptedException {
        threadLocal.set("Hello, Dennis!"); //это значение уникально для потока ThreadLocalLesson
        //создадим экземпляры наших потоков и запустим их:
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();
        System.out.println("ThreadLocalLesson" + threadLocal.get());
    }
    //создаем первый поток:
    static class ThreadOne extends Thread {
        @Override
        public void run() {
            threadLocal.set("ThreadOne"); //это значение уникально для потока ThreadOne
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("TreadOne" + threadLocal.get());
        }
    }
    //создаем второй поток:
    static class ThreadTwo extends Thread {
        @Override
        public void run() {
            threadLocal.set("ThreadTwo"); //это значение уникально для потока ThreadTwo
            System.out.println("TreadTwo" + threadLocal.get());
        }
    }
}
