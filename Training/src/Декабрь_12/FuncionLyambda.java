package Декабрь_12;/*Лямбда выражения!
Java 8 вводит такое понятие, как функциональные интерфейсы и
лямбда-выражения, которые призваны упростить и максимально
очистить программу от бесполезного кода.*/

import java.awt.event.ActionListener;

public class FuncionLyambda {
    public static void main(String[] args) {
/*лямбда выражения имеют вид:*/
//        (x) -> System.out.println("Hello");
/* "x" - это выражение, скобки не обязательны, если выражение одно!
* Все что за знаком -> приведенный вид выражения! У выражения лямбда нет имени,
* т.е этот метод безимянный.
* Эти выражения применяются в основном при работе со стримами, функциональными классами и
* при использовании анонимных классов.*/
    //Пример:
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("bla");
            }
        };
        /*этот код занимает 6 строчек, и его можно назвать длиным,
        * если учитывать то, что нам придется его создавать еще много раз!
        * Лямбда выражения появившиеся в JAVA 8 помогают нам сократить код:*/
        Runnable runnable1 = () -> System.out.println("bla");
        /*Код из 6 строк привратился в одну "()" - выражение/метод,
        * "System.out.println("bla")" - тело метода, если тел несколько, то их помещаем
        * в "{}"* скобки!*/
        ActionListener actionListener = (event) -> System.out.println(event.getActionCommand()); //пример
        final String s = "Hello"; //желательно должен быть финальным!
        ActionListener actionListener1 = (event) -> System.out.println(s); //пример

    }
}
