package Ноябрь_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*wait и notify, пример.*/
public class Многопоточность_10 {
    static List<String> strings = Collections.synchronizedList(new ArrayList<>());
    public static void main(String[] args) {
        new Operator().start(); //вызываем нашего оператора
        new Mashin().start(); //вызываем нашу машину
    }
    static class Operator extends Thread {
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in); //включаем сканер (пишем в консоле текст)
            while (true){
                synchronized (strings){
                    strings.add(scanner.nextLine()); //делаем переход на следующею строку
                    strings.notify(); //сообщаем следующему потоку что мы закончили набор
                }
                try {
                    sleep(500); //ожидаем переход
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static class Mashin extends Thread {
        @Override
        public void run() {
            while (strings.isEmpty()){
                synchronized (strings){
                    try {
                        strings.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace(); }
                    System.out.println(strings.remove(0)); //считываем написанный нами текс и выводим в консоль.
                } } }}}
