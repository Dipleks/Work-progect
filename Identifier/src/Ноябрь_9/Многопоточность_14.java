package Ноябрь_9;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*Callable*/
/*Очень часто при работе с потоками нам нужно получать
какой-то результат и было бы очень удобно, чтобы поток
сам возвращал результаты своей работы. Именно поэтому еще в
Java 5 был введен интерфейс  java.util.concurrent.Callable.
Он очень похож на интерфейс Runnable, но может вернуть результат
в виде объекта Object и способен бросать исключения.
Интерфейс Callable использует дженерики для определения типа
возвращаемого объекта. Класс Executors предоставляет полезные
етоды для выполнения Callable в пуле потоков. Callable таски
(задачи) возвращают java.util.concurrent.Future объект. Используя
Future мы можем узнать статус Callable таска и получить возвращенный
объект. Это обеспечивает get() метод, который ждет завершение
Callable, чтобы вернуть результат.*/
public class Многопоточность_14 {
    public static void main(String[] args)throws Exception {
        Callable<Integer> callable = new MyCallable(); //создаем наш объект
        FutureTask futureTask = new FutureTask(callable); //реализуем наш интерфейс
        new Thread(futureTask).start(); //запускаем наш интерфейс
        System.out.println(futureTask.get()); //выводим возращенное значение (return). Ответ: 10!
    }
    static class MyCallable implements Callable<Integer>{
        @Override
        public Integer call() throws Exception { //определяем тип возращаемого объекта (Integer)
            int j = 0;
            for (int i = 0; i < 10; i++, j++) {
                Thread.sleep(500); //зададим время вывода (необязательно)
            }
            return j;
        }
    }
}
