package Ноябрь_08;
/*Расмотрим синхронизацию статических методов в многопоточности!
* Обычная синхронизация действует на уровне эземпляров, а статическая
* на уровне классов! Совмещать обе синхронизации для одной переменной
* не следует, т.к вывод на консоль будет не точным!*/
public class Многопоточность_4 {
    public static void main(String[] args) throws Exception {
        Schet1.i = 5; //передаем значение i
        Mani1 mani1 = new Mani1();
        Mani1 mani11 = new Mani1();
        mani1.start();
        mani11.start();
        mani1.join();
        mani11.join();
        System.out.println(Schet1.i); //получаем значение i
    }
}
class Mani1 extends Thread {
    Schet1 schet1;
    @Override
    public void run(){
        Schet1.mtod1();
    }
}
class Schet1 {
    static int i;
//В статических методах синхронизация происходит на уровне класса:
//synchronized (Schet1.class) равносильна public synchronized static void mtod1!
    public static void mtod1 (){
        synchronized (Schet1.class){
        int i = Schet1.i;
        i++;
        Schet1.i = i;}
    }
}
//Синхронизация на уровне экземпляра класса принимает вид:
//   synchronized (this){
//       int i = this.i;}
//       i++;
//       this.i = i;

