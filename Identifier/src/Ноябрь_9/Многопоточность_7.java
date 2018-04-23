package Ноябрь_9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Мы можем создать коллекцию у которой все методы будут синхронизированны:*/
public class Многопоточность_7 {
/*Но данная синхронизация не дает нам гарантии правильности компиляции.
* Для правильного выполнения компиляции нам необходимо синхронизировать
* и все методы:*/
        public static void main(String[] args) throws Exception {
NameList nameList = new NameList();
nameList.add("first");
class MeThread extends Thread{
    @Override
    public void run(){
        System.out.println(nameList.removeFirst()); }}
    MeThread meThread = new MeThread();
    meThread.setName("One");
    meThread.start();
    new MeThread().start(); }
    static class NameList {
        private List list = Collections.synchronizedList(new ArrayList<>());
        //Если мы синхранинируем synchronized String removeFirst, то
        //можем просто записать = new ArrayList<>(), это не будет ошибкой!

    //сделаем метод который будет у нас добавлять листы:
    public synchronized void add(String name){
            list.add(name);
    }
    //и 2й кторорый получает:
    public synchronized String removeFirst(){ //если этот код не синхронизировать,
        //то есть вероятность получить ошибку при выводе на консоль!
        //Так же желательно синхронизировать и остальные методы (add)
        if (list.size()>0){
            if (Thread.currentThread().getName().equals("One")){
                Thread.yield(); }
            return (String)list.remove(0); }
        return null; }}}
