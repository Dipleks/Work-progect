package Generics;/*Bounds
В стандартном варианте джененрики имеют методы класса object,
что сильно ограничивает работу, но есть возможность наследовать
классы, что позволит расширить функционал джененриков!*/

import java.io.Serializable;

public class Generics_4 {
    public static void main(String[] args) {
        Celli<Jobi> celli = new Celli<>();
        celli.setT(new Jobi());
        celli.doJobi();
    }
}
class Jobi implements Serializable{
    void doit(){
        System.out.println("do it");
    }
}
//можем также имплементить интерфесы, но не через запятую, а через &
class Celli<T extends Jobi & Serializable> {
    T t;
    public T getT() { return t; }
    public void setT(T t) { this.t = t; }
    public void doJobi(){
        t.doit();
    }
}
