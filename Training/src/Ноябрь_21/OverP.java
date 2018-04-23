package Ноябрь_21;/*Overloading подробнее*/

import java.io.IOException;

/*Перегрузка метода заключается в следующем —
* вы создаете метод с таким же именем, но с другим
* набором параметров.*/
public class OverP {
//    void method(String s) {
//        System.out.println("string");
//    }
//
//    void method(int i) {
//        System.out.println(1);
//    }
//    public static void main(String[] args) {
//        OverP overP = new OverP();
//        overP.method("string");
//        overP.method(1);
//    }
 /*В этой ситуации у нас все нормально все отработает, но
  * если наши методы будут выглядить следующим образом:*/
//    private synchronized String method(String s) throws IOException {
//        System.out.println("string");
//        return s;
//    }
//    public final void method(int i) throws RuntimeException {
//        System.out.println(1);
//    }
//    public static void main(String[] args) throws IOException{
//        OverP overP = new OverP();
//        overP.method("string");
//        overP.method(1);
//    }
    /*Опять же все отработает, независимо что у метода совершенно разные параметры.
    * Теперь приведем пример, где методы принимают другие классы:*/
    void method(Parent parent) {
        System.out.println("string");
    }
    void method(Ored ored) {
        System.out.println(1);
    }
    public static void main(String[] args) {
        OverP overP = new OverP();
        /*В качестве параметра передадим null. И в данной
        * ситуации, в которой Ored наследует Parent,
         * отработает метод Ored, т.к он стоит по иерархии в
         * самом низу. Но если бы наш класс Ored не унаследовал бы Parent,
         * то мы получили бы ошибку, т.к компилятор не смог бы определить
         * какой метод использовать!*/
        overP.method(null);
    }
}
class Parent{

}
class Ored extends Parent{

}