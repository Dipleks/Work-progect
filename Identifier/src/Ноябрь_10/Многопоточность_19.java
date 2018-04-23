package Ноябрь_10;
/*Exchanger (обменик)*/
/*У программиста может возникнуть ситуация когда два потока
тесно связаны между собой. Предположим один поток формирует
данные, а другой записует эти данные в файл. Поэтому первый
поток передает данные второму потоку. Пока поток 1 формирует
данные, поток 2 занимается созданием файла, проверкой и т.п.
Для того, чтобы передать данные с одного потока в другой поток
в определенной точки работы обоих потоков, используется
специализированная утилита «обменик».
Для понимания данного класса достаточно запомнить, что данный
класс является обобщенным. В качестве параметризатора указывается
тип передаваемых данных. У данного класса нету конструкторов,
но есть один перегруженный метод, который и используется для
передачи.
Пока Writeable создает файл и буфер символьного потока, первый
поток формирует строку. После этого строка из потока Sendable
передается потоку Writeable. Важной особенностью является то, что
первый поток не отправляет данные сразу, несмотря на то, что
формирование данных он закончил. Обменник производит обмен
только в тех точках, где они вызваны. Соответственно, данные
не передаются в Writeable до тех пор пока не покажется вызов
метода exchange (также работа потока приостанавливается, пока
данные не будут переданы ).*/

import java.util.concurrent.Exchanger;

public class Многопоточность_19 {
    public static void main(String[] args) throws Exception{
        Exchanger<String> exchanger = new Exchanger<>();
        new Mike(exchanger);
        new Anket(exchanger);
    }
    static class Mike extends Thread {
        Exchanger<String> exchanger;
        public Mike(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                exchanger.exchange("Меня зовут Майк!");
                sleep(3000);
                exchanger.exchange("Мне 20 лет!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    static class Anket extends Thread{
        Exchanger<String> exchanger;
        public Anket(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                System.out.println(exchanger.exchange("Выполнение 1"));
                System.out.println(exchanger.exchange("Выполнение 2"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
