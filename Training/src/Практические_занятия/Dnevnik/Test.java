package Практические_занятия.Dnevnik;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(date); //сегодняшняя дата в формате 2018-01-10

        System.out.println(date.getDayOfMonth()); //сегодняшняя дата

        System.out.println(date.plusDays(1).getDayOfMonth()); //получим сегодняшнию дату плюс 1 днеь

        if (date.getDayOfMonth() <= 31) {
            for (int i = 0; i < 365; i++) {
                System.out.println("Date: " + date.plusDays(i).getDayOfMonth()); //выводим даты на год
            }
        }
    }
}
