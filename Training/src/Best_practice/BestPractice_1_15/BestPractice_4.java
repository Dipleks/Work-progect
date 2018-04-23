package Best_practice.BestPractice_1_15;/*Unnecessary objects*/

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class BestPractice_4 {
    public static void main(String[] args) {
        /*Есть два вида создания стрингов:*/
        /* не првильно */
        String str1 = new String("Hello!"); //создается новая в памяти.
        /* правильно */
        String str2 = "Hello2"; //эта страка создется в пуле потоков, т.е если
        // мы сделаем такую же, то она новая не будет создаваться а будет братьсяиз пула.

        /*Когда мы используем обертки то времени на выполнение операции требуется гораздо больше
         * нежели если не применять обертки, т.к при обертках каждый раз создается новый объект:*/
//        long begin = System.currentTimeMillis();
//        long sum = 0L; // затрачено 4319
////        Long sum = 0L; // затрачено 21792
//        for (long i = 0; i < Integer.MAX_VALUE; i++) {
//                sum += i;
//        }
//        System.out.println(sum);
//        System.out.println(System.currentTimeMillis() - begin);

        /*Проверяем сколько времени у нас занимает выполнение кода isBabyBoomer:*/
        BestPractice_4 bestPractice_4 = new BestPractice_4();
        long begin = System.currentTimeMillis();
        for (long i = 0; i < 1_000_000; i++) {
            bestPractice_4.isBabyBoomer(new Date());
        }
        System.out.println(System.currentTimeMillis() - begin); //получим 2260 мсек. - для первого кода;
                                                        //получим 58 мсек. - для второго улучшеного кода.
    }
        /*В следующем примере код работоспособный нормальный, но объект в нем создается 3 раза:*/
//    public boolean isBabyBoomer(Date birctDate){
//        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
//        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
//        Date boomStart = gmtCal.getTime();
//        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
//        Date boomEnd = gmtCal.getTime();
//        return  birctDate.compareTo(boomStart) >= 0 && birctDate.compareTo(boomEnd) < 0;
//    }

        /*Но код можно улучшить, создать все переменные один раз и просто их переиспользовать:*/
     private static final Date BOOM_START;
     private static final Date BOOM_END;
     static {
         Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
         gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
         BOOM_START = gmtCal.getTime();
         gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
         BOOM_END = gmtCal.getTime();
     }
     public boolean isBabyBoomer(Date birctDate){
         return  birctDate.compareTo(BOOM_START) >= 0 && birctDate.compareTo(BOOM_END) < 0;
     }
}
