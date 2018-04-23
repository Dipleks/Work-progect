package Ноябрь_10;
import java.util.concurrent.CountDownLatch;

/*CountDownLatch (защелка с обратным отсчетом)*/
/*CountDownLatch - данный метод предоставляет возможность
одному потоку ожидать выполнение до тех пор, пока не
выполнится одно или несколько событий.*/
/*CountDownLatch имеет один конструктор, которому
необходимо передать количество событий. Одно выполненное
событие равно одному вызову метода countDown() - данный
метод ничего не возвращает, и ничего не принимает. Чтобы
поток заставить ждать окончания всех событий, необходимо
вызвать метод await. Данный метод имеет две формы:
void await() throws InterruptedException и
boolean await(long сколько, TimeUnit tu) throws InterruptedException.
Первая форма заставляет просто ждать поток окончания событий
(события). Вторая форма позволяет указать время ожидания.*/
public class Многопоточность_18 {
    public static void main(String[] args) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Rabota(countDownLatch);
        new Rabota(countDownLatch);
        new Rabota(countDownLatch);

        countDownLatch.await(); //ждем пока счетчик не опустится до 0.
        System.out.println("счетчик дошел до 0, работа завершена!");
    }
}
class Rabota extends Thread{
    CountDownLatch countDownLatch;

    public Rabota(CountDownLatch countDownLatch) { //создаем контструктор для запуска countDownLatch.
        this.countDownLatch = countDownLatch;
        start();
    }
    @Override
    public void run() {
        try {
            sleep(3000);
            System.out.println("выполнение работы!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("проделанная работа!");
        countDownLatch.countDown();
    }
}