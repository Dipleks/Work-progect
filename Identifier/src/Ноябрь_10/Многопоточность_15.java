package Ноябрь_10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*ExecutorService*/
/*Интерфес ExecutorService позволяет переиспользовать потоки,
* это очень удобно когда у нас тысячи потоков. Т.е. когда мы пускаем
* новый поток он стартует не в новом потоке, а уже в существующем,
* добавляясь к нему.
* Для работы с потоками нам нужны эзекютеры.
* newSingleThreadExecutor - для работы с одним потоком;
* newFixedThreadPool - для работы с заданным колличеством потоков;
* newCachedThreadPool - не является фиксированным, создает потоки по необходимости,
* имеет тамер (по умолчанию 60 сек.) в течении которого должен добавится новый
* поток, если поток не добавляется то происходи завершение работы метода.*/
public class Многопоточность_15 {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new MyRunnable()); //запускаем MyRunnable
        System.out.println(executorService.submit(new MyCallable()).get());
        executorService.shutdown(); //shutdown ждет завершение выполнения потоков.
                                //shutdownNow прекращает работу потоков.
    }
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(1);
        }
    }
    static class MyCallable implements Callable<String>{
        @Override
        public String call() throws Exception {
            return "2";
        }
    }
}
