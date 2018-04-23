package Best_practice.BestPractice_1_15;/*Переопределение equals*/

public class BestPractice_6 {
    public static void main(String[] args) {
/*
 * 1 правило переопределения: Рефлексия - x.equals(х) true
 * 2 правило переопределения: Симметрия - x.equals(y) = y.equals(x)
 * 3 правило переопределения: Транзитивность - x.equals(y) and y.equals(z) then z.equals(x)
 * 4 правило переопределения: Констинценция - говорит о том что мы не должны пологаться на параметры которые могут изменяться.
 * 5 правило переопределения: non-null - x.equals(null) = false
 *
 * Когда переопеделяем equals, нельзя сравнивать чайдлы с парентами!
 *
 * Переопределяя equals надо переопределять и HashCode!
 */


    }
}
