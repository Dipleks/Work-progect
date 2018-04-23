package Generics;/*Whild Card*/
/*Дженерик код и не дженерик код совмещать нельзя!*/
public class Generics_5 {
    static void add(Cellik cellik){
        cellik.setT("hello");
    }
    public static void main(String[] args) {
        Cellik<House> cellik = new Cellik<>();
        add(cellik);
        House house = cellik.getT();
    }
}
class House { }
class Cellik<T>{
    T t;
    public T getT() { return t; }
    public void setT(T t) { this.t = t; }}
/*В результате получим ошибку, т.к совместили дженерик с не дженериком*/