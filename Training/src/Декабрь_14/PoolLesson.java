package Декабрь_14;/*Пул оберток над примитивами.*/

public class PoolLesson {
    public static void main(String[] args) {
        /* == - проверяет что это один и тот же объект*/
//        Integer a = 5;
//        Integer b = a;
//        System.out.println(a == b);
//        a++;
//        System.out.println(a == b);
//        System.out.println(b);
/*Но лучше сравнения производить по икволсу!*/
        Integer a = 100;
        Integer b = 100;
        System.out.println(a != b); // != - показывает что значения не хранятся в одной памяти
        System.out.println(a == b); //вернет true, хотя как бы не должен!
        System.out.println(a.equals(b));
/*Вернулось значения для a == b истина, т.к все значения до 128 хрянятся в пуле!*/
    }
}
