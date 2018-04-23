package Ноябрь_10;
import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

/*ForkJoinFamerwork*/
/*ForkJoinFamerwork - метод позволяющий ускорить выполнение
программы, разбив ее по потокам!*/
//Расмортим на примере:
public class Многопоточность_24 {
//    static long m = 2_000_000_000L; //задаем значение для m.
//    public static void main(String[] args) {
//        System.out.println(new Date());
//        long a = 0;
//        for (int i = 0; i < m; i++) {
//            a += i; }
//        System.out.println(a);
//        System.out.println(new Date());
//    }} //На выполнение опереции ушло 5 сек.
//Теперь ракидаем по потокам:
static long m = 2_000_000_000L;
static int b = Runtime.getRuntime().availableProcessors();
    public static void main(String[] args) throws Exception {
        System.out.println(new Date());
        ForkJoinPool forkJoinPool = new ForkJoinPool(b);
        System.out.println(forkJoinPool.invoke(new MyFork(0, m)));
        System.out.println(new Date());
    }
    static class MyFork extends RecursiveTask<Long> {
        long c, d;
        public MyFork(long c, long d) {
            this.c = c;
            this.d = d;
        }
        @Override
        protected Long compute() {
            if ((d-c)<=m/b){
                long a = 0;
        for (long i = c; i < d; i++) {
            a += i; }
                return a;
            } else {
                long midl = (d+c)/2;
                MyFork f = new MyFork(c, midl);
                f.fork();
                MyFork g = new MyFork(midl + 1, d);
                long ser = g.compute();
        return f.join()+ser; } }}}//На выполнение опереции ушло 2 сек.