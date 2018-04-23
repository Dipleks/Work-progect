package Ноябрь_10;

import java.util.concurrent.ThreadFactory;

/*ThreadFactory*/
/*ThreadFactory - функциональный интерфейс и может поэтому
использоваться в качестве цели присвоения для ссылки метода
или лямбда-выражения.*/
public class Многопоточность_23 {
    public static void main(String[] args) throws Exception{
        ThreadFactory threadFactory = new ThreadFactory(){ //создаем наш интерфейс
            @Override  //переопределяем его
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable); //создаем новый поток
                thread.setPriority(Thread.MAX_PRIORITY); //задаем приоритет нашему потоку
                return thread;
            }
        };
        threadFactory.newThread(new Myu()).start(); //запускаем класс Myu
    }
    static class Myu implements Runnable{
        @Override
        public void run() {
            System.out.println(1);
        }
    }
}
