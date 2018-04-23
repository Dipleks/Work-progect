package Java_8;/*default и static методы*/

public class DfandSt_met {
    public static void main(String[] args) {
//        System.out.println(A.add(5, 5));
        A a = new B();
        a.sayHello();
    }
}
interface A {
    //статический метод
    static int add(int x, int y){
        return x + y;
    }
    //
    void printMessage (String message);
    //дэфолтовый метод, помечаем его словом дэфолт и тогда можно писать в нем код
    default void sayHello() {
        printMessage("Hello A");
    }
}
//теперь когда мы его имплементим нам необходимо переопределить только printMessage метод:
class B implements A {
    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }
    //при желании можно переопределить и sayHello
}
//создадим еще интерфейс с таким же методом sayHello
interface C {
    default void sayHello() {
        System.out.println("Hello C");
    }
}
/*Теперь для имплементации "С" нам необходимо его перепределить его метод в классе "В"
* или заэкстендить "А" в "С" и тогда все будет работать, в противном случае, компилятор не
* даст заимплементить интерфес "С"!*/
