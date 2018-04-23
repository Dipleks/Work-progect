package Best_practice.BestPractice_16_30;/*SuppressWarnings*/

import java.util.HashSet;
import java.util.Set;
/*Иногда когда мы используем старые джененрики с новыми, может вылететь ошибка.
 * Бороться мы можем с этим с помощью SuppressWarnings:*/

//@SuppressWarnings("unchecked")
public class BestPractice_16 {
    public static void main(String[] args) {
        run();
    }
    public static Set<String> run(){
        @SuppressWarnings("unchecked") //value return from old method
        Set<String> exaltation = new HashSet();
        return  exaltation;
    }
    /*new HashSet() - старый тип;
    * new HashSet<>() - новый тип*/
}
/*
 * Использовать SuppressWarnings не очень хорошо, и этого необходимо избегать!
 * Если мы его всетки используем, то лучше это делать не над классом, а непосредственно
 * над самой переменной! Тем самым свидем до минимума его использование над всем классом.
 * Так же всегда надо добовлять коментарии, для чего был добавлен SuppressWarnings.
 */
