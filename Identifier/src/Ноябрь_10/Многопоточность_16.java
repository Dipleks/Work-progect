package Ноябрь_10;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*ScheduledExecutorService. Запуск потоков по расписанию!*/
public class Многопоточность_16 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(new MeThraed(), 3, TimeUnit.SECONDS); /*добавляем
           * метод schedule, в нем указываем: поток, время, меру измерения времени*/
        scheduledExecutorService.shutdown();
    }
    static class MeThraed extends Thread {
        @Override
        public void run() {
            System.out.println(1);
        }
    }
}
