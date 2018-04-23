package Ноябрь_22;/*Static Inner Classes - статические внутренние классы.
* У статического класса есть доступ только к статическим переменным и методам!*/

public class StaticInnerClasses {

    private static int i = 5;
    int j = 6;

    static class Inner {
        static int w = i;
        //доступа к j не будет!

        //у нас могут быть енамы:
        enum e {}

        //могут быть методы статические и нет:
        static void staticMethod (){}
        void method (){
            System.out.println("method");
        }

        //конструкторы:
        Inner() {
            System.out.println("constructor");
        }

        int getI(){
            return i;
        }
    }
    //мы можем его наследовать и даже будет работать полиморфизм:
    static class Inner2 extends Inner{}

    class Inner3 extends Inner{
        void method(){
            System.out.println("Inner3");
        }
    }

    public static void main(String[] args) {
        //Можно создать экземпляр класса:
        StaticInnerClasses staticInnerClasses = new StaticInnerClasses();
        Inner inner2 = staticInnerClasses.new Inner3();
        //Inner inner = new Inner();
        //inner.method();
        inner2.method(); //полиморфно вызовется Inner3
    }
}
//Если необходимо вызвать наш класс во внешнем классе,
//то придется создать экземпляр класса StaticInnerClasses:
class OtherClass /*extends StaticInnerClasses.Inner*/{ //возможно даже заэкстендить Inner класс
    public static void main(String[] args) {
        //создадим экземпляр класса Inner:
        StaticInnerClasses.Inner inner = new StaticInnerClasses.Inner();

        //Мы можем даже вызвать приватные значения не находящиеся
        //в этом классе:
        System.out.println(inner.getI());
    }
}
