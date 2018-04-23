package ru.sklad;

public class Stat_1 {
    public static void main(String[] args) { //Static - значение позволяющее использовать переменные в любом классе.
        System.out.print(Stat_2.a); //Мы получили доступ к значению "а" класса Stat_2 за счет параметра static

        //Передаем значения функции из класса Stat_2:
        Stat_2.funkziya(" метров.");
        final int s = 23; //Переменная final означает что заданная переменная не может быть изменена
        //Если добавить final в public final class Stat_1, то класс станет финальным и его нельзя будет
        //использовать, например для наследования.
    }
}
