package Ноябрь_10;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/*CyclicBarrier (циклический барьер)*/
/*Данный метод похож на «защелку». Тем не менее они имеют различия.
Циклический барьер позволяет определить объект синхронизации.
Каждый поток выполняется параллельно, и как только каждый
поток достигает барьерную точку, считается что цикл окончен.
Для начало нужно запомнить, что класс CyclicBarrier
предоставляет 2 конструктора:
    CyclicBarrier(int количество)
    CyclicBarrier(int количество, Runnable действие)
Первая форма конструктора позволяет задать количество
потоков которые должны дойти до барьерной точки. Вторая форма
позволяет задать также действие, которое должно выполнится
после достижения барьера всеми потоками. Второму параметру
должен передаваться класс реализующий интерфейс Runnable.
Поток НЕ НУЖНО ЗАПУСКАТЬ самостоятельно, данная утилита это
делает автоматически после достижения барьера.
Для указания потоку о том что он достиг барьера, нужно
вызвать метот await.*/
public class Многопоточность_20 {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Run()); //записываем кол-во наших спортсменов,
                  //и класс который начнет выполнение после отработки Spotsmen (прихода всех спортсменов).
        new Spotsmen(cyclicBarrier);
        new Spotsmen(cyclicBarrier);
        new Spotsmen(cyclicBarrier); }
    static class Run extends Thread{
        @Override
        public void run() {
            System.out.println("Run is begun! - Гонка началась!");
        }}
    static class Spotsmen extends Thread{
        CyclicBarrier barrier;
        public Spotsmen(CyclicBarrier barrier) {
            this.barrier = barrier;
            start(); }
        @Override
        public void run() {
            try { System.out.println("Ждем спортсменов!");
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace(); } }}}
