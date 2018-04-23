package Java_8;/*функциональные интерфейсы*/

import java.util.function.*;

public class FunkcInter {
    public static void main(String[] args) {
/*В java есть заготовленные функционльные интерфейсы, дающие нам
* возможность переиспользовать функции. Создадим такой интерфейс
* и сохраним в нем информацию:*/
        Predicate<Integer> predicate = x -> x > 5; //возращает boolean
        //теперь мы можем использовать нашу функцию:
        //передадим например 3 и проверим 3 > 5 или нет.
        System.out.println(predicate.test(3)); //ответ: false
 /*Predicate этот интерфейс добавлен в java 8, у него есть основной метод test
 * остальные дэфолтовые.*/
    /*Таких выражений у нас есть несколько:*/
        Consumer<Integer> consumer = x -> System.out.println(x); //ни чего не возращает
        Function<Integer, String> function = x -> x.toString(); //Integer - входной параметр, String - выходной параметр
        Supplier<Integer> supplier = () -> new Integer(5); //принимает 0 параметров
        UnaryOperator<Integer> unaryOperator = x -> x*x; //принимает Integer возращает Integer.
        BinaryOperator<Integer> binaryOperator = (x, y) -> x*y; //тоже что и UnaryOperator, только с 2мя параметрами.

   /*Это самые основные выражения, их больше, можно погуглить.*/

        //Теперь наш интерфейс можно использовать:
        MyPredicate<Integer> myPredicate = x -> System.out.println(x);
        myPredicate.apply(5);
    }
}
/*Можно написть и свой интерфейс:*/
interface MyPredicate<T>{
    void apply(T t);
}

