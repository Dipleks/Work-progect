package Collections; /*Concurrency package*/

import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class ConcurrencyPackage {
    public static void main(String[] args) {
        //Потокобезопасный лист CopyOnWriteArrayList создает копию
        //оригинального листа и синхронизирует его, лучше всего
        //походит для работы с многопоточностью:
        List<String> list = new CopyOnWriteArrayList<>();

        //тоже что и предыдущая коллекция, скорость работы за счет
        //того, что нет синхронизации во время пробегания по коллекции:
        Set<String> set = new CopyOnWriteArraySet<>();

        BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>();
        BlockingQueue<String> blockingQueue2 = new ArrayBlockingQueue<>(10);
        BlockingQueue<String> blockingQueue3 = new PriorityBlockingQueue<>(10);
        BlockingQueue<String> blockingQueue4 = new SynchronousQueue<>();
        TransferQueue<String> transferQueue = new LinkedTransferQueue<>();
        BlockingDeque<String> blockingDeque = new LinkedBlockingDeque<>();
    }
}
