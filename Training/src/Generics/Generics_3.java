package Generics;/*Generic методы*/

public class Generics_3 {
    public static void main(String[] args) {

    }
    //джинерик методы имеют вид:
    public <T> void method(T t){}
}
/*Внутири классов джинериков мы можем создать методы
джененрики отличного значения от класса:*/
class Dgr<S> {
    //S может быть например String
    S s;
    public void setS(S s) {
        this.s = s;
    }
    //новый метод(Е может быть напиример int значение):
    <E> E getE(E e) {
        return e;
    }
}
