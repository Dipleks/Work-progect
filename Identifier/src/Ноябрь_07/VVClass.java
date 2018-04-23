package Ноябрь_07;

import sun.applet.Main;

/*Определение класса может размещаться внутри определения
    * другого класса. Такие классы называются вложенными или
    * внутренними. Область видимости вложенного класса ограничена
    * областью видимости внешнего класса. Поэтому, если вы
    * создадите класс B внутри класса A, то класс B не сможет
    * существовать независимо от класса A.
    *
    * Внутринние классы используются в основном в программах
    * ПК (т.е это не для вэб), например, у нас есть программа
    * в нем текстовое поле, и при наведении на него мы можем
    * получить какую-либо информацию, вот для этого и применяют
    * внутренние классы!*/
public class VVClass {
    private int a = 5;
    static int q = 7;
    static class StaticClass {
        static void metod4(){
            System.out.println(q);
        }
    }
    /*Для вызова нашей "а" из класса Inner, мы в классе Inner
    создаем метод2, в классе VVClass создаем метод в нем создаём новый Inner
    который вызывает наш метод2 с psvm создаем new VVClass
    который в свою очередь вызывает наш метод. В итоге class Inner
    вызвал нашу "а" из класса VVClass. Так же можно наооборот вызвать
    значение "b" из класса Inner.*/

    public static void main(String[] args) {
        StaticClass.metod4();
        VVClass vvClass = new VVClass();
        vvClass.metod();
        //Inner inner = new Inner(); тут нельзя создать Inner ксласс
        //т.к. данный метод имеет категорию static, а в static
        //нельзя создать другой класс, т.к его нет в его памяти.
        //Статические методы относятся к классу а не к объекту!
        //Но мы можем сделать так:
        /*Inner inner = vvClass.new Inner();
        inner.metod2();*/
    }
    void metod(){
        Inner inner = new Inner();
        inner.metod2();
        System.out.println(inner.b);
    }
    class Inner {
        private int b = 6;
        void metod2() {
            System.out.println(a);
        }
    }
}
/*Для того что бы создать экземпляр внутреннего (new Inner) класса,
* для начала нужно создать экземпляр внешнего класса (new VVClass),
* например:*/
class Seccond{
    void metod3(){
        VVClass.Inner inner = new VVClass().new Inner();
        inner.metod2();
    }
} /*Но если мы вызываем метод2 внутри нашего класса VVClass, то
  * создавать нам подобным образо ничего не нужно, т.к класс VVClass
  * и класс Inner и так имеют связь!!!*/
/*Бывают еще статические внутренние классы, создадим, например,
* класс staticClass после нашего значения а! Он не может получить
* доступ к нашей пременной а. Статический внутренний класс может видеть
* только статические значения, например "q" и запустить мы его можем только из
* статического контеста, т.е StaticClass.metod4(). Если бы наш метод4 был
* не ститческим, то в psvm нам необходимо было бы создать экземпляр
* нашего класса (StaticClass staticClass = new StaticClass)!*/

/*Подитожим, внутренние классы имеют доступ ко всем переменным,
* а стаитческие внутренние классы только к статическим значениям.
* Бывают еще классы внутри методов (void), но они весьма ограничены
* и перименяются крайне редко!*/


