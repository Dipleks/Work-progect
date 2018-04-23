package Ноябрь_10;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/*BlockingQueue - блокировка очередей.*/
/*Допустим у нас есть 2 очереди потоков,
* 1я очередь достает информацию, 2я ложит.*/
public class Многопоточность_22 {
    public static void main(String[] args) {
        //Queue<String> queue = new PriorityQueue<>(); - если мы запишем так то наш код сломается
        //т.к поток сначало пытается достать информацию, для нормальной работы используем блокировку:
        BlockingQueue queue = new PriorityBlockingQueue();
/*Теперь все будет работать, сначало мы ложим, а потом достаем!*/
        new Thread(){
            @Override
            public void run() {
                //System.out.println(queue.remove());
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                queue.add("this is string");
            }
        }.start();
    }
}
