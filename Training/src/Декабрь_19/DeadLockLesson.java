package Декабрь_19;/*Как обнаружить DeadLock (блокировку) в приложении!*/

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class DeadLockLesson {
    public static void main(String[] args) {
        /*Мы можем запустить программу и она у нас зависнет,
        * как обнаружить наш DeadLock:
        * один из способов это с помощью java VisualVM, там мы можем
        * выбрать нашу программу с DeadLock перейти в Threads, в этой вкладке
        * нажимаем Thread Dump ищем наш DeadLock, обычно в самом низу и смотрим где проблема.
        *
        * Так же выявить дедлок можно с помощью самостоятельно написаного кода:*/
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] deadlockedThreads = threadMXBean.findDeadlockedThreads();
        if (deadlockedThreads != null){
            ThreadInfo[] threadInfos = threadMXBean.getThreadInfo(deadlockedThreads);
            for (ThreadInfo info : threadInfos){
                /*при желании из info мы можем получить любую информацию
                * (например, info.getBlockedCount())*/
                System.out.println(info);
            }
        }
    }
}
