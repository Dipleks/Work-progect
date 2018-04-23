package Best_practice.BestPractice_1_15;/*Почему нельзя переиспользовать finalize*/

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class BestPractice_5 {
//    Resource resource; /*1*/
//    Logger logger;
    public static void main(String[] args) {
//        long big = System.currentTimeMillis();
//        List<BestPractice_5> list = new ArrayList<>();
//        for (long i = 0; i < 1_000_000; i++) {
//            list.add(new BestPractice_5()); }
//        System.out.println(System.currentTimeMillis() - big);

        /*1*/
//        try { resource.use();
//        } finally { resource.close();}
// для того чтоб не пришлось долго сидеть и разбираться почему появилась ошибка рименим логирование.
    } /*
     * Время на создание 1000000 объектов потрачено 124 мсек.
     * Теперь переопределим метод finalize:
     */
    @Override
    protected void finalize() throws Throwable {
//        super.finalize();

        /*1*/
//        try {if (resource.isOpen()) {
//                logger.log(logger.getLevel(), "something wend wrong");}
//        } finally { super.finalize();}
    }
    /*
     * С finalize времени потрачено 638.
     * Не лучшее решение будет его примнять:
     *           1. работает медленно.
     *           2. не фак что запустится.
     * Но есть несколько методов когда его необходимо исполльзовать:
     *     1. для логирования ошибок;
     *     2. для нэйтиф методов.
     */
}
