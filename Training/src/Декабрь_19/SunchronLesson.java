package Декабрь_19;/*Почему синхронизация в многопоточности
плохо! Расмотрим это на примере!*/

import java.util.concurrent.atomic.AtomicInteger;

public class SunchronLesson {
    public static void main(String[] args) {
        //Создадим эксземпляр нашего класса
        //и проверим сколько времени будет затрачено
        //на создания 1000000000 значний
        Count count = new Count();
        long stratTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000_000; i++) {
            count.count();
        }
        System.out.println(System.currentTimeMillis() - stratTime);
    }
    //создадим класс:
    static class Count {
        int i;
//        volatile  int i;
//        AtomicInteger atomicInteger = new AtomicInteger();
        /*synchronized*/ void count(){
            i++;
//            atomicInteger.incrementAndGet();
        }
    }
    /*В первом случаем создание 1000000000 значений заняло 1933 мсек, после того
    * как значение стало volatile времени ушло 5891 мсек, через AtomicInteger
    * было затрачено 5795, теперь проверяем с synchronized, получим аж 21398 мсек.
    * Из примера видно что volatile, AtomicInteger и synchronized значительно замедляют
    * работу приложения и данные подходы, особенно synchronized, следует минимизировать!*/
}
