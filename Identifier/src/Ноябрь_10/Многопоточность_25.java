package Ноябрь_10;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/*ThreadLocalRandom и TimeUnit*/
public class Многопоточность_25 {
    public static void main(String[] args) throws Exception {
 /*Для вывода случайных чисел в многопоточности
   ипользуют такой метод как ThreadLocalRandom:*/
        System.out.println("случайное число: "+ThreadLocalRandom.current().nextInt());
 /*ThreadLocalRandom возращает нам current, у которого есть свои методы.*/
/*Метод sleep бывает не всегда удобен, например, нам необходимо запускать
* приложение или выключать, или еще что-либо, каждые 14 дней, но
* посчитать такое кол-во дней в миллисекундах давольно не просто.
* Для потоков есть еще метод: TimeUnit, он имеет свой функционал:*/
        //Thread.sleep(TimeUnit.DAYS.toMillis(14));
        //Выведем, например 14 дней в миллисекундах и минутах:
        System.out.println("миллисекунд - "+TimeUnit.DAYS.toMillis(14));
        System.out.println("минут - "+TimeUnit.DAYS.toMinutes(14));
    }
}
