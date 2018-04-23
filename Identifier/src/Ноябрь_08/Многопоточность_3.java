package Ноябрь_08;

public class Многопоточность_3 {
    /*Переменную i у нас будут выводить 2 потока. Правильным ответом
    * после вывода должно быть 7, но ввиду того что наши потоки выполняются
    * хаотично, то ответ может получится не правильным ("6").
    * Для того что бы избежать данной проблемы нам необходимо
    * наш метод public void mtod сделать синхронизированным
    * (synchronized). Так же мы можем синхронизировать не только
    * метод, но и определенную часть кода. Синхронизация выполняет
    * роль тормоза, как бы тормозит выполнение следующего метода,
    * до тех пор пока не выполнится предыдущий. Таким образом,
    * это позволит нам точно получить правельный ответ "7"*/
    public static void main(String[] args) throws Exception {
        Schet schet = new Schet();
        schet.setI(5); //передаем значение i
        Mani mani = new Mani();
        Mani mani1 = new Mani();
        mani.setSchet(schet);
        mani1.setSchet(schet);
        mani.start();
        mani1.start();
        mani.join();
        mani1.join();
        System.out.println(schet.getI()); //получаем значение i
    }
}
class Mani extends Thread {
    Schet schet;

    public void setSchet(Schet schet) {
        this.schet = schet;
    }
    @Override
    public void run(){
        schet.mtod();
    }
}

class Schet {
    private int i;
//Создавем геторы и сеторы для доступа к приватной i!
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    public synchronized void mtod (){
        int i = this.i;
        i++;
        this.i = i;
    }
}